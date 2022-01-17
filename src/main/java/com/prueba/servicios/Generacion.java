/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




@Path("rest")

public class Generacion {

boolean valor;

@GET
@Produces(MediaType.APPLICATION_JSON)

public Response veri()
{
    
    if (valor == true)
            {
    return Response.status(Response.Status.OK).
            entity("")
            .build();
            }
    
    else
        
    return Response.status(Response.Status.NOT_FOUND)
            .build();
}

}
