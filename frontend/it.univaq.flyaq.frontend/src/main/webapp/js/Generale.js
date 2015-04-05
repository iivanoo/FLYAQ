// Dichiarazioni variabili ambiente


//              ----    FLYAQ   ----
var flyaq = {
    
    // sistema
    //baseURL : "http://localhost:8080",
	// baseURL : "http://127.0.0.1:8080", 
    baseURL : "",
    
    // variabile mappa
    map: null,
    
    // variabili utente
    idutente : "",
    whoami : "",
    
    // pannelli strumenti
    pan_strum : false,
    
    // editing
    contesto : false,
    task_id : "",
    task_model : "",
    tipoPol : "",
    modelSelected : null,    
    
    // Droni
    paletteDroni : null,
    flotta : {drones: new Array()},
    
    // Task
    paletteTask : null,
    globalTaskID : -1,
    task_seq : new Array(),
    task_pol : new Array(),
    task_initM : new Array(),
    stato_checkbox : new Array(),
    paletteTypes : new Array(),
    nsExt : new Array(),
    
    // Context
    paletteContext : null,
    contesto_seq : new Array(),
    contesto_pol : new Array(),
    
    // Visualizzazione
    task_vis : true,
    context_vis : true,
    behaviour_vis : true,


    // Missione e Context
    missione : null,
    missioneJson : "",

    contesto : null,
    contestoJson : "",

    // Behaviour
    behaviour : null,
    behaviourJson : "",

    elementi_mappa : new Array(),
    elementi_ROS_mappa : new Array(),
    elementi_ROS_body : new Array(),
    button : "OFF",
    ros_ip : null,
    ros : undefined,
    listener : undefined,
    droni_live : new Array(),
    
    temp : {
        
        timeoutVal: undefined,
        marker : null
    },
    
    
    // Classi degli oggetti
        // Mission
    COORDINATE_CLASS : "mission://Coordinate",
    MISSION_CLASS : "mission://Mission",
    TASKDEP_CLASS : "mission://TaskDependency",
    FORK_CLASS : "mission://Fork",
    JOIN_CLASS : "mission://Join",
    
        // Contesto
    COORDINATE_CLASS2 : "context://Coordinate",    
    CONTEXT_CLASS : "context://Context",
    NOFLY_CLASS : "context://Area",
    OBSTACLE_CLASS : "context://Obstacle",
    EMERGENCY_CLASS : "context://Area",
    
        // Droni        
    DRONE_CLASS : "mission://Drone",
    FLOTTA_CLASS : "mission://Swarm",
    
    
}
/*
// Sistema
var baseURL = "localhost/tesi/";

// variabile mappa
var map;

// variabili utente
var idutente = "";
var whoami = "";

// Pannelli strumenti
var pan_strum = true;

// editing
var contesto = false;
var task_id = "";
var task_model = "";
var tipoPol = "";

// Droni
var paletteDroni = null;
var flotta = {drones: new Array()};

// Task
var paletteTask = null;
var task_seq = new Array();
var task_pol = new Array();
var task_initM = new Array();
var stato_checkbox = new Array();

// Context
var paletteContext = null;
var contesto_seq = new Array();
var contesto_pol = new Array();


// Visualizzazione
var task_vis = true;
var context_vis = true;
var behaviour_vis = true;


// Missione e Context
var missione = null;
var missioneJson = "";

var contesto = null;
var contestoJson = "";

// Behaviour
var elementi_mappa = new Array();
*/

// ******* Set - Get ********
function setUserId(data)
{
    flyaq.idutente = data;
}


// ******* Qualche utility *******

// clona oggetti javascript
function clone(obj){ return JSON.parse(JSON.stringify(obj));}

// disabililta il refresh della pagina

function disableF5(e) { if ((e.which || e.keyCode) == 116) e.preventDefault(); };
    
$(document).bind("keydown", disableF5);
$(document).on("keydown", disableF5);