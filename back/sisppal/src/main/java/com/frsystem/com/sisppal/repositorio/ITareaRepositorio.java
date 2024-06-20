package com.frsystem.com.sisppal.repositorio;

import com.frsystem.com.sisppal.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITareaRepositorio extends JpaRepository<Tarea, Integer> {

}
