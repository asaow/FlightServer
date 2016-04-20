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

    //Hämtar en bokning
    public Booking getBooking(int bookingId) {
        return hibernateQueries.getBooking(bookingId);
    }

    //Hämtar alla bokningar
    public List<Booking> getBookings() {
        return hibernateQueries.getBookings();
    }

    //Skapar en bokning
    public Booking createBooking(Booking b) {
        return hibernateQueries.createBooking(b);
    }

    //Tar bort en bokning
    public void deleteBooking(int bookingId) {
        hibernateQueries.deleteBooking(bookingId);
    }
}
