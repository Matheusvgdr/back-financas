package com.projetos.services;

import com.projetos.entities.UsuarioModel;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioService {
    public void saveUsuario(){
        var usuario = new UsuarioModel("Teste", "Teste5", "12345");
        UsuarioModel.persist(usuario);

        var opi = 0;
    }
}
