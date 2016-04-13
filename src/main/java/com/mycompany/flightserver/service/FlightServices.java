/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver.service;

import com.mycompany.flightserver.hibernate.HibernateQueries;
import com.mycompany.flightserver.model.Flight;
import java.util.List;

/**
 *
 * @author Nanali67
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

}
