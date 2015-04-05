// ***** Droni e flotta ****

/*
 
    {name: "nome-del-drone",
    etc....}
    
*/



//@ ritorna la palette dei droni dal server
function getDroni(p)
{
    flyaq.paletteDroni = p.drones;
    
    for (k = 0; k < p.drones.length; k++)
        document.getElementById("elenco-modelli-droni").innerHTML += genModelDroni(p.drones[k], k);
}



//@ aggiungi drone alla flotta
function flottaAggiungiDrone()
{    
    // trova il drone selezionato ora    
    dType = document.getElementById("elenco-modelli-droni").value;
    id = flyaq.flotta.drones.length;
    // aggiunge il drone alla flotta
    flyaq.flotta.drones[id] = { type: flyaq.paletteDroni[dType].name,
                                home: null,
                                name: flyaq.paletteDroni[dType].name + "_" + id,
                                eClass: flyaq.DRONE_CLASS};    
    
    // aggiorna la lista dei droni nella flotta
    document.getElementById('droni-flotta-elenco').innerHTML += genDroneFlotta(dType, id);
    
    flottaSetHome(id);
}

//@ rimuove elemento dalla flotta
function flottaRimuoviDrone(id)
{
    // conferma cancellazione
    if (confirm("Are you sure to remove from Swarm?"))
    {
    
    // cancella il marker sulla mappa
    if (flyaq.flotta.drones[id].marker != null) flyaq.map.removeLayer(flyaq.flotta.drones[id].marker);
    
    // cancella dalla struttura dati
    flyaq.flotta.drones[id] = null;
    //flyaq.flotta.drones.splice(id, 1);
    
    // cancella dalla lista
    $('#drone-flotta-'+id).remove();
    }
}

//@ imposta la home per un drone
function flottaSetHome(id)
{    
    // controlla settaggio Home gi� avvenuto
    if (flyaq.flotta.drones[id].marker != null)
    {
        // centra la mappa sulla Home
        flyaq.map.panTo(flyaq.flotta.drones[id].marker.getLatLng());
    }
    else
    {
        // metti la Home al centro della mappa
        vertice = flyaq.map.getCenter();
        
        // imposta icona marker
        icona_marker = L.icon({
            iconUrl: 'icone/home-256.png',
            iconRetinaUrl: 'icone/home-256.png',
            iconSize: [25, 41],
            iconAnchor: [17, 35],
            popupAnchor: [-3, -76],
            shadowUrl: '',
            shadowRetinaUrl: '',
            shadowSize: [68, 95],
            shadowAnchor: [22, 94]
        });
        
        flyaq.flotta.drones[id].marker = L.marker(vertice, {title: "Drag to choose home place for selected drone.", icon: icona_marker});        
        flyaq.flotta.drones[id].marker.addTo(flyaq.map);
        
        flyaq.flotta.drones[id].marker.snapediting = new L.Handler.MarkerSnap(flyaq.map, flyaq.flotta.drones[id].marker);
        flyaq.flotta.drones[id].marker.snapediting.enable();
        
        // imposta come home la posizione attuale del marker
        flyaq.flotta.drones[id].home = {latitude: flyaq.flotta.drones[id].marker.getLatLng().lat,
                                        longitude: flyaq.flotta.drones[id].marker.getLatLng().lng,
                                        eClass: flyaq.COORDINATE_CLASS};
        flyaq.flotta.drones[id].marker.bindPopup(genDronePopup(flyaq.flotta.drones[id].type, id));
        
        // evento di fine spostamento
        flyaq.flotta.drones[id].marker.on('dragend', function(e){                
            flyaq.flotta.drones[id].home.latitude = e.target.getLatLng().lat;
            flyaq.flotta.drones[id].home.longitude = e.target.getLatLng().lng;
            
            //flotta.drones[id].marker = marker;
            
            flyaq.flotta.drones[id].marker.bindPopup(genDronePopup(flyaq.flotta.drones[id].type, id));
        });
    }
}