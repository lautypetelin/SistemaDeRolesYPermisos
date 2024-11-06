package com.devcoder.login.logica;

import com.devcoder.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    private ControladoraPersistencia controlPersis = null;

    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }
    
    // Usuario -----------------------------------------------------------------
    
    public Usuario validarUsuario(String correo, String contrasenia) {
      
        Usuario encontrado = null;
        
        for(Usuario user: controlPersis.traerUsuarios()){
            if(user.getCorreoElectronico().equals(correo)){
                if(user.getContrasenia().equals(contrasenia)){
                    encontrado = user;
                    break;
                }else{
                    encontrado = null;
                    break;
                }
            }else{
                encontrado = null;
            }
        }
        
        return encontrado;
    }
    
    public void crearUsuario(String nombre, String apellido, String correo, String contrasenia, Rol rol) {
        
        Usuario usuario = new Usuario(nombre, apellido, correo, contrasenia, rol);
        controlPersis.crearUsuario(usuario);
    }
    
    public Usuario traerUsuario(int idUsuario) {
        
        return controlPersis.traerUsuario(idUsuario);
    }
    
    public List<Usuario> traerUsuarios() {
        
        return controlPersis.traerUsuarios();
    }

    public void editarUsuario(int id, String nombre, String apellido, String correo, String contrasenia, Rol rol) {
        
        Usuario usuario = new Usuario(id, nombre, apellido, correo, contrasenia, rol);
        
        controlPersis.editarUsuario(usuario);
    }
    
    public void eliminarUsuario(int idUsuario) {
        
        controlPersis.eliminarUsuario(idUsuario);
    }
  
    // Rol ---------------------------------------------------------------------
    
    public List<Rol> traerRoles() {
        
        return controlPersis.traerRoles();
    }
}