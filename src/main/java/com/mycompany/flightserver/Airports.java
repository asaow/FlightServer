package com.mycompany.flightserver;

import com.mycompany.flightserver.model.Airport;
import com.mycompany.flightserver.service.AirportServices;
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
@Path("/airports")
public class Airports {

    AirportServices airportService = new AirportServices();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Airport> getAirports() {
        System.out.println("@GET, getAirports() inne i Airportssss");
        return airportService.getAirports();
    }

    @GET
    @Path("/{airportId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Airport getAirport(@PathParam("airportId") int airportId) {
        System.out.println("@GET @Path(/{airportId}, getAirport() inne i Airportssss");
        //Hit kommer vi!
        return airportService.getAirport(airportId);

    }
}
