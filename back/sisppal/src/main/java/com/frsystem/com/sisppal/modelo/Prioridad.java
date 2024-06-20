package com.frsystem.com.sisppal.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "T003_PRIORIDAD")
public class Prioridad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CODIGO", nullable = false, insertable = false)
    Integer idProridad;

    @Column(name="NOMBRE")
    String nombre;

    @Column(name="DESCRIPCION")
    String descripcion;
}
