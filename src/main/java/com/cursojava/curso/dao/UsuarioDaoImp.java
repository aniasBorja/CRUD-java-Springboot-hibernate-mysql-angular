package com.cursojava.curso.dao;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.springframework.stereotype.Repository;

import com.cursojava.curso.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        
        String query ="FROM Usuario";
        return entityManager.createQuery(query).getResultList();
        
        
    }
    
}
