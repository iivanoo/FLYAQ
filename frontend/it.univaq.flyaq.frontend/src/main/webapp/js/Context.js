// ***** Context ****

/*
 
    {
        name: "Contesto",
        weatherConditions : [],
        noFlyAreas : [],
        obstacles: [],
        emergencyAreas: []
    }
    
    
*/

//@ ritorna la palette del context dal server
function getContesto(p)
{
    // creo la palette identica al modello in input
    flyaq.paletteContext = p;
    
    // creo la lista di modelli nell'interfaccia
    for (k = 0; k < p.length; k++)
        document.getElementById("modelli-contesto-elenco").innerHTML += genModelContesto(p[k], k);        
}


//@ cancella il contesto dalla mappa
function cancellaContesto(id)
{
    // cancella il contesto dalla mappa
    flyaq.map.removeLayer(flyaq.contesto_pol[id]);
    
    // cancella il contesto dalla struttura dati
    flyaq.contesto_seq[id] = null;
    flyaq.contesto_pol[id] = null;
}