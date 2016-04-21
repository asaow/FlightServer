package com.mycompany.flightserver.service;

import com.mycompany.flightserver.hibernate.HibernateQueries;
import com.mycompany.flightserver.model.Booking;
import java.util.List;

/**
 *
 * @author Grupp 2
 */
public class BookingServices {

    HibernateQueries hibernateQueries = new HibernateQueries();

    public BookingServices() {

    }

    /**
     * Metoden getBooking hämtar en bokning.
     *
     * @param bookingId
     * @return en bokning
     */
    public Booking getBooking(int bookingId) {
        return hibernateQueries.getBooking(bookingId);
    }

    /**
     * Metoden getBookings hämtar en lista med alla bokningar.
     *
     * @return en lista med alla bokningar
     */
    public List<Booking> getBookings() {
        return hibernateQueries.getBookings();
    }

    /**
     * Metoden createBooking skapar en bokning.
     *
     * @param b
     * @return en bokning
     */
    public Booking createBooking(Booking b) {
        return hibernateQueries.createBooking(b);
    }

    /**
     * Metoden deleteBooking tar bort en bokning.
     *
     * @param bookingId
     */
    public void deleteBooking(int bookingId) {
        hibernateQueries.deleteBooking(bookingId);
    }
}
