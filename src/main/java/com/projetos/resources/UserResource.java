package com.projetos.resources;

import com.projetos.dto.requests.user.UserRequest;
import com.projetos.services.UserService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService userService;

    @GET
    public Response getUsers() {
        var result = userService.getUsers();
        return Response.status(result.getHttpStatus()).entity(result).build();
    }

    @POST
    @Transactional
    public Response saveUser(UserRequest userRequest) {
        var result = userService.saveUser(userRequest);
        return Response.status(result.getHttpStatus()).entity(result).build();
    }
}
