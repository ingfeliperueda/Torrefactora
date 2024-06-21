package com.frsystem.com.sisppal.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private String nombre;

    @Column(name="DESCRIPCION")
    private String descripcion;

    @Column(name="FECHAINICIO")
    private Date fechaInicio;

    @Column(name="FECHAFIN")
    private Date fechaFin;

    /*@Column(name="STATUS")
    private int idStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Status status;

    @OneToOne
    @JoinColumn(name = "CODIGO")
    @Column(name="PRIORIDAD")
    Prioridad prioridad;*/

}
