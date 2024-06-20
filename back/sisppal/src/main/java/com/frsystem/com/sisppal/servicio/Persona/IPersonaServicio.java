package com.frsystem.com.sisppal.servicio.Persona;

import com.frsystem.com.sisppal.modelo.Persona;

import java.util.List;

public interface IPersonaServicio {

    public List<Persona> listarPersonas();

    public Persona buscarPersonaPorId(Integer idPersona);

    public Persona guardarPersona(Persona persona);

    public void eliminarPersonaPorId(Integer idPersona);
}
