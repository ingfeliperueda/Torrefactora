package com.frsystem.com.sisppal.controlador;

import com.frsystem.com.sisppal.modelo.Persona;
import excepcion.RecursoNoEncontradoExcepcion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.frsystem.com.sisppal.servicio.Persona.PersonaServicio;

import java.util.List;

@RestController
@RequestMapping("siaf-app")
@CrossOrigin(value = "http://localhost:4200")
public class PersonaControlador {

    private static final Logger logger = LoggerFactory.getLogger(PersonaControlador.class);

    @Autowired
    private PersonaServicio personaServicio;

    @GetMapping("/personas")
    public List<Persona> obtenerPersonas(){
        List<Persona> personas = this.personaServicio.listarPersonas();
        logger.info("Personas obtenidas:");
        personas.forEach((persona -> logger.info(persona.toString())));
        return personas;
    }

    @PostMapping("/personas")
    public Persona agregarpersona(@RequestBody Persona persona){
        logger.info("Persona a agregar: " + persona);
        return this.personaServicio.guardarPersona(persona);
    }

    @GetMapping("/personas/{idPersona}")
    public ResponseEntity<Persona> obtenerPersonaPorId(@PathVariable int idPersona){
        logger.info("id enviado: " + idPersona);
        Persona persona = this.personaServicio.buscarPersonaPorId(idPersona);
        if(persona != null)
            return ResponseEntity.ok(persona);
        else
            throw new RecursoNoEncontradoExcepcion("No se encontro el id: " + idPersona);
    }

}
