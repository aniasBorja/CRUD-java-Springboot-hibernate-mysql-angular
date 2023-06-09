package com.cursojava.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;

@RestController
public class UsuarioControllers {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping (value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Anias");
        usuario.setApellido("Borja");
        usuario.setEmail("a321borja@mail.com");
        usuario.setTelefono("45455444");
        return usuario;
    }

    @RequestMapping (value = "usuarios")
    public List<Usuario> getUsuarios (Long id){
        return usuarioDao.getUsuarios();
    }
    
    @RequestMapping (value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setId(555L);
        usuario.setNombre("Anias");
        usuario.setApellido("Borja");
        usuario.setEmail("a321borja@mail.com");
        usuario.setTelefono("45455444");
        return usuario;
    }

    @RequestMapping (value = "usuario2")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setId(555L);
        usuario.setNombre("Anias");
        usuario.setApellido("Borja");
        usuario.setEmail("a321borja@mail.com");
        usuario.setTelefono("45455444");
        return usuario;
    }

    @RequestMapping (value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setId(555L);
        usuario.setNombre("Anias");
        usuario.setApellido("Borja");
        usuario.setEmail("a321borja@mail.com");
        usuario.setTelefono("45455444");
        return usuario;
    }
}
