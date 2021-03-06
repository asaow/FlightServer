package com.mycompany.flightserver;

import com.mycompany.flightserver.model.Booking;
import com.mycompany.flightserver.service.BookingServices;
import java.util.List;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Grupp 2
 */
@Path("/bookings")
public class Bookings {

    BookingServices bookingService = new BookingServices();

    /**
     * Metoden getBookings hämtar en lista med alla bokningar.
     *
     * @return en lista med alla bokningar
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }

    /**
     * Metoden getBooking hämtar en bokning.
     *
     * @param bookingId
     * @return en bokning
     */
    @GET
    @Path("/{bookingId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Booking getBooking(@PathParam("bookingId") int bookingId) {
        return bookingService.getBooking(bookingId);
    }

    /**
     * Metoden createBooking skapar en bokning.
     *
     * @param b
     * @return en bokning
     */
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Booking createBooking(Booking b) {
        if (b == null) {
            throw new BadRequestException();
        }
        Booking booking = bookingService.createBooking(b);
        return booking;
    }

    /**
     * Metoden deleteBooking tar bort en bokning.
     *
     * @param bookingId
     */
    @DELETE
    @Path("/{bookingId}")
    @Produces({MediaType.APPLICATION_JSON})
    public void deleteBooking(@PathParam("bookingId") int bookingId) {
        bookingService.deleteBooking(bookingId);
    }
}
