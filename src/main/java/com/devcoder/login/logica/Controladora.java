package com.devcoder.login.logica;

import com.devcoder.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Usuario validarUsuario(String usuario, String contrasenia) {

        Usuario encontrado = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario user: listaUsuarios){
            if(user.getUsuario().equals(usuario)){
                if(user.getContrasenia().equals(contrasenia)){
                    encontrado = user;
                }
            }
        }
        
        return encontrado;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void eliminarUsuario(int idUsuario) {
        controlPersis.eliminarUsuario(idUsuario);
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String nombre, String contrasenia, String rolRecibido) {
        
        Usuario user = new Usuario();
        user.setUsuario(nombre);
        user.setContrasenia(contrasenia);
        
        Rol rol = new Rol();
        rol = this.traerRol(rolRecibido);
        
        if(rol != null){
            user.setRol(rol);
            
            int id = this.buscarUltimoIdUsuarios();
            user.setId(++id);
            
            controlPersis.crearUsuario(user);
        }  
    }

    private Rol traerRol(String rolRecibido) {
        
        List<Rol> listaRoles = controlPersis.traerRoles();
        
        for(Rol rol: listaRoles){
            if(rol.getNombreRol().equals(rolRecibido)){
                return rol;
            }
        }
        
        return null;
    }

    private int buscarUltimoIdUsuarios() {
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        int cantidadUsuarios = listaUsuarios.size();
        
        return listaUsuarios.get(cantidadUsuarios - 1).getId();
    }

    public Usuario traerUsuario(int idUsuario) {
        return controlPersis.traerUsuario(idUsuario);
    }

    public void editarUsuario(Usuario user, int id, String nombre, String contrasenia, String rolSt) {
        
        user.setId(id);
        user.setUsuario(nombre);
        user.setContrasenia(contrasenia);
        Rol rol = traerRol(rolSt);
        user.setRol(rol);
        
        controlPersis.editarUsuario(user);
    }
}