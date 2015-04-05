//              **** Droni ****

//@ genera elemento dei modelli dei droni
function genModelDroni(drone, id) {
    modDrone = '<option icona="' + drone.icon + '" value="' + id + '" id="droni-' + id + '">' + drone.name + '</option>';

    return modDrone;
}

//@ genera elemento della flotta dei droni
function genDroneFlotta(dType, id) {
    droneFlotta = '<tr id="drone-flotta-' + id + '"><td><img class="iconaDrone" height="25" width="25" src="' + flyaq.paletteDroni[dType].icon + '"/></td><td>' + flyaq.paletteDroni[dType].name + ' #' + id + '</td>' + '<td style="width:80px"><button class="btn" style="float: right;" onclick="flottaRimuoviDrone(' + id + ');"><i class="icon-minus"></i></button>' + '<button class="btn" style="float: right;" onclick="flottaSetHome(' + id + ')"><i class="icon-home"></i></button></td></tr>';

    return droneFlotta;
}

//@ genera popup per la Home del drone
function genDronePopup(tipo, id) {
    popup = '<span>Home for drone:</span><br>' + '<span><b>' + tipo + ' #' + id + '</b></span>';

    return popup;
}

//             **** Task ******

//@ genera elemento dei modelli dei task
function genModelTask(task, id) {
    // recupera il tipo di task da disegnare
    Ttipo = task.eSuperTypes[0].$ref;
    Ttipo = Ttipo.substring(Ttipo.lastIndexOf('/') + 1);

    modTask = '<tr><td><img onerror="imgFault(this, \'' + Ttipo + '\');" height="25" width="25" src="' + task.icon + '" alt="icona"/></td>';

    modTask += '<td onclick="editazione(\'' + task.name + '\', false, ' + id + ', \'' + Ttipo + '\', this);">' + task.name + '</td></tr>';

    return modTask;
}

//@ Caricamento immagine da fallimento
function imgFault(obj, tipo) {
    if (tipo == "PolygonTask") {
        obj.src = "icone/poligono.png";
    } else if (tipo == "LineTask") {
        obj.src = "icone/linea.png";
    } else if (tipo == "PointTask") {
        obj.src = "icone/punto.png";
    }

}

//@ genera elemento della sequenza del task
function genTaskSeq(tid, id) {
	var taskName = tid + '_' + id;
    seqTask = '<tr id="' + taskName + '"><td style="width: 10%; border-right: 1px dotted silver;"></td>' + '<td title="Properties" onclick="apriPopup(\'' + taskName + '\')"><i>' + taskName + '</i><input type="hidden" value="' + id + '"/></td>' + '<td style="width: 30%; border-right: 1px dotted silver;">' + '<i class="icon-arrow-up" title="Move up" onclick="altoTaskSeq(\'' + taskName + '\')"></i>' + '<i class="icon-arrow-down" title="Move down" onclick="bassoTaskSeq(\'' + taskName + '\')"></i>' + '<i class="icon-remove" title="Delete" onclick="cancTaskSeq(\'' + taskName + '\')"></i></td>' + '<td><input class="checkbox-tabella" disabled title="Parallelize with previous" type="checkbox" onclick="salvaCheckbox(\'#elenco-task-elenco\');aggiornaIndici();"/></td></tr>';

    return seqTask;
}

