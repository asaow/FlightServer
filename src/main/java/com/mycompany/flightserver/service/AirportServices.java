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

    //Hämtar alla flygplatser
    public List<Airport> getAirports() {
        System.out.println("********************* getAirports() inne i AirportServices *********************");

        return hibernateQueries.getAirports();
    }

    //Hämtar en flygplats
    public Airport getAirport(int id) {
        System.out.println("********************* getAirport() inne i AirportServices *********************");
        //Hit kommer vi!!!
        return hibernateQueries.getAirport(id);
    }

}
