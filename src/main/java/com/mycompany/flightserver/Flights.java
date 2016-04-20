/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver;

import com.mycompany.flightserver.model.Flight;
import com.mycompany.flightserver.model.Search;
import com.mycompany.flightserver.service.FlightServices;
import java.util.Date;
import java.util.List;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Nanali67
 */
@Path("/flights")
public class Flights {

    FlightServices flightService = new FlightServices();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Flight> getFlights() {
        System.out.println("@GET getFlights() inne i flightssss");
        return flightService.getFlights();
    }

    @GET
    @Path("/{flightId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Flight getFlight(@PathParam("flightId") int flightId) {
        System.out.println("@GET @Path(/{flightId}, getFlight() inne i flightssss");
        return flightService.getFlight(flightId);
    }


//    @GET
//    @Path("/search")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Flight> getFlightsBySelection(
//            @PathParam("search") Flight search) {
//        return flightService.getFlightsBySelection(search);
//    }    
   
   
    
    @GET
    @Path("{fromAirportCode}/{toAirportCode}/{depDate}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Flight> getFlightsBySelection(
            @PathParam("fromAirportCode") String fromAirportCode,
            @PathParam("toAirportCode") String toAirportCode,
            @PathParam("depDate") String depDate ) {
        
        return flightService.getFlightsBySelection(fromAirportCode, toAirportCode, depDate);
    }
}
    
//    @GET
//    @Path("{fromAirportCode}/{toAirportCode}/{depDate}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Flight> getFlightsBySelection(
//            @PathParam("fromAirportCode") String fromAirportCode,
//            @PathParam("toAirportCode") String toAirportCode,
//            @PathParam("depDate") String depDate ) {
//        return flightService.getFlightsBySelection(fromAirportCode, toAirportCode, depDate);
//    }
    
    
    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Flight> getFlightsByAirports(String from, String to) {
//        System.out.println("@GET getFlights() inne i flightssss");
//        return flightService.getFlightsByAirports(from, to);
//    }
    
    //Checka flight
//    @POST
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces({MediaType.APPLICATION_JSON})
//    public Flight checkFlight(Flight f) {
//        
//        if (f == null)
//            throw new BadRequestException();    
//        Flight flight = FlightServices.checkFlight(f);
//        System.out.print("added question");
//
//        return flight;   
//   }


