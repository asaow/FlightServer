package com.mycompany.flightserver.service;

import com.mycompany.flightserver.hibernate.HibernateQueries;
import com.mycompany.flightserver.model.Flight;
import java.util.List;

/**
 *
 * @author Grupp 2
 */
public class FlightServices {

    HibernateQueries hibernateQueries = new HibernateQueries();

    public FlightServices() {

    }

    /**
     * Metoden getFlights hämtar en lista med alla flights.
     *
     * @return en lista med alla flights
     */
    public List<Flight> getFlights() {
        return hibernateQueries.getFlights();
    }

    /**
     * Metoden getFlight hämtar en flight.
     *
     * @param id
     * @return en flight
     */
    public Flight getFlight(int id) {
        return hibernateQueries.getFlight(id);
    }

    /**
     * Metoden getFlightsBySelection returnerar en lista med flights enligt
     * sökkriterierna.
     *
     * @param fromAirportCode
     * @param toAirportCode
     * @param depDate
     * @return en lista med flights
     */
    public List<Flight> getFlightsBySelection(String fromAirportCode, String toAirportCode, String depDate) {
        return hibernateQueries.getFlightsBySelection(fromAirportCode, toAirportCode, depDate);
    }

}
