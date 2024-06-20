package com.frsystem.com.sisppal.servicio.Tarea;

import com.frsystem.com.sisppal.modelo.Tarea;

import java.util.List;

public interface ITareaServicio {

    public List<Tarea> listarTareas();

    public Tarea buscarTareaPorId(Integer idTarea);

    public Tarea guardarTarea(Tarea tarea);
}
