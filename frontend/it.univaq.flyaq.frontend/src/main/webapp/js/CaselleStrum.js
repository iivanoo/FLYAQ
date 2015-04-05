// ***** Pannelli strumenti ****

//@ Mostra una specifica casella strumenti
function pannello_strumenti(cosa)
{    
    if (cosa == 'task')
    {
        flyaq.contesto = false;
        document.getElementById("tasks").style.display = "block";
        document.getElementById("contesto").style.display = "none";
    }
    else /*if (cosa == 'contesto')*/{
        flyaq.contesto = true;
        document.getElementById("tasks").style.display = "none";
        document.getElementById("contesto").style.display = "block";
    }
}


//@ Mostra/nascondi pannelli strumenti
function flip_strumenti()
{
    if (flyaq.pan_strum)
    {
        document.getElementById("segnaposto-sx").style.display = "block";
        document.getElementById("segnaposto-dx").style.display = "none";
        document.getElementById("caselle-strumenti").style.right = "";
        flyaq.pan_strum = false;
    }
    else
    {
        document.getElementById("segnaposto-sx").style.display = "none";
        document.getElementById("segnaposto-dx").style.display = "block";
        document.getElementById("caselle-strumenti").style.right = "10px";
        flyaq.pan_strum = true;
    }    
}

//@ Mostra/nascondi menu principale ridotto
function flipMenuPrincipale()
{
    if (document.getElementById("menu-princ-dropdown").style.display == "")
        document.getElementById("menu-princ-dropdown").style.display = "block";
    else document.getElementById("menu-princ-dropdown").style.display = "";
    
}

//@ Aggiorna nome missione
function updateMissionName(obj, eid)
{
    document.getElementById(eid).value = obj.value;
}