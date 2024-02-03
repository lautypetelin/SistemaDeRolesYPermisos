package com.devcoder.login.persistencia;

import com.devcoder.login.logica.Rol;
import com.devcoder.login.logica.Usuario;
import com.devcoder.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();
    
    public List<Usuario> traerUsuarios() {
        
        return usuarioJpa.findUsuarioEntities();
        //SELECT * FROM usuarios;
    }

    public void eliminarUsuario(int idUsuario) {
        try {
            usuarioJpa.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
//            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario user) {
        usuarioJpa.create(user);
    }

    public Usuario traerUsuario(int idUsuario) {
        return usuarioJpa.findUsuario(idUsuario);
    }

    public void editarUsuario(Usuario user) {
        try {
            usuarioJpa.edit(user);
        } catch (Exception ex) {
//            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}