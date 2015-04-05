//          ***** Crea JSON missione e invia al server ****

//@ Disabilita il pulsante di clear
function clearDisabilitato() {
    document.getElementById('menu-live-data').disabled = true;
    document.getElementById('menu-start-mission').disabled = true;
}


//@ Avvio della missione
function startMission() {
    if (document.getElementById("menu-start-mission").disabled == false) {
        if (confirm('Are you sure to start?') == true) {
        	var url = document.getElementById('live-ros-ip').value; 
        	if(!url) {
        		url = "127.0.0.1";
        	} 
            ROS.init(document.getElementById('live-ros-ip').value, 9090);
            ROS.startMission();

            document.getElementById('menu-start-mission').disabled = true;
            document.getElementById('menu-stop-mission').disabled = false;
            document.getElementById('menu-exit-editor').style.display = "none";
            document.getElementById('menu-submit-mission').disabled = true;
            document.getElementById('menu-live-data').disabled = true;

            // start the streaming of live data from the drone coming from ROSBridge
            LiveData();
        }
    }
}

//@ Versione LPD
function startMissionLPD() {
    if (document.getElementById("menu-start-mission-LPD").parentNode.className != "disabled") {
        if (confirm('Are you sure to start?') == true) {
            // Interazione con server qui


            // avvio missione confermato
            document.getElementById("menu-start-mission-LPD").parentNode.className = "disabled";
            document.getElementById("menu-stop-mission-LPD").parentNode.className = "";
            document.getElementById("menu-submit-mission-LPD").parentNode.className = "disabled";
            document.getElementById("menu-exit-editor-LPD").style.display = "none";

            document.getElementById('menu-start-mission').disabled = true;
            document.getElementById('menu-stop-mission').disabled = false;
            document.getElementById('menu-exit-editor').style.display = "none";
            document.getElementById('menu-submit-mission').disabled = true;
        }
    }
}

//@ Arresta missione
function stopMission() {
    if (document.getElementById("menu-stop-mission").disabled == false) {
        if (confirm('Are you sure to stop?') == true) {
            ROS.stopMission();
        	

            // stop confermato
            document.getElementById('menu-start-mission').disabled = false;
            document.getElementById('menu-stop-mission').disabled = true;
            document.getElementById('menu-exit-editor').style.display = "";
            document.getElementById('menu-submit-mission').disabled = false;
            document.getElementById('menu-live-data').disabled = false;
        }
    }
}

//@ Versione LPD
function stopMissionLPD() {
    if (document.getElementById("menu-stop-mission-LPD").parentNode.className != "disabled") {
        if (confirm('Are you sure to stop?') == true) {
            // Interazione con server qui


            // avvio missione confermato
            document.getElementById("menu-start-mission-LPD").parentNode.className = "";
            document.getElementById("menu-stop-mission-LPD").parentNode.className = "disabled";
            document.getElementById("menu-submit-mission-LPD").parentNode.className = "";
            document.getElementById("menu-exit-editor-LPD").style.display = "";

            document.getElementById('menu-start-mission').disabled = false;
            document.getElementById('menu-stop-mission').disabled = true;
            document.getElementById('menu-exit-editor').style.display = "";
            document.getElementById('menu-submit-mission').disabled = false;
        }
    }


}

