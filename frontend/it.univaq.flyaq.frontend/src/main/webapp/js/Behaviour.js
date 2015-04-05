function disegna_mappa(data) {
        //carico le icone da utilizzare
        var IconGeneral = L.icon({
            iconUrl: 'icone/marker-256.png',
            iconAnchor: [15, 30],
            popupAnchor: [0, -35],
            iconSize: [30, 30], 
        });

         var IconHome = L.icon({
            iconUrl: 'icone/home-256.png',
            iconAnchor: [15, 30],
            popupAnchor: [0, -35],
            iconSize: [25, 41], 
        });

         var IconCircle = L.icon({
            iconUrl: 'icone/circle-256.png',
            iconAnchor: [15, 30],
            popupAnchor: [0, -35],
            iconSize: [30, 30], 
        });



        var IconMove = "<img src='icone/helicopter-256.png'  height='20' width='20'>";   
        var Icondevice = "<img src='icone/integrated_circuit-256.png'  height='20' width='20'align='center'>";       
        var Iconcom = "<img src='icone/message-256.png'  height='20' width='20' align='center'>";
         
        var marker_pos_drone;    //marker generico che mi indica la posizione del drone
        var percorso = [];       //array per disegnare il percorso di ogni drone


        var colore = ['red','blue','green','orange','brown','fuchsia','grey','yellow'];   //colori utilizzati per il percorso di ogni singolo drone
        var numero_colore;        //operazione in modulo poich�� i colori sono 8 ed i droni sono n

       
        
        // reset di tutti gli elementi del Behaviour su mappa
        if (flyaq.elementi_mappa.length > 0)
                for (i = 0; i < flyaq.elementi_mappa.length; i++)
                        flyaq.map.removeLayer(flyaq.elementi_mappa[i]);
        
        flyaq.elementi_mappa = [];        

         //carico il file json da analizzare
        
            //memorizzo quanti droni ho nella missione
            var numero_droni = data.drones.length;

            //analizzo ogni singolo drone
            for (var i = 0; i <numero_droni; i++) {


                //da dove parte il drone
                var home_drone = data.drones[i].home;
                //sposto la vista della mappa sulla home dell'ultimo drone da disegnare
                flyaq.map.setView([home_drone.latitude, home_drone.longitude], 16);
                //aggiorno l'array con i punti del pecorso di ogni singolo drone
                percorso.push([home_drone.latitude,home_drone.longitude]);

                //creo un div vuoto che sara'� il popup di ogni marker
                var div_popup = document.createElement('div');
                $(div_popup).css({
                   "min-width": "150px"
                });
                //il primo marker ha l'icona a forma di casa poich�� �� la home del drone
                marker_pos_drone = L.marker([home_drone.latitude, home_drone.longitude], {icon: IconHome}).addTo(flyaq.map).bindPopup(div_popup);
 
                //salvo il numero di movimenti che deve eseguire ogni drone
                var num_movimenti = data.drones[i].movements.length;

                 //aggiorno quale colore usare per il drone
                numero_colore = i % colore.length;

                var indice_start;

                    //trovo la posizione (indice) della movement Start nell'array movements e la salvo
                     for (var j = 0; j < data.drones[i].movements.length; j++) {
                      if( filtra_nome("/",data.drones[i].movements[j].eClass) == "Start"){
                          indice_start = j;
                        }
                     }

                     //creo una variabile che ad ogni passo mi dice qual �� stata l'aultima movetransitions esaminata
                    var move_transitions_from = indice_start;
                    //analizzo la oprima che per ora oviamente �� la start
                    analizza_Move(data.drones[i].movements[move_transitions_from]);

                  var behaviour_drone_completato = 0;

                    //ciclo fino a quando non raggiungo lo STOP di ogni drone poich�� uno STOP come uno START c'�� sempre
                  while(behaviour_drone_completato != 1){
                            //scorro le moveTransitions per vedere l'ordine delle movements da eseguire
                            for (var j = 0; j < data.drones[i].moveTransitions.length; j++) {
                                
                                      //se si tratta di un elemento movetransition e quindi non di una choice
                                  if( filtra_nome("/",data.drones[i].moveTransitions[j].eClass) == "MoveTransition"){ 

                                
                                      //prendo la from e la to che mi indicano le movements da fare in ordine
                                      //con filtra nome in pratica ottengo il numero della movement
                                      var from = filtra_nome(".",data.drones[i].moveTransitions[j].from.$ref);
                                      var to = filtra_nome(".",data.drones[i].moveTransitions[j].to.$ref);
                                     
                                      if (from == move_transitions_from)  { 
                                              //esamino la relativa movement
                                              analizza_Move(data.drones[i].movements[to]);
                                              if (filtra_nome("/",data.drones[i].movements[to].eClass) == "Stop"){
                                                behaviour_drone_completato = 1; 
                                              }
                                      //la from diventa la to per passare alla movement successiva da trovare
                                      move_transitions_from = to;

                                      } 

                                     
                               
                                   }
                                   
                                   
                             }
                             
                             
                  }



                //disegno il percorso di ogni singolo drone e pulisco l'array per il drone successivo
                var polyline = L.polyline(percorso,{color: colore[numero_colore],weight: 2}).addTo(flyaq.map);
                //in elementi_mappa ho tutte le cose che disegno per poterle visualizzare e rimuovere a piacimento dell'utente
                flyaq.elementi_mappa.push(polyline);
                percorso = [];
             };
            
       
        

        //dato un carattere(simbolo) ritorna il resto della stringa dall'ultima volta che appare quel carattere(simbolo)
        function filtra_nome(simbolo,stringa){

            if (stringa !== undefined){
             n = stringa.lastIndexOf(simbolo);
             string2 = stringa.substr(n+1);
            }

            return string2;
        }


      function analizza_Move(movements){
      //movements �� un oggetto che arriva dalla funzione principale ed equivale a data.drones[i].movements[j]
      // quindi sto analizzando un'azione(ovviamente oggetto) alla volta
      var nome_Movement = filtra_nome("/",movements.eClass);
  
      //prendo l'elemento popup associato al marker
      var pop = marker_pos_drone.getPopup();
      //prendo il contenuto html del popup (ossia il div)
      var content = pop.getContent();    


        switch(nome_Movement){

          case "Start":                         
	         $(content).append("<b>" +IconMove + " Start</b><br>");
	         //analizzo le pre e post action
	         check_pre_post_action(movements,content);
          break;

          case "Stop":
                          $(content).append("<b>" + IconMove +  " Stop</b><br>");

                         //analizzo le pre e post action
                         check_pre_post_action(movements,content);
          break;

          case "TakeOff":
                          $(content).append("<b>" + IconMove +  " TakeOff</b><br>");
                          $(content).append("Altitude: " +movements.altitude + "<br>");

                         //analizzo le pre e post action
                         check_pre_post_action(movements,content);
          break;

          case "GoTo":                         
                          percorso.push([movements.targetPosition.latitude,movements.targetPosition.longitude]);

                           //poiche' sto per creare un marker nuovo dopo una goto, quello vecchio lo aggiungo neli elementi della mappa 
                           flyaq.elementi_mappa.push(marker_pos_drone);

                           var div_nuovo_popup = document.createElement('div');
                                      //div_popup.id = "test";
                                      $(div_nuovo_popup).css({
                                         "min-width": "150px"
                                     });

                           $(div_nuovo_popup).append("<b>" + IconMove +  " GoTo</b><br>");
                           $(div_nuovo_popup).append("Strategy: " + movements.strategy +"<br>");
                           $(div_nuovo_popup).append("Latitude: " + movements.targetPosition.latitude +"<br>");
                           $(div_nuovo_popup).append("Longitude: " + movements.targetPosition.longitude +"<br>");
                           $(div_nuovo_popup).append("Altitude: " + movements.targetPosition.altitude +"<br>");
                           $(div_nuovo_popup).append("Heading: " + movements.targetPosition.heading + "<br>");

                           //aggiorno il marker corrente creandone uno nuovo quindi marker_pos_drone
                            //che �� globale adesso punta al marker nuovo
                            marker_pos_drone = L.marker([movements.targetPosition.latitude, movements.targetPosition.longitude], {icon: IconGeneral}).addTo(flyaq.map).bindPopup(div_nuovo_popup);
                            
                            //prendo l'elemento popup associato al marker ed aggiornato 
                            var pop = marker_pos_drone.getPopup();
                            //prendo il contenuto html del popup (ossia il div)
                            var content_new = pop.getContent();

                          //analizzo le pre e post action
                          check_pre_post_action(movements,content_new);

                          //adesso �� un marker nuovo e quindi lo aggiungo
                          flyaq.elementi_mappa.push(marker_pos_drone);

          break;

          case "Circle":
                           percorso.push([movements.targetPosition.latitude,movements.targetPosition.longitude]);

                           //disegno un cerchio dove il drone effettuer�� una move circle
                            var circle = L.circle([movements.targetPosition.latitude, movements.targetPosition.longitude], movements.radius,{color: colore[numero_colore],weight: 2}).addTo(flyaq.map);
                            //creo un div vuoto che sar�� il popup del marker del cerchio
                          
                             //inserisci il cerchio negli elementi della mappa
                             flyaq.elementi_mappa.push(circle);
                            //poich�� sto per creare un marker nuovo dopo una goto, quello vecchio lo aggiungo neli elementi della mappa 
                             flyaq.elementi_mappa.push(marker_pos_drone);

                          var div_popup_cerchio = document.createElement('div');
                            $(div_popup_cerchio).css({
                             "min-width": "150px"
                           });

                           $(div_popup_cerchio).append("<b>" + IconMove +  " Circle</b><br>");
                           $(div_popup_cerchio).append("Duration: " + movements.duration +"<br>");
                           $(div_popup_cerchio).append("Radius: " + movements.radius +"<br>");
                           $(div_popup_cerchio).append("Altitude: " + movements.altitude +"<br>");
                           $(div_popup_cerchio).append("clockwise: " + movements.clockwise + "<br>");
                           $(div_popup_cerchio).append("<b>Center:<br>");
                           $(div_popup_cerchio).append("Latitude: " + movements.targetPosition.latitude +"<br>");
                           $(div_popup_cerchio).append("Longitude: " + movements.targetPosition.longitude +"<br>");
                           $(div_popup_cerchio).append("Altitude: " + movements.targetPosition.altitude +"<br>");
                           $(div_popup_cerchio).append("Heading: " + movements.targetPosition.heading + "<br>");

                         

                           //aggiorno il marker corrente creandone uno nuovo quindi marker_pos_drone
                            //che �� globale adesso punta al marker nuovo
                            marker_pos_drone = L.marker([movements.targetPosition.latitude, movements.targetPosition.longitude], {icon: IconCircle}).addTo(flyaq.map).bindPopup(div_popup_cerchio);

                            //prendo l'elemento popup associato al marker ed aggiornato 
                            var pop = marker_pos_drone.getPopup();
                            //prendo il contenuto html del popup (ossia il div)
                            var content_new = pop.getContent();

                          check_pre_post_action(movements,content_new);

                         //adesso �� un marker nuovo e quindi lo aggiungo
                          flyaq.elementi_mappa.push(marker_pos_drone);
          break;

          case "Hover":
                           $(content).append("<b>" + IconMove +  " Hover</b><br>");
                           $(content).append("Duration: " + movements.duration +"<br>");

                           //analizzo le pre e post action
                           check_pre_post_action(movements,content);
          break;

          case "HeadTo":
                           $(content).append("<b>" + IconMove +  " HeadTo</b><br>");
                           $(content).append("Direction: " + movements.direction +"<br>");
                           
                           //analizzo le pre e post action
                           check_pre_post_action(movements,content);
          break; 

          case "Land":
                           $(content).append("<b>" + IconMove +  " Land</b><br>");

                           //analizzo le pre e post action
                           check_pre_post_action(movements,content);
          break;  
           
          default:
            console.log("ERROR: unknown move");
          
          }
      }

      function check_pre_post_action(movements,content){

                        //analizza preaction per questa azione
                         if(movements.preActions !== undefined){
                          $(content).append("<br><i>PreAction:</i> <br>");
                               for (var k = 0; k < movements.preActions.length; k++) {
                                   var azione = movements.preActions[k];
                                   analizza_Azione(azione,content);
                               };
                         }
                         //analizza post action per questaazione
                         if(movements.postActions !== undefined){
                          $(content).append("<br><i>PostAction:</i> <br>");
                              for (var k = 0; k < movements.postActions.length; k++) {
                                       var azione = movements.postActions[k];
                                       analizza_Azione(azione,content);
                                   };
                         }
      
        //dopo aver esaminato completamente una movment e tutte le pre e post action
        //aggiungo una linea per separare questa movement dalla prossima nel div del popup
       $(content).append("<hr>");

      }

      function analizza_Azione(action,content){

          var nome_azione = filtra_nome("/",action.eClass);
          switch(nome_azione){
           
               case "DeviceAction":
                              $(content).append(Icondevice +  " DeviceAction<br>");

                              if(action.parameters !== undefined){
                              for (var z = 0; z < action.parameters.length; z++) {
                                        $(content).append(action.parameters[z].key + ":");
                                       $(content).append(" " + action.parameters[z].value + "<br>");
                                   };
                              }
               break;

               case "Feedback":
                              $(content).append(Iconcom + " Feedback<br>");
                              if(action.parameters !== undefined){
                              for (var z = 0; z < action.parameters.length; z++) {
                                       $(content).append(action.parameters[z].key + ":");
                                       $(content).append(" " + action.parameters[z].value + "<br>");
                                   };
                              }
               break;

               case "CheckNotification":
                              $(content).append(Iconcom + " CheckNotification <br>");
                              $(content).append("Slot: " + action.slot.$ref + "<br>");
               break;

               case "BroadcastNotify":
                             $(content).append(Iconcom + " BroadcastNotify <br>");
                             $(content).append("Slot: " + action.slot.$ref + "<br>");
               break;

               case "MulticastNotify":
                              $(content).append(Iconcom + " MulticastNotify <br>");

                              $(content).append("Slot: " + action.slot.$ref + "<br>");

                              $(content).append("Receiver: ");
                              for (var z = 0; z < action.receiver.length; z++) {
                                       $(content).append(action.receiver[z].$ref + " ");

                                   };
                              $(content).append("<br>");

               break;

               case "UnicastNotify":
                              $(content).append(Iconcom + " UnicastNotify <br>");

                              $(content).append("Slot: " + action.slot.$ref + "<br>");

                              $(content).append("Receiver: " + action.receiver.$ref + "<br>");
               break;
           
              default:
                console.log("ERROR: unknown action");
              
              }
      }
}

