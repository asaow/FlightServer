package com.mycompany.flightserver.hibernate;

import com.mycompany.flightserver.model.Airport;

import com.mycompany.flightserver.model.Flight;

import com.mycompany.flightserver.model.Booking;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Grupp 2
 */
public class HibernateQueries {

    SessionFactory sessionFactory = MyHibernateUtil.getSessionFactory();

    /**
     * Metoden getAirport hämtar en flygplats.
     *
     * @param airportId
     * @return en flygplats
     */
    public Airport getAirport(int airportId) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Airport a = (Airport) session.get(Airport.class, airportId);

        session.getTransaction().commit();
        // session.close();

        return a;
    }

    /**
     * Metoden getAirports returnerar en lista med alla flygplatser.
     *
     * @return en lista med alla flygplatser
     */
    public List<Airport> getAirports() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Airport> airports = session.createCriteria(Airport.class).list();

        session.getTransaction().commit();

        //session.close();
        return airports;
    }

    /**
     * Metoden getFlight returnerar en flight.
     *
     * @param flightId
     * @return en flight
     */
    public Flight getFlight(int flightId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Flight f = (Flight) session.get(Flight.class, flightId);
        session.getTransaction().commit();
        // session.close();

        return f;
    }

    /**
     * Metoden getFlights returnerar en lista med alla flights.
     *
     * @return en lista med alla flights
     */
    public List<Flight> getFlights() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Flight> flights = session.createCriteria(Flight.class).list();

        session.getTransaction().commit();
        //session.close();
        return flights;

    }

    /**
     * Metoden getFlightsBySelection returnerar en lista med flights enligt sökkriterierna.
     *
     * @param fromAirportCode
     * @param toAirportCode
     * @param depDate
     * @return en lista med flights
     */
    public List<Flight> getFlightsBySelection(String fromAirportCode, String toAirportCode, String depDate) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Flight> flights
                = session.createQuery("FROM Flight WHERE fromAirportCode = '" + fromAirportCode + "'"
                        + " AND toAirportCode= '" + toAirportCode + "'" + "AND depDate= '" + depDate + "'").list();
        session.getTransaction().commit();
        return flights;
    }

    /**
     * Metoden getBookings hämtar en lista med alla bokningar.
     *
     * @return en lista med alla bokningar
     */
    public List<Booking> getBookings() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Booking> bookings = session.createCriteria(Booking.class).list();

        session.getTransaction().commit();
        //session.close();

        return bookings;
    }

    /**
     * Metoden getBooking hämtar en bokning.
     *
     * @param bookingId bokningens id
     * @return en bokning
     */
    public Booking getBooking(int bookingId) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Booking b = (Booking) session.get(Booking.class, bookingId);

        session.getTransaction().commit();
        //session.close();
        return b;
    }

    /**
     * Metoden createBooking skapar en bokning.
     *
     * @param b bokning
     * @return en bokning
     */
    public Booking createBooking(Booking b) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(b);

        session.getTransaction().commit();
        session.close();

        return b;
    }

    /**
     * Metoden deleteBooking tar bort en bokning.
     *
     * @param bookingId bokningsnummer
     */
    public void deleteBooking(int bookingId) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Booking b = (Booking) session.get(Booking.class, bookingId);
        session.delete(b);

        session.getTransaction().commit();
        session.close();
    }

}
