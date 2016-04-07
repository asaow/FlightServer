/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Flight implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private Airport fromAirport;
    private Airport toAirport;
    private Calendar depDate;
    private Calendar arrDate;
    private Calendar depTime;
    private Calendar arrTime;
    private String duration;
    private int nbrOfConnections;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "flights")
    private Collection<Airport> airports = new ArrayList<Airport>();

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Booking> bookings = new ArrayList<Booking>();

    public Collection<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Collection<Booking> bookings) {
        this.bookings = bookings;
    }

    public Collection<Airport> getAirports() {
        return airports;
    }

    public void setAirports(Collection<Airport> airports) {
        this.airports = airports;
    }

    public Flight() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Airport getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(Airport fromAirport) {
        this.fromAirport = fromAirport;
    }

    public Airport getToAirport() {
        return toAirport;
    }

    public void setToAirport(Airport toAirport) {
        this.toAirport = toAirport;
    }

    public Calendar getDepDate() {
        return depDate;
    }

    public void setDepDate(Calendar depDate) {
        this.depDate = depDate;
    }

    public Calendar getArrDate() {
        return arrDate;
    }

    public void setArrDate(Calendar arrDate) {
        this.arrDate = arrDate;
    }

    public Calendar getDepTime() {
        return depTime;
    }

    public void setDepTime(Calendar depTime) {
        this.depTime = depTime;
    }

    public Calendar getArrTime() {
        return arrTime;
    }

    public void setArrTime(Calendar arrTime) {
        this.arrTime = arrTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getNbrOfConnections() {
        return nbrOfConnections;
    }

    public void setNbrOfConnections(int nbrOfConnections) {
        this.nbrOfConnections = nbrOfConnections;
    }

}
