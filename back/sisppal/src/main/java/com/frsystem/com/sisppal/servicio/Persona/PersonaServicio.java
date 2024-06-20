package com.frsystem.com.sisppal.servicio.Persona;

import com.frsystem.com.sisppal.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frsystem.com.sisppal.repositorio.PersonaRepositorio;

import java.util.List;

@Service
public class PersonaServicio implements IPersonaServicio {

    @Autowired
    private PersonaRepositorio personaRepositorio;

    @Override
    public List<Persona> listarPersonas() {
        return this.personaRepositorio.findAll();
        //return this.personaRepositorio.findAll();
    }

    @Override
    public Persona buscarPersonaPorId(Integer idPersona) {
        Persona persona = this.personaRepositorio.findById(idPersona).orElse(null);
        return persona;
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return this.personaRepositorio.save(persona);
    }

    @Override
    public void eliminarPersonaPorId(Integer idPersona) {
        this.personaRepositorio.deleteById(idPersona);
    }


}
