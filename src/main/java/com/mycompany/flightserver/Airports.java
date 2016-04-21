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

    /**
     * Metoden getAirports hämtar en lista med alla flygplatser.
     *
     * @return en lista med alla flygplatser
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Airport> getAirports() {
        return airportService.getAirports();
    }

    /**
     * Metoden getAirport hämtar en flygplats.
     *
     * @param airportId
     * @return en flygplats
     */
    @GET
    @Path("/{airportId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Airport getAirport(@PathParam("airportId") int airportId) {
        return airportService.getAirport(airportId);

    }
}