//@ Invio della missione al server
function submitMission() {
    // controllo presenza di tutti i dati
    
//	if(!checkNulls()) {
//		alert("Please, refresh the page.");
//		return false;
//	}

    // creazione missione dai dati locali    
    flyaq.missione = createJsonMission();
    flyaq.missioneJson = JSON.stringify(flyaq.missione);
    //    if(flyaq.missioneJson.charAt( flyaq.missioneJson.length-1 ) == '=' || 
    //    		flyaq.missioneJson.charAt( flyaq.missioneJson.length-1 ) == ':')
    //    	flyaq.missioneJson = flyaq.missioneJson.slice(0, -1);
    console.log(flyaq.missione);

    // creazione contesto dai dati locali
    flyaq.contesto = createJsonContext();
    flyaq.contestoJson = JSON.stringify(flyaq.contesto);
    //    if(flyaq.contestoJson.charAt( flyaq.contestoJson.length-1 ) == '=' ||
    //    		flyaq.contestoJson.charAt( flyaq.contestoJson.length-1 ) == ':')
    //    	flyaq.contestoJson = flyaq.contestoJson.slice(0, -1);
    console.log(flyaq.contesto);

    // POST missione sul server
    //        $.post(flyaq.baseURL + "/api/v1/mission/" + flyaq.idutente, flyaq.missioneJson)        
    //        .fail(function( jqxhr, textStatus, error ){alert('Mission API Rest POST problem ' + error + ': ' + textStatus);});

    // POST contesto sul server
    //       $.post(flyaq.baseURL + "/api/v1/context/" + flyaq.idutente, flyaq.contestoJson)        
    //        .fail(function( jqxhr, textStatus, error ){alert('Context API Rest POST problem ' + error + ': ' + textStatus);});

    var missionError = false,
        contextError = false;
    $.when($.post(flyaq.baseURL + "/api/v1/mission/" + flyaq.idutente, flyaq.missioneJson)
        .fail(function(jqxhr, textStatus, error) {
            missionError = true;
        }),
        $.post(flyaq.baseURL + "/api/v1/context/" + flyaq.idutente, flyaq.contestoJson)
        .fail(function(jqxhr, textStatus, error) {
            contextError = true;
        }))
        .then(
            function() {
                if (!missionError && !contextError) {
                    $.getJSON(flyaq.baseURL + '/api/v1/behaviour/' + flyaq.idutente)
                        .done(function(data) {
                            flyaq.behaviour = data;
                            flyaq.behaviourJson = JSON.stringify(flyaq.behaviour);
                            disegna_mappa(data);
                            // mostra i risultati
                            document.getElementById('menu-vista-behaviour').style.display = "";
                            document.getElementById('menu-start-mission').disabled = false;

                            // LPD ossia schermi piccoli
                            document.getElementById('menu-start-mission-LPD').parentNode.className = "";
                        }).fail(function(jqxhr, textStatus, error) {
                            alert('Behaviour API Rest GET problem ' + error + ': ' + textStatus);
                        });
                } else alert('Mission or Context API Rest POST error!');
            }, function() {
                alert('Mission-Context to Behaviour error!');
            });


    // GET behaviour dal server
    /* simulazione richiesta behaviour */
    /*$.getJSON("behaviour.json", function(data){
        flyaq.behaviour = data;
        flyaq.behaviourJson = JSON.stringify(flyaq.behaviour);
        disegna_mappa(data);
        
        // mostra i risultati
        document.getElementById('menu-vista-behaviour').style.display = "";
        document.getElementById('menu-start-mission').disabled = false;
        
        // LPD ossia schermi piccoli
        document.getElementById('menu-start-mission-LPD').parentNode.className = "";        
    });*/
    /* ...... */
    /*
        $.getJSON('/api/v1/behaviour/' + flyaq.idutente)
        .done(function(data){
            flyaq.behaviour = data;
            flyaq.behaviourJson = JSON.stringify(flyaq.behaviour);
            disegna_mappa(data);
            // mostra i risultati
            document.getElementById('menu-vista-behaviour').style.display = "";
            document.getElementById('menu-start-mission').disabled = false;
        
            // LPD ossia schermi piccoli
            document.getElementById('menu-start-mission-LPD').parentNode.className = ""; }
            )
        .fail(function( jqxhr, textStatus, error ){alert('Behaviour API Rest GET problem ' + error + ': ' + textStatus);}
        );   
    */
}

//@ Crea flotta per JSON missione
// esclude il marker tra i dati dei droni
function createMissionFlotta(f) {
    t = {
        eClass: flyaq.FLOTTA_CLASS,
        drones: new Array()
    };

    for (j = 0; j < f.drones.length; j++) {
    	if (f.drones[j] == null) continue;
        t.drones[t.drones.length] = {
            type: f.drones[j].type,
            home: f.drones[j].home,
            eClass: f.drones[j].eClass,
            name: f.drones[j].name
        };
    }

    return t;
}

