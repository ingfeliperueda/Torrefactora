package com.frsystem.com.sisppal.servicio.Tarea;

import com.frsystem.com.sisppal.modelo.Tarea;
import com.frsystem.com.sisppal.repositorio.ITareaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServicio implements ITareaServicio {

    @Autowired
    private ITareaRepositorio tareaRepositorio;

    @Override
    public List<Tarea> listarTareas() {
        return this.tareaRepositorio.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        Tarea tarea = this.tareaRepositorio.findById(idTarea).orElse(null);
        return tarea;
    }

    @Override
    public Tarea guardarTarea(Tarea tarea) {
        return this.tareaRepositorio.save(tarea);
    }
}
