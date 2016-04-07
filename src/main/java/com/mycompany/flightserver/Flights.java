/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver;

import com.mycompany.flightserver.model.Flight;
import com.mycompany.flightserver.service.FlightServices;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Nanali67
 */
@Path("/")
public class Flights {

    FlightServices flightService = new FlightServices();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Flight> getFlights() {
        System.out.println("inne i flightssss");
        return flightService.getFlights();
    }

    @GET
    @Path("/{flightID}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Flight getFlight(@PathParam("flightID") int flightID) {
        return flightService.getFlight(flightID);
    }

}
