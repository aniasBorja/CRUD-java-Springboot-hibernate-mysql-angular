package com.cursojava.curso.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

@RestController
public class UsuarioControllers {

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
        List <Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(111L);
        usuario.setNombre("Anias");
        usuario.setApellido("Borja");
        usuario.setEmail("a321borja@mail.com");
        usuario.setTelefono("45455444");

        Usuario usuario2 = new Usuario();
        usuario2.setId(222L);
        usuario2.setNombre("Anias");
        usuario2.setApellido("Borja");
        usuario2.setEmail("a321borja@mail.com");
        usuario2.setTelefono("45455444");

        Usuario usuario3 = new Usuario();
        usuario3.setId(333L);
        usuario3.setNombre("Anias");
        usuario3.setApellido("Borja");
        usuario3.setEmail("a321borja@mail.com");
        usuario3.setTelefono("45455444");

        Usuario usuario4 = new Usuario();
        usuario4.setId(444L);
        usuario4.setNombre("Anias");
        usuario4.setApellido("Borja");
        usuario4.setEmail("a321borja@mail.com");
        usuario4.setTelefono("45455444");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;
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