//@ Crea JSON contesto
function createJsonContext() {

    // crea struttura generale del context
    context = {
        '@ns': {
            "context": "http://www.flyaq.it/context"
        },
        eClass: flyaq.CONTEXT_CLASS,
        name: "context1",
        crs: "wgs84",
        noFlyAreas: new Array(),
        obstacles: new Array(),
        emergencyAreas: new Array()
    };

    // aggiunge le varie aree nel giusto array
    for (k = 0; k < flyaq.contesto_seq.length; k++) {
    	if (flyaq.contesto_seq[k] == null) continue;
        obj = flyaq.contesto_seq[k];

        if (obj.name == "No Fly Areas") {
            // creo un nuovo oggetto
            context.noFlyAreas[context.noFlyAreas.length] = {
                name: obj.name + k,
                eClass: flyaq.NOFLY_CLASS
            };

            // copio i parametri
            if (obj.eStructuralFeatures != undefined)
                for (j = 0; j < obj.eStructuralFeatures.length; j++)
                    context.noFlyAreas[context.noFlyAreas.length - 1][obj.eStructuralFeatures[j].name] = obj.eStructuralFeatures[j].value;

            // imposto i vertici dell'area
            context.noFlyAreas[context.noFlyAreas.length - 1]["shell"] = new Array();

            for (j = 0; j < obj.points.length; j++)
                context.noFlyAreas[context.noFlyAreas.length - 1].shell[j] = {
                    latitude: obj.points[j].lat,
                    longitude: obj.points[j].lng,
                    eClass: flyaq.COORDINATE_CLASS2
                };
        } else if (obj.name == "Obstacles") {
            // creo un nuovo oggetto
            context.obstacles[context.obstacles.length] = {
                name: obj.name + k,
                eClass: flyaq.OBSTACLE_CLASS
            };

            // copio i parametri
            if (obj.eStructuralFeatures != undefined)
                for (j = 0; j < obj.eStructuralFeatures.length; j++)
                    context.obstacles[context.obstacles.length - 1][obj.eStructuralFeatures[j].name] = obj.eStructuralFeatures[j].value;

            // imposto i vertici dell'area
            context.obstacles[context.obstacles.length - 1]["shell"] = new Array();

            for (j = 0; j < obj.points.length; j++)
                context.obstacles[context.obstacles.length - 1].shell[j] = {
                    latitude: obj.points[j].lat,
                    longitude: obj.points[j].lng,
                    eClass: flyaq.COORDINATE_CLASS2
                };
        } else if (obj.name == "Emergency Areas") {
            // creo un nuovo oggetto
            context.emergencyAreas[context.emergencyAreas.length] = {
                name: obj.name + k,
                eClass: flyaq.EMERGENCY_CLASS
            };

            // copio i parametri
            if (obj.eStructuralFeatures != undefined)
                for (j = 0; j < obj.eStructuralFeatures.length; j++)
                    context.emergencyAreas[context.emergencyAreas.length - 1][obj.eStructuralFeatures[j].name] = obj.eStructuralFeatures[j].value;

            // imposto i vertici dell'area
            context.emergencyAreas[context.emergencyAreas.length - 1]["shell"] = new Array();

            for (j = 0; j < obj.points.length; j++)
                context.emergencyAreas[context.emergencyAreas.length - 1].shell[j] = {
                    latitude: obj.points[j].lat,
                    longitude: obj.points[j].lng,
                    eClass: flyaq.COORDINATE_CLASS2
                };
        }
    }

    return context;

}


