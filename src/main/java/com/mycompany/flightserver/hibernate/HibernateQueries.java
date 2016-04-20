/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver.hibernate;

import com.mycompany.flightserver.model.Airport;

import com.mycompany.flightserver.model.Flight;
import java.util.Collection;

import com.mycompany.flightserver.model.Booking;
import com.mycompany.flightserver.model.Search;
import java.util.Date;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author asa
 */
public class HibernateQueries {

    SessionFactory sessionFactory = MyHibernateUtil.getSessionFactory();

    /**
     * Metoden getAirport hämtar en flygplats, dvs ett objekt av Airport, med id
     * = airportId
     *
     * @param airportId
     * @return
     */
    public Airport getAirport(int airportId) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Airport a = (Airport) session.get(Airport.class, airportId);

        session.getTransaction().commit();
        // session.close();

        return a;
    }

    public List<Airport> getAirports() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        System.out.println("************************* getAirport() inne i hibernate ****************************");

        List<Airport> airports = session.createCriteria(Airport.class).list();

        session.getTransaction().commit();
        System.out.println("************************* getAirport() inne i hibernate, efter commit ****************************");

        //session.close();
        return airports;
    }

    public Flight getFlight(int flightId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Flight f = (Flight) session.get(Flight.class, flightId);
        session.getTransaction().commit();
        // session.close();

        return f;
    }

    /**
     * Hämtar en bokning
     *
     * @param bookingId bokningens id
     * @return en bokning
     */
    public Booking getBooking(int bookingId) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Booking b = (Booking) session.get(Booking.class, bookingId);

        session.getTransaction().commit();
        session.close();
        return b;
    }

    public List<Flight> getFlights() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Flight> flights = session.createCriteria(Flight.class).list();

        session.getTransaction().commit();
        //session.close();
        return flights;

    }

//    public List<Flight> getFlightsBySelection(String fromAirportCode, String toAirportCode, String depDate) {
//
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        List<Flight> flights = (List<Flight>) session.createQuery("FROM Flight WHERE fromAirportCode = '" + fromAirportCode + "'"
//                + " AND toAirportCode= '" + toAirportCode + "'" + "AND depDate= '" + depDate + "'").list();
//        session.getTransaction().commit();
//        return flights;
//    }

    public List<Flight> getFlightsBySelection(String fromAirportCode, String toAirportCode, String depDate) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Flight> flights
                = session.createQuery("FROM Flight WHERE fromAirportCode = '" + fromAirportCode + "'"
                        + " AND toAirportCode= '" + toAirportCode + "'" + "AND depDate= '" + depDate + "'").list();
        session.getTransaction().commit();
        return flights;
    }
    
//        public List<Flight> getFlightsBySelection(Flight search) {
//
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        List<Flight> flights = (List<Flight>) session.createQuery("FROM Flight WHERE fromAirportCode = '" + search.getFromAirportCode() + "'"
//                + " AND toAirportCode= '" + search.getToAirportCode() + "'" + "AND depDate= '" + search.getDepDate() + "'").list();
//        session.getTransaction().commit();
//        return flights;
//    }

    /**
     * Hämtar alla bokningar
     *
     * @return en lista med alla bokningar
     */
    public List<Booking> getBookings() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Booking> bookings = session.createCriteria(Booking.class).list();

        session.getTransaction().commit();
        session.close();

        return bookings;
    }

    /**
     * Skapar en bokning
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
     * Tar bort en bokning
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
