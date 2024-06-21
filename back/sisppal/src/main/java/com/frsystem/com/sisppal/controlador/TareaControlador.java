package com.frsystem.com.sisppal.controlador;

import com.frsystem.com.sisppal.modelo.Tarea;
import com.frsystem.com.sisppal.servicio.Tarea.TareaServicio;
import excepcion.RecursoNoEncontradoExcepcion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/tareas")
    public Tarea agregarTarea(@RequestBody Tarea tarea){
        logger.info("Tarea a agregar: " + tarea);
        return this.tareaServicio.guardarTarea(tarea);
    }

    @GetMapping("/tareas/{id}")
    public ResponseEntity<Tarea> obtenerTareaPorId(@PathVariable int id){
        Tarea tarea = this.tareaServicio.buscarTareaPorId(id);
        if(tarea != null)
            return ResponseEntity.ok(tarea);
        else
            throw new RecursoNoEncontradoExcepcion(("No se encontro el id: ")+id);
    }

    @PutMapping("/tareas/{id}")
    public ResponseEntity<Tarea> actualizarTarea(@PathVariable int id, @RequestBody Tarea tareaRecibido){
        Tarea tarea = this.tareaServicio.buscarTareaPorId(id);
        tarea.setNombre(tarea.getNombre());
        tarea.setDescripcion(tarea.getDescripcion());
        tarea.setFechaInicio(tarea.getFechaInicio());
        tarea.setFechaFin(tarea.getFechaFin());
        this.tareaServicio.guardarTarea(tarea);
        return ResponseEntity.ok(tarea);
    }
}
