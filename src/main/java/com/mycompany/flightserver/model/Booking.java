/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Loki
 */
@Entity
@XmlRootElement
public class Booking implements Serializable {

    @Id
    @GeneratedValue
    private int id;

//    @ManyToOne
//    @JoinColumn(name = "Flight_Id")
//    private Flight flight;
//
//    public Flight getFlight() {
//        return flight;
//    }
//
//    public void setFlight(Flight flight) {
//        this.flight = flight;
//    }

//    private Passenger passenger;
//
//    public Passenger getPassenger() {
//        return passenger;
//    }
//
//    public void setPassenger(Passenger passenger) {
//        this.passenger = passenger;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
