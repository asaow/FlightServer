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
 * @author Grupp 2
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

    @GET
    @Path("{fromAirportCode}/{toAirportCode}/{depDate}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Flight> getFlightsBySelection(
            @PathParam("fromAirportCode") String fromAirportCode,
            @PathParam("toAirportCode") String toAirportCode,
            @PathParam("depDate") String depDate) {

        return flightService.getFlightsBySelection(fromAirportCode, toAirportCode, depDate);
    }
}