function LiveData()
{
        
        if (document.getElementById('live-ros-ip').value != "")
        {
                flyaq.ros_ip = document.getElementById('live-ros-ip').value;                
        }
        else {
                while (flyaq.ros_ip == null)                
                flyaq.ros_ip = prompt("Insert Ros Server IP address:");
                
                document.getElementById('live-ros-ip').value  = flyaq.ros_ip;                
        }
        if (flyaq.button == "OFF")
                comunica();       
}

function comunica(){
      if (flyaq.button == "OFF") {
              flyaq.button = "ON";   
              flyaq.ros = new ROSLIB.Ros({
                url : 'ws://' + flyaq.ros_ip + ':9090'
             });
                
             flyaq.listener = new ROSLIB.Topic({
              ros : flyaq.ros,
              name : '/feedback',
              messageType : 'flyaq/Feedback'
              });
              leggi_feedback();
      } else {
            flyaq.button = "OFF";
            flyaq.listener.unsubscribe();
            
            // cancella marker da mappa
            for (i = 0; i < flyaq.elementi_ROS_mappa.length; i++)
                flyaq.map.removeLayer(flyaq.elementi_ROS_mappa[i]);
            
            // svuota array markers
            flyaq.elementi_ROS_mappa = [];
            
            // cancella elementi HTML
            for (i = 0; i < flyaq.elementi_ROS_body.length; i++)
                $(flyaq.elementi_ROS_body[i]).remove();
                
            flyaq.elementi_ROS_body = [];
            
      }

    function leggi_feedback(){

      //eseguo la subscribe al topic
      flyaq.listener.subscribe(function(message) {
          //analizzo il contenuto del messaggio feedback 
          analizza_messaggio_feedback(message);
      });
    }

      function analizza_messaggio_feedback(feedback_message){

          var nome_div = togli_spazi_stringa(feedback_message.drone )

         //controllo se un div per il drone attuale �� stato gi�� creato
         //poich�� ogni div relativo a un drone ha l'id settato al nome del drone stesso
         var elem = document.getElementById(nome_div);

         if(elem != null){ //se esiste lo aggiorno
                //apro la pagina che arriva da ros e prendo l'immagine del drone    
                var URL = "http://" + flyaq.ros_ip + ":8080/snapshot?topic=/image_raw[sensor_msgs/Image]";
                var img = new Image();
                img.src = URL;
                var div_da_aggiornare = "#" + nome_div;
                var div_interno_immagine_da_aggiornare = "#immagine_" + nome_div;
                var div_interno_dati_da_aggiornare = "#dati_" + nome_div;
                $(div_da_aggiornare).find(div_interno_immagine_da_aggiornare).html(img);

                //preparo la struttura da inserire nel div dei dati
                var dati = "<br>Latitude: " +  feedback_message.latitude +
                           "<br>Longitude: " + feedback_message.longitude +
                           "<br>Altitude: " + feedback_message.altitude +
                           "<br>Speed: " + feedback_message.speed +
                           "<br>Status: " + feedback_message.status +
                           "<br>Msg: " + feedback_message.msg +
                           "<br>Battery percentage: " + feedback_message.battery_percentage +
                            "<br>Battery voltage: " + feedback_message.battery_voltage +
                           "<br>Pitch: " + feedback_message.pitch +
                           "<br>Roll: " + feedback_message.roll +
                            "<br>Yaw: " + feedback_message.yaw +
                            "<br>Heading: " + feedback_message.heading ;  

              //inserisco i parametri
               $(div_da_aggiornare).find(div_interno_dati_da_aggiornare).html(dati);
               aggiorna_posizione_feedback_drone(feedback_message);
          }
         else{  //se non esiste lo creo
              var div= document.createElement('div');
              div.id = nome_div;
              div.title="Dati live dal drone " + feedback_message.drone;

              var div_interno_immagine= document.createElement('div');
              div_interno_immagine.id = "immagine_" + nome_div;
              $(div_interno_immagine).appendTo(div);

              var div_interno_dati= document.createElement('div');
              div_interno_dati.id = "dati_" + nome_div;
              $(div_interno_dati).appendTo(div);
              $(div).hide();    
              $(div).appendTo("body");
              flyaq.elementi_ROS_body.push($(div));

              var IconGeneral = L.icon({
                  iconUrl: 'icone/drone-256.png',
                  iconAnchor: [15, 30],
                  popupAnchor: [0, -35],
                  iconSize: [30, 30], 
              });

              var marker_feedback_drone = L.marker([feedback_message.latitude ,feedback_message.longitude], {icon: IconGeneral,title: feedback_message.drone}).addTo(flyaq.map);

              //quando un marker viene premuto si apre la relativa finestra per i dati live dal feedback      
              marker_feedback_drone.on('click', function (d) {
                  var stringa_appoggio = d.target.options.title;
                  var nome_filtrato = togli_spazi_stringa(stringa_appoggio);
                  var div_live = document.getElementById(nome_filtrato);
                  $(div_live).dialog({dialogClass:"stile_personale"});
              });
            
             flyaq.droni_live.push(marker_feedback_drone);
             flyaq.elementi_ROS_mappa.push(marker_feedback_drone);
           }

      }

    function togli_spazi_stringa(stringa){
      //se ci sono spazi nella stringa li tolgo
      //poich�� jquery nella selezione di un elemento $('elemento') non accetta caratteri vuoti
      //all'interno del selettore
      var str = stringa  
      var nome_pulito = str.replace(/\s/g,''); 
      return nome_pulito;
    }
    
    function aggiorna_posizione_feedback_drone(messaggio_feedback){

      //dal feedback aggiorno il relativo div per i dati live
      for (var i = 0; i < flyaq.droni_live.length; i++) {
            if (flyaq.droni_live[i].options.title == messaggio_feedback.drone){
                var latlng = L.latLng(messaggio_feedback.latitude, messaggio_feedback.longitude );
                flyaq.droni_live[i].setLatLng(latlng);
                flyaq.droni_live[i].update();
            }
      };
    }
}
