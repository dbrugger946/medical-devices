package com.demo;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import io.smallrye.mutiny.Uni;


@Path("/evaluate")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
public class ListenerResource {

    @POST 
    public Uni<String> load(SensorValue sensorValue) {
        System.out.println("Sensor Reading: " + sensorValue.getSource());
        return Uni.createFrom().item(sensorValue.getType() + " " + sensorValue.getValue().toString() + " " + sensorValue.getEventDateTime());
    }
    
}
