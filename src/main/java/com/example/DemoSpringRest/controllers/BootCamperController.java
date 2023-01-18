package com.example.DemoSpringRest.controllers;

import com.example.DemoSpringRest.models.BootCamper;
import com.example.DemoSpringRest.services.BootCamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootCamperController {

     private BootCamperService bootCamperService;

     public BootCamperController(BootCamperService bootCamperService){
         this.bootCamperService = bootCamperService;

         this.bootCamperService.add( new BootCamper("Uno",Math.random()));
         this.bootCamperService.add( new BootCamper("Dos",Math.random()));
         this.bootCamperService.add( new BootCamper("Tres",Math.random()));
         this.bootCamperService.add( new BootCamper("Cuatro",Math.random()));
     }

     @GET
     @Path("/bootcamper")
     @Produces("application/json")
    public List<BootCamper> listaTodos(){
         return bootCamperService.getAll();
     }
     @GET
     @Path("/bootcamper/{name}")
     @Produces("application/json")
     public BootCamper listaUno(@PathParam("name") String name){
         return bootCamperService.get(name);

     }

     @POST
     @Path("/bootcamper")
     @Produces("application/json")
     @Consumes("application/json")
    public Response meterBootCamper(BootCamper bootCamper){
         bootCamperService.add(bootCamper);
         return Response.created(URI.create("/bootcamper"+bootCamper.getName())).build();
     }


}

