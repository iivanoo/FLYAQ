//@ Nascondi tutte le aree sulla mappa
function nascondi_tutto() // !!Non più usata!!
{
    if (flyaq.task_vis) document.getElementById("menu-vista-task").click();
    if (flyaq.context_vis) document.getElementById("menu-vista-contesto").click();
}

//@ Mostra/nascondi aree dei task
function flip_task(btn)
{
    
    if (flyaq.task_vis)
    {
        // Nascondi poligoni task
        for (k = 0; k < flyaq.task_pol.length; k++)
        {
            if (flyaq.task_pol[k] != null) flyaq.map.removeLayer(flyaq.task_pol[k]);
        }
        flyaq.task_vis = false;
        btn.className = "btn modifica-vista";
    }
    else
    {
        // Mostra poligoni task
        for (k = 0; k < flyaq.task_pol.length; k++)
        {
            if (flyaq.task_pol[k] != null) flyaq.map.addLayer(flyaq.task_pol[k]);
        }
        flyaq.task_vis = true;
        btn.className = "btn modifica-vista btn-info";
    }
    
}

//@ Mostra/nascondi aree di contesto
function flip_contesto(btn)
{
    if (flyaq.context_vis)
    {
        // Nascondi poligoni contesto
        for (k = 0; k < flyaq.contesto_pol.length; k++)
        {
            if (flyaq.contesto_pol[k] != null) flyaq.map.removeLayer(flyaq.contesto_pol[k]);
        }
        flyaq.context_vis = false;
        btn.className = "btn modifica-vista";
    }
    else
    {
        // Mostra poligoni contesto
        for (k = 0; k < flyaq.contesto_pol.length; k++)
        {
            if (flyaq.contesto_pol[k] != null) flyaq.map.addLayer(flyaq.contesto_pol[k]);
        }
        flyaq.context_vis = true;
        btn.className = "btn modifica-vista btn-info";
    }
    
}

//@ Mostra/nascondi behaviour
function flip_behaviour(btn)
{
    if (flyaq.behaviour_vis)
    {
        // Nascondi poligoni behaviour
        for (i=0; i < flyaq.elementi_mappa.length; i++)
        {
            flyaq.map.removeLayer(flyaq.elementi_mappa[i]);
        }
        
        flyaq.behaviour_vis = false;
        btn.className = "btn modifica-vista";
    }
    else
    {
        // Mostra poligoni behaviour
        for (i=0; i < flyaq.elementi_mappa.length; i++)
        {
            flyaq.map.addLayer(flyaq.elementi_mappa[i]);
        }
        
        flyaq.behaviour_vis = true;
        btn.className = "btn modifica-vista btn-info";
    }
}