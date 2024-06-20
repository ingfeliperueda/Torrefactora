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
@Table(name = "SISP_T001_PERSONA")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="A001CODIGO", nullable = false, insertable = false)
    Integer idPersona;

    @Column(name="A001NOMBRE")
    String nombre;

    @Column(name="A001APELLIDO")
    String apellido;

    /*@OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "A001IDTIPODOCUM")
    TipoDoc tipoDoc;*/

    @Column(name = "A001IDTIPODOCUM")
    Integer tipoDoc;

    @Column(name = "A001NUMDOCUM")
    Integer numdoc;

    @Column(name = "A001LUGEXPDOCUM")
    Integer lugExpDoc;

    /*@Column(name = "A001LUGEXPDOCUM")
    Integer lugExpDoc;*/

    @Column(name = "A001TELEFONO")
    Integer telefono;

    @Column(name = "A001CELULAR")
    String celular;

    @Column(name = "A001DIRECCION")
    String direccion;

    @Column(name = "A001CORREO")
    String correo;

    @Column(name = "A001USUARIO")
    String usuario;

    @Column(name = "A001CONTRASENA")
    String contrasenia;

    @Column(name = "A001PRIMRINGRS")
    String primIngre;

    @Column(name = "A001ESTDREGSTR")
    String estadoReg;

    @Column(name = "A001FECHACREACION")
    Date fechaCrea;

    @Column(name = "A001FECHMODFCCN")
    Date fechaModif;

    @Column(name = "A001USRCREACION")
    String usuCrea;

    @Column(name = "A001USRMODFCCN")
    String usuModif;
}
