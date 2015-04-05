// ***** Task e sequenza ****

/*
 
    {
        ExtMisList [
            
            MissionList1 {
                name: "nome-del-set",
                eClassifiers [
                    {
                        name: "nome-del-task",
                        eAnnotations [
                        {
                            details : {
                                color : #qualcosa,
                                icon : "icona-del-task"
                            }
                        }
                        ],
                        eSuperTypes [],
                        eStructuralFeatures []                        
                    }
                ]
            },
            
            MissionList2 {
                name: "nome-del-set",
                eClassifiers [
                    
                    
                    
                ]
            }
        ]
    }
    
    
*/


// task di controllo FORK e JOIN
forkTask = {
    eClass : flyaq.FORK_CLASS,
    name : "fork1"
//    referencePosition : {
//      eClass : "mission://Coordinate",
//      latitude : 11.0,
//      longitude : 22.0,
//      altitude : 3.0
//    }
    };
joinTask = {
    eClass : flyaq.JOIN_CLASS,
    name : "join1"
//    referencePosition : {
//      eClass : "mission://Coordinate",
//      latitude : 11.0,
//      longitude : 22.0,
//      altitude : 3.0
//    }
    };



//@ ritorna la palette dei task dal server
function getTask(p)
{    
    flyaq.paletteTask = new Array();
    
    // unifico i vari array di task in un unico array di modelli
    for (k = 0; k < p.extensions.length; k++)
    {
        flyaq.nsExt[flyaq.nsExt.length] = p.extensions[k].nsPrefix;
        for (j = 0; j < p.extensions[k].eClassifiers.length; j++)
            if (p.extensions[k].eClassifiers[j].eLiterals == undefined){
               flyaq.paletteTask[flyaq.paletteTask.length] = p.extensions[k].eClassifiers[j];
               flyaq.paletteTask[flyaq.paletteTask.length - 1].nsPrefix = p.extensions[k].nsPrefix;
            }
    }
    
    // estraggo i tipi enum estesi
    for (k = 0; k < p.extensions.length; k++)
    {        
        for (j = 0; j < p.extensions[k].eClassifiers.length; j++)
            if (p.extensions[k].eClassifiers[j].eLiterals != undefined)
               flyaq.paletteTypes[flyaq.paletteTypes.length] = p.extensions[k].eClassifiers[j];
    }    
    
    // creo la lista di modelli nell'interfaccia
    for (k = 0; k < flyaq.paletteTask.length; k++)
        document.getElementById("modelli-task-elenco").innerHTML += genModelTask(flyaq.paletteTask[k], k);
}


//              ***** Sequenza dei task ******

//@ sposta il task in alto nella sequenza
function altoTaskSeq(taskName) {

	var trovato = false, i = 0;
	while (i < flyaq.task_seq.length && !trovato) {
		if(flyaq.task_seq[i].taskName == taskName) {
			trovato = true;
		}
		else 
			i++;
	}
	
    var chisono = i;
    
    if (chisono <= 0) return;
    
    t1 = $($('table#elenco-task tr').get(chisono)).clone();
    t2 = $($('table#elenco-task tr').get(chisono - 1)).clone();
    $($('table#elenco-task tr').get(chisono)).replaceWith(t2);
    $($('table#elenco-task tr').get(chisono - 1)).replaceWith(t1);
    
    aggiornaIndici();
    
    //IVANO
    var temp = flyaq.task_seq[chisono];
    flyaq.task_seq[chisono] = flyaq.task_seq[chisono - 1];
    flyaq.task_seq[chisono - 1] = temp;
    //MIRCO
    temp = flyaq.task_pol[chisono];
    flyaq.task_pol[chisono] = flyaq.task_pol[chisono - 1];
    flyaq.task_pol[chisono - 1] = temp;
    //MIRCO
    temp = flyaq.task_initM[chisono];
    flyaq.task_initM[chisono] = flyaq.task_initM[chisono - 1];
    flyaq.task_initM[chisono - 1] = temp;
}

