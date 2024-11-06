package com.devcoder.login.persistencia;

import com.devcoder.login.logica.Rol;
import com.devcoder.login.logica.Usuario;
import com.devcoder.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ControladoraPersistencia {
    
    private UsuarioJpaController usuarioJpa = null;
    private RolJpaController rolJpa = null;
    
    public ControladoraPersistencia(){
        usuarioJpa = new UsuarioJpaController();
        rolJpa = new RolJpaController();
    }
    
    // Usuario -----------------------------------------------------------------
    
    public void crearUsuario(Usuario user) {
        usuarioJpa.create(user);
    }
    
    public Usuario traerUsuario(int idUsuario) {
        return usuarioJpa.findUsuario(idUsuario);
    }
    
    public List<Usuario> traerUsuarios() { 
        return usuarioJpa.findUsuarioEntities(); // ≡ SELECT * FROM usuario;
    }

    public List<Usuario> buscarPersonaPorNombre(String n){
        
        EntityManager em = usuarioJpa.getEntityManager();
        Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre LIKE :nombre OR u.apellido LIKE :nombre");
        query.setParameter("nombre", n + "%");
        List<Usuario> lista = query.getResultList();
        return lista;
    }
    
    public void editarUsuario(Usuario user) {
        try {
            usuarioJpa.edit(user);
        } catch (Exception ex) {
            // Excepción controlada desde la vista EditarUsuario
        }
    }
    
    public void eliminarUsuario(int idUsuario) {
        try {
            usuarioJpa.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            // Excepción controlada desde la vista CrearUsuario
        }
    }

    // Rol ---------------------------------------------------------------------
    
    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities(); // ≡ SELECT * FROM rol
    }
}