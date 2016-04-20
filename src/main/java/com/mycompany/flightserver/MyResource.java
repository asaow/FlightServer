package com.mycompany.flightserver;

import com.mycompany.flightserver.model.Flight;
import com.mycompany.flightserver.model.Search;
import com.mycompany.flightserver.service.FlightServices;
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
 * Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {

    FlightServices fs = new FlightServices();

    /**
     * Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     *
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET
    @Produces("text/plain")
    public String getIt() {
        return "Hi there!";
    }
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Flight> getFlightsBySelection(
//            Flight search) {
//        return fs.getFlightsBySelection(search);
//    }  
//
//    @POST
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces({MediaType.APPLICATION_JSON})
//    public List<Flight> searchFlight(Flight s) {
//
//        return fs.getFlightsBySelection(s);
//    }

}