//@ sposta il task in basso nella sequenza
function bassoTaskSeq(taskName) {
	
	var trovato = false, i = 0;
	while (i < flyaq.task_seq.length && !trovato) {
		if(flyaq.task_seq[i].taskName == taskName) {
			trovato = true;
		}
		else 
			i++;
	}
	
    var chisono = i;
    
    if (chisono >= flyaq.task_seq.length - 1) return;
    
    t1 = $($('table#elenco-task tr').get(chisono)).clone();
    t2 = $($('table#elenco-task tr').get(chisono + 1)).clone();
    $($('table#elenco-task tr').get(chisono)).replaceWith(t2);
    $($('table#elenco-task tr').get(chisono + 1)).replaceWith(t1);
    
    aggiornaIndici();
    
    // IVANO
    var temp = flyaq.task_seq[chisono];
    flyaq.task_seq[chisono] = flyaq.task_seq[chisono + 1];
    flyaq.task_seq[chisono + 1] = temp;
    // MIRCO
    temp = flyaq.task_pol[chisono];
    flyaq.task_pol[chisono] = flyaq.task_pol[chisono + 1];
    flyaq.task_pol[chisono + 1] = temp;
    // MIRCO
    temp = flyaq.task_initM[chisono];
    flyaq.task_initM[chisono] = flyaq.task_initM[chisono + 1];
    flyaq.task_initM[chisono + 1] = temp;
}

//@ rimuovi il task dalla sequenza
function cancTaskSeq(taskName)
{
	
    // conferma cancellazione
    if (confirm("Are you sure to remove this task?")) {
    	
    	var trovato = false, i = 0;
    	while (i < flyaq.task_seq.length && !trovato) {
    		if(flyaq.task_seq[i].taskName == taskName) {
    			trovato = true;
    		}
    		else 
    			i++;
    	}
    	
	    //var ind = $(document.getElementById('seq-task-'+id)).index();
	    
	    // cancella area sulla mappa
    	if (flyaq.task_pol[i] != null)
    		flyaq.map.removeLayer(flyaq.task_pol[i]);
	
	    // cancella marker posizione iniziale
	    if (flyaq.task_initM[i] != null)
	    	flyaq.map.removeLayer(flyaq.task_initM[i]);
	    
	    // cancella elemento dalla lista
	    $('#'+taskName).remove();
	    
	    // MIRCO  
	    // cancella elemento dalle strutture dati
	    //flyaq.task_seq[id] = null;
	    flyaq.task_seq.splice(i, 1);
	    //flyaq.task_pol[id] = null;
	    flyaq.task_pol.splice(i, 1);
	    flyaq.task_initM.splice(i, 1);
	    
	    aggiornaIndici();
    }
}

//@ apri popup del task con le proprieta'
function apriPopup(taskName)
{
	//MIRCO
	var trovato = false, i = 0;
	while (i < flyaq.task_seq.length && !trovato) {
		if(flyaq.task_seq[i].taskName == taskName) {
			trovato = true;
		}
		else 
			i++;
	}
	
	//var ind = $(document.getElementById('seq-task-'+id)).index();
    flyaq.task_pol[i].openPopup();
    
}

//@ indici sequenza task
function aggiornaIndici()
{
    ind = 0;
    
    // cicla sulla sequenza
    seq = $('#elenco-task-elenco tr');
    indexing = true;
    
    for (k = 0; k < seq.length; k++)
    {   
        if (indexing)
        {
            ind++;        
            seq[k].childNodes[0].innerHTML = '<b>'+ind+'</b>';
        }
        else seq[k].childNodes[0].innerHTML = '';
        if ((seq[k + 1] != null) && seq[k + 1].childNodes[3].childNodes[0].checked) indexing = false;        
        else if ((seq[k + 1] != null) && !seq[k + 1].childNodes[3].childNodes[0].checked) indexing = true;
        else if (seq[k + 1] == null) indexing = true; 
    }
}