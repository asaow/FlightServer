package com.mycompany.flightserver.service;

import com.mycompany.flightserver.hibernate.HibernateQueries;
import com.mycompany.flightserver.model.Airport;
import java.util.List;

/**
 *
 * @author Grupp 2
 */
public class AirportServices {

    HibernateQueries hibernateQueries = new HibernateQueries();

    public AirportServices() {

    }

    /**
     * Metoden getAirports hämtar en lista med alla flygplatser.
     *
     * @return en lista med alla flygplatser
     */
    public List<Airport> getAirports() {

        return hibernateQueries.getAirports();
    }

    /**
     * Metoden getAirport hämtar en flygplats.
     *
     * @param id
     * @return en flygplats
     */
    public Airport getAirport(int id) {

        return hibernateQueries.getAirport(id);
    }

}
