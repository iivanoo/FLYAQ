//          ***** Editazione aree per task e contesti *******

//@ avvia la modalita' di editazione
function editazione(tid, isCtx, id, tipo, modelSelected)
{
    flyaq.task_id = tid;
    if (isCtx) flyaq.task_model = clone(flyaq.paletteContext[id]);
    else flyaq.task_model = clone(flyaq.paletteTask[id]);
    flyaq.contesto = isCtx;
    
    // seleziona modello
    flyaq.modelSelected = modelSelected;
    flyaq.modelSelected.parentNode.style.backgroundColor = "#cfcfcf";
    
    if (tipo == 'PolygonTask') {
    	document.getElementsByClassName("leaflet-draw-draw-polygon")[0].click(); flyaq.tipoPol = "PolygonTask";
    }
    else if (tipo == 'LineTask') {
    	document.getElementsByClassName("leaflet-draw-draw-polyline")[0].click(); flyaq.tipoPol = "LineTask";
    	}
    else if (tipo == 'PointTask') {
    	document.getElementsByClassName("leaflet-draw-draw-marker")[0].click(); flyaq.tipoPol = "PointTask";
    	}
}

//@ salva area editata
function editSave(obj)
{
    // deseleziona modello
    flyaq.modelSelected.parentNode.style.backgroundColor = "";
    
    // calcola id del task/contesto
    if (flyaq.contesto) 
    	oid = flyaq.contesto_seq.length;
    //else oid = flyaq.task_seq.length;
    else {
    	flyaq.globalTaskID = flyaq.globalTaskID + 1;
    }
    
    // salva il task/contesto nelle proprie sequenze
    if (flyaq.contesto) 
    	flyaq.contesto_seq[oid] = flyaq.task_model;    
    //MIRCO
    //else flyaq.task_seq[oid] = flyaq.task_model;
    else {
    	flyaq.task_model.taskName = flyaq.task_id + '_' + flyaq.globalTaskID;
    	temp = flyaq.task_seq.push(flyaq.task_model);
    	oid = temp -1;
    }
    
    // aggiungi il task alla sequenza visiva
    if (!flyaq.contesto) 
    	document.getElementById("elenco-task-elenco").innerHTML += genTaskSeq(flyaq.task_id, flyaq.globalTaskID);
    
    // stato checkbox
    ripristinaCheckbox('#elenco-task-elenco');
    
    
    // aggiungi popup con proprieta' e info del task/contesto
    if (flyaq.contesto) {
        flyaq.contesto_pol[oid] = obj;
        obj.bindPopup(genContestoPopup(flyaq.task_model, oid));
    }
    else {
    	//MIRCO
    	//flyaq.task_pol[oid] = obj;
    	flyaq.task_pol.push(obj);
        obj.bindPopup(genTaskPopup(flyaq.task_model));
    }
    
    // imposta le caratteristiche del poligono da disegnare
    colore = flyaq.task_model.color;
    if (colore.indexOf('#') == -1) 
    	colore = '#' + colore;
    obj.options.color = colore;
    
    if (flyaq.tipoPol == "LineTask") 
    	obj.options.weight = "5";
    else obj.options.weight = "2";
    
    // aggiungi alla mappa    
    obj.addTo(flyaq.map);
    
    // aggiorna indici
    aggiornaIndici();
    
    // salva le coordinate nel task in sequenza e la posizione iniziale
    if (flyaq.tipoPol != "PointTask"){
        if (!flyaq.contesto) {
        	flyaq.task_seq[oid].points = obj.getLatLngs();
        	flyaq.task_seq[oid].initialPosition = {latitude: flyaq.task_seq[oid].points[0].lat, longitude: flyaq.task_seq[oid].points[0].lng};
            posizioneIniziale(flyaq.task_seq[oid], obj);
        } else {
        	flyaq.contesto_seq[oid].points = obj.getLatLngs();
        }   
    }
    else {
        if (!flyaq.contesto) {
        	flyaq.task_seq[oid].points = new Array(obj.getLatLng());
        	flyaq.task_initM.push(null);
        }
        else 
        	flyaq.contesto_seq[oid].points = new Array(obj.getLatLng());
    }
    // salva il tipo di disegno del task
    if (!flyaq.contesto) 
    	flyaq.task_seq[oid].tipo = flyaq.tipoPol;
}

