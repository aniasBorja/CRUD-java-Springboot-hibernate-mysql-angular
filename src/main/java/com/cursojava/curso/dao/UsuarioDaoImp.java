package com.cursojava.curso.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cursojava.curso.models.Usuario;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @Override
    public List<Usuario> getUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsuarios'");
    }
    
}
