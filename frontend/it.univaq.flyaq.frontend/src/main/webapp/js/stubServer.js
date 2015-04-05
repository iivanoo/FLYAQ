//                  **** Utility *****

//@ richiesta PUT
function httpPut(theUrl, dati)
{
    var xmlHttp = null;

    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "POST", theUrl, false );
    xmlHttp.send( dati );
    return xmlHttp.responseText;    
}

//@ richiesta GET
function httpGet(theUrl)
    {
    var xmlHttp = null;

    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", theUrl, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
    }
    
//              **** LOGIN, LOGOUT ******

//@ login al server
function serverLogin(user, pass)
{    
    if (true) // mettere qui la richiesta al server con la risposta per il login
    {
    // se il login è corretto
    document.getElementById("login-window-back").style.display = "none";
    document.getElementById("all-the-stuff").style.display = "block";
    
    flyaq.whoami = user.value;
    document.getElementById("username").textContent = flyaq.whoami;
    document.getElementById("username-LPD").textContent = flyaq.whoami;
    
    editorInit();
    }
    // altrimenti
    else {
        alert("Login incorrect!");
    }
}

//@ logout al server
function serverLogout()
{
    // conferma di Logout
    if (confirm("Are you sure to Exit?"))
    {
    
    // invia l'user dell'utente che fa logout
    
    // ricarica la pagina per resettare il tutto
    location.reload();
    }
}