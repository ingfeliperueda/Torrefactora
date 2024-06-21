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
@Table(name = "T002_STATUS")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CODIGO", nullable = false, insertable = false, updatable = false)
    private int idStatus;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="DESCRIPCION")
    private String descripcion;

}
