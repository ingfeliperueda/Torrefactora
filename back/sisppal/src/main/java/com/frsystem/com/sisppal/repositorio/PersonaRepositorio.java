package com.frsystem.com.sisppal.repositorio;

import com.frsystem.com.sisppal.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

}
