package com.devcoder.login.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {
    
    //Atributos
    @Id
//    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String usuario;
    private String contrasenia;
    @ManyToOne
    @JoinColumn(name="fk_rol")
    private Rol rol;
    
    //Constructor
    public Usuario() {}

    public Usuario(int id, String usuario, String contrasenia, Rol rol) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    //Métodos getter y setter}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    } 

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}