/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver.service;

import com.mycompany.flightserver.model.Airport;
import java.util.List;

/**
 *
 * @author Loki
 */
public class AirportServices {
    
    HibernateQueries hibernateQueries = new HibernateQueries();
    
    public AirportServices(){
        
    }
    
    //Hämtar alla flygplatser
    public List<Airport> getAirports(){
        return hibernateQueries.getAirports();
    }
    
    //Hämtar en flygplats
    public Airport getAirport(int id){
        return hibernateQueries.getAirport();
    }
    
}
