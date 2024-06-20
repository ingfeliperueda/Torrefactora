package com.frsystem.com.sisppal.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "T001_TAREA")
public class Tarea implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CODIGO", nullable = false, insertable = false)
    int idTarea;

    @Column(name="NOMBRE")
    String nombre;

    @Column(name="DESCRIPCION")
    String descripcion;

    @Column(name="FECHAINICIO")
    Date fechaInicio;

    @Column(name="FECHAFIN")
    Date fechaFin;

    /*@OneToOne
    @JoinColumn(name = "CODIGO")
    @Column(name="STATUS")
    Status status;

    @OneToOne
    @JoinColumn(name = "CODIGO")
    @Column(name="PRIORIDAD")
    Prioridad prioridad;*/

}