//@ aggiorna proprieta' del task
function aggiornaProprieta(id, isCtx)
{
	var i = 0;
    // riporta la lista delle nuove propriet�
    lista = $('#task-popup-props tr');
    questo_task = null;
    questo_pol = null;
    
    // aggiorna le proprieta'
    if (isCtx) {
        questo_task = flyaq.contesto_seq[id];
        questo_pol = flyaq.contesto_pol[id];}
    else {
    	var trovato = false;
    	while (i < flyaq.task_seq.length && !trovato) {
    		if(flyaq.task_seq[i].taskName == id) {
    			questo_task = flyaq.task_seq[i];
    			questo_pol = flyaq.task_pol[i];
    			trovato = true;
    		}
    		else 
    			i++;
    	}
    	//questo_task = flyaq.task_seq[id];
    	//questo_pol = flyaq.task_pol[id];
    }
    
    for (k = 0; k < questo_task.eStructuralFeatures.length; k++)
            if (lista[k].childNodes[1].childNodes[0].type != "checkbox") {
                    if (!lista[k].childNodes[1].childNodes[0].validity.badInput)
                    	questo_task.eStructuralFeatures[k].value = lista[k].childNodes[1].childNodes[0].value;
                    else {
                        questo_pol.closePopup();
                        alert('Bad value inserted!');
                    }
            } else
                if (lista[k].childNodes[1].childNodes[0].checked) 
                	questo_task.eStructuralFeatures[k].value = 'true';
                else 
                	questo_task.eStructuralFeatures[k].value = 'false';
    
    
    
    
    // aggiorna e chiude il popup
    if (isCtx)
    {
        //flyaq.contesto_pol[id].closePopup();
        flyaq.contesto_pol[id].unbindPopup();
        flyaq.contesto_pol[id].bindPopup(genContestoPopup(questo_task, id));        
    }
    else {
        //flyaq.task_pol[id].closePopup();
        flyaq.task_pol[i].unbindPopup();
        flyaq.task_pol[i].bindPopup(genTaskPopup(questo_task));        
    }
}

//@ imposta posizione iniziale del task
function posizioneIniziale(questo_task, poligono)
{       
	// disegna il marker per la posizione iniziale
    if (questo_task.initialPosition == null) {
    	vertice = poligono.getLatLngs()[0];
    } else {
    	vertice = L.latLng(questo_task.initialPosition.latitude, questo_task.initialPosition.longitude);
    }
    
    //var ind = flyaq.task_initM.push(L.marker(vertice, {title: "Drag to choose initialPosition of drones in this task."}));
    var marker = L.marker(vertice, {title: "Drag to choose initialPosition of drones in this task."});    
    flyaq.task_initM.push(marker);
    marker.addTo(flyaq.map);
    
    marker.snapediting = new L.Handler.MarkerSnap(flyaq.map, marker);
    marker.snapediting.addGuideLayer(poligono);
    marker.snapediting.enable();
    
    L.DomUtil.addClass(marker._icon, 'marker-snapped');
    
    var enable_set_home = false;
    
    marker.on('dragend', function(e){
        if (enable_set_home) {
	        questo_task.initialPosition = {latitude: e.target.getLatLng().lat, longitude: e.target.getLatLng().lng};
	        poligono.unbindPopup();
	        
	        poligono.bindPopup(genTaskPopup(questo_task, id));
        } else {
	        if (questo_task.initialPosition != undefined) {
	        	marker.setLatLng(L.latLng(questo_task.initialPosition.latitude, questo_task.initialPosition.longitude));
	        } else {
	        	marker.setLatLng(poligono.getLatLngs()[0]);
	        }        
	    }
        //map.removeLayer(marker);
    });
    
    marker.on('snap', function(layer, latlang){enable_set_home = true;});
    marker.on('unsnap', function(layer){enable_set_home = false;});
        
    
    poligono.closePopup();
}


//@ salva lo stato delle checkbox
function ripristinaCheckbox(idSeq)
{
    seq = $(idSeq + ' tr');
    
    for (k = 0; k < seq.length; k++)
    {
        if (flyaq.stato_checkbox[k] != null) 
        	seq[k].childNodes[3].childNodes[0].checked = flyaq.stato_checkbox[k];
    }
}


//@ ripristina lo stato delle checkbox
function salvaCheckbox(idSeq)
{
    seq = $(idSeq + ' tr');
    
    flyaq.stato_checkbox = new Array();
    
    for (k = 0; k < seq.length; k++)
    {
        flyaq.stato_checkbox[flyaq.stato_checkbox.length] = seq[k].childNodes[3].childNodes[0].checked;
    }
    return seq;
}