//@ Crea JSON mission
function createJsonMission() {

	nome = document.getElementById("mission-name").value;
    // crea la struttura generale della mission
    missione = {
        "@ns": {
            mission: "http://www.flyaq.it/mission"
        },
        name: nome,
        crs: "wgs84",
        tasks: new Array(),
        taskDependencies: new Array(),
        swarm: new Array(),
        eClass: flyaq.MISSION_CLASS
    };

    // aggiunge i NameSpace delle estensioni
    for (k = 0; k < flyaq.nsExt.length; k++) {
        missione['@ns'][flyaq.nsExt[k]] = "http://www.flyaq.it/" + flyaq.nsExt[k];
    }

    // aggiunge la lista dei task (compresi i task di controllo FORK e JOIN)
    //forking = false;
    //isParallel = false;
    //var k1 = -1;
    elencoChecks = $('#elenco-task-elenco tr');
    for (k = 0; k < flyaq.task_seq.length; k++) {

        /*
        // controllo per inserimento FORK task
        if (!forking && k + 1 < flyaq.task_seq.length && $('#elenco-task-elenco tr')[k + 1].childNodes[3].childNodes[0].checked)
        {
            missione.tasks[missione.tasks.length] = forkTask;
            forking = true;
        }
        
        // controllo per inserimento JOIN task
        else if (forking && !$('#elenco-task-elenco tr')[k].childNodes[3].childNodes[0].checked)
        {
            missione.tasks[missione.tasks.length] = joinTask;
            forking = false;
        }*/

        // imposta le dipendenze dei task
//        if (elencoChecks[k1].childNodes[3].childNodes[0].checked && k1 > 0) {
//            if (!isParallel) isParallel = true;
//        }
        
        if(k > 0) {
	        missione.taskDependencies[missione.taskDependencies.length] = {
	                eClass: flyaq.TASKDEP_CLASS,
	                from: {
	                    $ref: "//@tasks." + (k - 1),
	                    eClass: flyaq.task_seq[k - 1].nsPrefix + '://' + flyaq.task_seq[k - 1].name
	                },
	                to: {
	                    $ref: "//@tasks." + (k),
	                    eClass: flyaq.task_seq[k].nsPrefix + '://' + flyaq.task_seq[k].name
	                }
	            };
        }

        // copia nome/posizione iniziale del task
        //tid = $('#elenco-task-elenco tr')[k].childNodes[1].childNodes[1].value;
        missione.tasks[missione.tasks.length] = {
            //name: flyaq.task_seq[k].name + "_" + k,
            name : flyaq.task_seq[k].taskName,
        	initialPosition: flyaq.task_seq[k].initialPosition,
            eClass: flyaq.task_seq[k].nsPrefix + '://' + flyaq.task_seq[k].name
        };

        // copia i punti rilevanti del task
        if (flyaq.task_seq[k].tipo == "PointTask") {
            missione.tasks[missione.tasks.length - 1]["point"] = new Array();
            for (j = 0; j < flyaq.task_seq[k].points.length; j++)
                missione.tasks[missione.tasks.length - 1].point[j] = {
                    latitude: flyaq.task_seq[k].points[j].lat,
                    longitude: flyaq.task_seq[k].points[j].lng,
                    eClass: flyaq.COORDINATE_CLASS
                };
        } else if (flyaq.task_seq[k].tipo == "LineTask") {
            missione.tasks[missione.tasks.length - 1]["points"] = new Array();
            for (j = 0; j < flyaq.task_seq[k].points.length; j++)
                missione.tasks[missione.tasks.length - 1].points[j] = {
                    latitude: flyaq.task_seq[k].points[j].lat,
                    longitude: flyaq.task_seq[k].points[j].lng,
                    eClass: flyaq.COORDINATE_CLASS
                };
        } else {
            missione.tasks[missione.tasks.length - 1]["shell"] = new Array();
            for (j = 0; j < flyaq.task_seq[k].points.length; j++)
                missione.tasks[missione.tasks.length - 1].shell[j] = {
                    latitude: flyaq.task_seq[k].points[j].lat,
                    longitude: flyaq.task_seq[k].points[j].lng,
                    eClass: flyaq.COORDINATE_CLASS
                };
        }

        // copia i parametri
        if (flyaq.task_seq[k].eStructuralFeatures != undefined)
            for (j = 0; j < flyaq.task_seq[k].eStructuralFeatures.length; j++)
                if (flyaq.task_seq[k].eStructuralFeatures[j].value != undefined)
                    missione.tasks[missione.tasks.length - 1][flyaq.task_seq[k].eStructuralFeatures[j].name] = flyaq.task_seq[k].eStructuralFeatures[j].value;
                else missione.tasks[missione.tasks.length - 1][flyaq.task_seq[k].eStructuralFeatures[j].name] = valoreDefault(flyaq.task_seq[k].eStructuralFeatures[j]);
    }
    /*
        // controllo per inserimento ultimo JOIN task
        if (forking)
        {
            missione.tasks[missione.tasks.length] = joinTask;
        }
    */

    // Se ci sono stati fork aggiunge i due task speciali
    // TODO commented by Ivano
//    if (isParallel) {
//        missione.tasks[missione.tasks.length] = forkTask;
//        missione.tasks[missione.tasks.length] = joinTask;
//    }

    // aggiunge la flotta dei droni
    missione.swarm = createMissionFlotta(flyaq.flotta);

    return missione;
}

function valoreDefault(d) {
    tipoDiDato = d.eType.$ref.substr(tipoDiDato.lastIndexOf("/") + 1);

    if (tipoDiDato == "Eint") return "0";
    else if (tipoDiDato == "EFloat") return "0.0";
    else if (tipoDiDato == "EBoolean") return "false";
    else if (tipoDiDato == "EString") return "";
    else return d.defaultValueLiteral;

}
