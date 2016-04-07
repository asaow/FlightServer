/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver.hibernate;

import com.mycompany.flightserver.model.Airport;
import com.mycompany.flightserver.model.Flight;
import java.util.Collection;
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
     * @param
     * @return
     */
    public Airport getAirport(int airportId) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Airport a = (Airport) session.get(Airport.class, airportId);

        session.getTransaction().commit();
        session.close();

        return a;
    }

    public List<Airport> getAirports() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Airport> airports = session.createCriteria(Airport.class).list();

        session.getTransaction().commit();
        session.close();

        return airports;
    }

    public Flight getFlight(int flightId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Flight f = (Flight) session.get(Flight.class, flightId);

        session.getTransaction().commit();
        session.close();

        return f;

    }

    public List<Flight> getFlights() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Flight> flights = session.createCriteria(Flight.class).list();

        session.getTransaction().commit();
        //session.close();
        return flights;

    }

}