//@ genera il popup del task con le proprieta' 
function genTaskPopup(obj) {
    // intestazione
    popup = '<div class="popupWin"><h5>' + obj.taskName + '</h5>' + '<table id="task-popup-props" class="popup"><tbody>';

    // lista delle proprieta' editabili
    if (obj.eStructuralFeatures != null)
        for (k = 0; k < obj.eStructuralFeatures.length; k++) {
            popup += '<tr><td>' + obj.eStructuralFeatures[k].name + '</td>';
            tipoDiDato = obj.eStructuralFeatures[k].eType.$ref;
            tipoDiDato = tipoDiDato.substr(tipoDiDato.lastIndexOf("/") + 1);
            stepNum = "";

            if (tipoDiDato == "EInt") {
                tipoDiDato = "number";
                stepNum = 1;
            } else if (tipoDiDato == "EFloat") {
                tipoDiDato = "number";
                stepNum = 0.001;
            } else if (tipoDiDato == "EBoolean") {
                tipoDiDato = "checkbox";
            } else if (tipoDiDato == "EString") {
                tipoDiDato = "text";
                stepNum = "";
            } else {
                stepNum = tipoDiDato;
                tipoDiDato = "enum";
            }


            if (obj.eStructuralFeatures[k].value != null) 
            	valore = obj.eStructuralFeatures[k].value;
            else 
            	if (obj.eStructuralFeatures[k].defaultValueLiteral != null) 
            		valore = obj.eStructuralFeatures[k].defaultValueLiteral;
            	else 
            		valore = "";

            if (tipoDiDato == "enum") {
                popup += '<td><select onblur="aggiornaProprieta(\'' + obj.taskName + '\', false)" class="popupParametro popupSelect">';

                // inserisco le opzioni della scelta
                for (j = 0; j < flyaq.paletteTypes.length; j++) {
                    if (flyaq.paletteTypes[j].name == stepNum) {
                        for (w = 0; w < flyaq.paletteTypes[j].eLiterals.length; w++) {
                            if (flyaq.paletteTypes[j].eLiterals[w].name == valore)
                                seleziona = 'selected="selected"';
                            else seleziona = '';

                            popup += '<option value="' + flyaq.paletteTypes[j].eLiterals[w].name + '" ' + seleziona + '>' + flyaq.paletteTypes[j].eLiterals[w].name + '</option>';
                        }
                        break;
                    }
                }

                popup += '</select></td></tr>';
            } else {
                if (tipoDiDato != "checkbox") {
                	// IVANO added default values
                    if (tipoDiDato == "number") {
                    	if(obj.eStructuralFeatures[k].lowerBound != 0) {
                    		if (obj.eStructuralFeatures[k].value == null) {
                    			valore = 50;
                    			obj.eStructuralFeatures[k].value = valore;
                    		}
                    	}
                    } else {
                    	if(obj.eStructuralFeatures[k].lowerBound != 0) {
                    		if (obj.eStructuralFeatures[k].value == null) {
                    			valore = "default";
                    			obj.eStructuralFeatures[k].value = valore;
                    		}
                    	}
                    }
                    popup += '<td><input onblur="aggiornaProprieta(\'' + obj.taskName + '\', false)" step="' + stepNum + '" type="' + tipoDiDato + '" class="popupParametro" value="' + valore + '"/></td></tr>';
                } else {
                    if (valore == 0) {
                        popup += '<td><input onblur="aggiornaProprieta(\'' + obj.taskName + '\', false)" step="' + stepNum + '" type="' + tipoDiDato + '" class="popupParametro"/></td></tr>';
                    } else {
                        popup += '<td><input onblur="aggiornaProprieta(\'' + obj.taskName + '\', false)" step="' + stepNum + '" type="' + tipoDiDato + '" class="popupParametro" checked="checked"/></td></tr>';
                    }
                }
            }
        }

    // coda
    popup += '</tbody></table>';

    /* Vecchio aggiornamento manuale
    if (obj.eStructuralFeatures != null)
    popup += '<a href="#" onclick="aggiornaProprieta('+id+', false)">Update</a>&nbsp;';
    */

    Ttipo = obj.eSuperTypes[0].$ref;
    Ttipo = Ttipo.substr(Ttipo.lastIndexOf('/') + 1);
    
    // IVANO commented the following line of code
    //if (Ttipo != "PointTask")
    popup += '<button type="button" class="btn btn-danger" onclick="cancTaskSeq(\'' + obj.taskName + '\')">Delete</button>&nbsp;</div>';

    return popup;
}


//              **** Context *****
//@ genera elemento dei modelli dei task
function genModelContesto(contesto, id) {
    modContext = '<tr><td><img height="25" width="25" src="' + contesto.icon + '" alt="icona"/></td>' + '<td onclick="editazione(\'' + contesto.name + '\', true, ' + id + ', \'PolygonTask\', this);">' + contesto.name + '</td></tr>';

    return modContext;
}

//@ genera il popup del contesto con le proprietï¿½
function genContestoPopup(obj, id) {
    // intestazione
    popup = '<div class="popupWin"><h5>Context properties</h5>' + '<div><b>Context name: </b>' + obj.name + '</div>' + '<table id="task-popup-props" class="popup"><tbody>';

    // lista delle proprieta' editabile
    if (obj.eStructuralFeatures != null)
        for (k = 0; k < obj.eStructuralFeatures.length; k++) {
            popup += '<tr><td>' + obj.eStructuralFeatures[k].name + '</td>';
            tipoDiDato = obj.eStructuralFeatures[k].eType;
            stepNum = "";

            if (tipoDiDato == "EInt") {
                tipoDiDato = "number";
                stepNum = 1;
            } else if (tipoDiDato == "EFloat") {
                tipoDiDato = "number";
                stepNum = 0.001;
            } else if (tipoDiDato == "EBoolean") {
                tipoDiDato = "checkbox";
            } else {
                tipoDiDato = "text";
                stepNum = "";
            }

            if (obj.eStructuralFeatures[k].value != null) valore = obj.eStructuralFeatures[k].value;
            else if (obj.eStructuralFeatures[k].defaultValueLiteral != null) valore = obj.eStructuralFeatures[k].defaultValueLiteral;
            else if (obj.eStructuralFeatures[k].lowerBound != null) valore = obj.eStructuralFeatures[k].lowerBound;
            else valore = "";

            if (tipoDiDato != "checkbox")
                popup += '<td><input onblur="aggiornaProprieta(' + id + ', true)" step="' + stepNum + '" type="' + tipoDiDato + '" class="popupParametro" value="' + valore + '"/></td></tr>';
            else {
                if (valore == 0)
                    popup += '<td><input onblur="aggiornaProprieta(' + id + ', true)" type="checkbox" class="popupParametro"/></td></tr>';
                else
                    popup += '<td><input onblur="aggiornaProprieta(' + id + ', true)" type="checkbox" class="popupParametro" checked="checked"/></td></tr>';
            }
        }

    // coda
    popup += '</tbody></table>';

    /* Vecchio aggiornamento manuale
    if (obj.eStructuralFeatures != null)
    popup += '<a href="#" onclick="aggiornaProprieta('+id+', true)">Update</a>&nbsp;';
    */

    popup += '<button type="button" class="btn btn-danger" onclick="cancellaContesto(' + id + ')">Delete</button>&nbsp;</div>';

    return popup;
}