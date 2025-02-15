package com.projetos;

import com.projetos.services.UsuarioService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    //TODO: Criar um docker para o projeto
    private final UsuarioService usuarioService;

    public ExampleResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @POST
    @Transactional
    public String hello() {
        usuarioService.saveUsuario();
        return "Hello from Quarkus REST oie test";
    }
}
