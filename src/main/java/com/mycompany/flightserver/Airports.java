/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver;

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
@Path("/airports")
public class Airports {

    AirportServices airportService = new AirportServices();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Airport> getAirports() {
        return airportService.getAirports();
    }

    @GET
    @Path("/{airportId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Airport getAirport(@PathParam("airportId") int airportId) {
        return airportService.getAirport(airportId);

    }

}
