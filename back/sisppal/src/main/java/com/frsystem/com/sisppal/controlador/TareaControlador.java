package com.frsystem.com.sisppal.controlador;

import com.frsystem.com.sisppal.modelo.Tarea;
import com.frsystem.com.sisppal.servicio.Tarea.TareaServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("torrefac")
@CrossOrigin(value = "http://localhost:4200")
public class TareaControlador {

    private static final Logger logger = LoggerFactory.getLogger(TareaControlador.class);

    @Autowired
    private TareaServicio tareaServicio;

    @GetMapping("tareas")
    public List<Tarea> obtenerTareas(){
        List<Tarea> tareas = this.tareaServicio.listarTareas();
        logger.info("Tareas obtenidas: ");
        tareas.forEach((tarea -> logger.info(tarea.toString())));
        return tareas;
    }
}
