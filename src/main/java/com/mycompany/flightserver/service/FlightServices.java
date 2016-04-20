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

    List<Flight> flightList;

    public FlightServices() {

    }

    public List<Flight> getFlights() {
        System.out.println("inne i Flightservice");
        return hibernateQueries.getFlights();
    }

    public Flight getFlight(int id) {
        return hibernateQueries.getFlight(id);
    }

//    public  List<Flight> getFlightsBySelection(Flight search) {
//        return hibernateQueries.getFlightsBySelection(search);
//    }
    public List<Flight> getFlightsBySelection(String fromAirportCode, String toAirportCode, String depDate) {
        return hibernateQueries.getFlightsBySelection(fromAirportCode, toAirportCode, depDate);
    }
    //Checka flight
//        public Flight checkFlight(Flight f) {
//        System.out.println("inne i Flightservice");
//        return hibernateQueries.checkFlight(f);
//    }
}
