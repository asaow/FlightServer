package com.mycompany.flightserver.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Grupp 2
 */
@Entity
@XmlRootElement
public class Flight implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String fromAirport;
    private String toAirport;
    private String fromAirportCode;
    private String toAirportCode;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar depDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar arrDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar depTime;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar arrTime;
    private String airline;
    private double price;
    //private String duration;
    //private int nbrOfConnections;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFromAirportCode() {
        return fromAirportCode;
    }

    public void setFromAirportCode(String fromAirportCode) {
        this.fromAirportCode = fromAirportCode;
    }

    public String getToAirportCode() {
        return toAirportCode;
    }

    public void setToAirportCode(String toAirportCode) {
        this.toAirportCode = toAirportCode;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public Flight() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

//    public String getDuration() {
//        return duration;
//    }
//
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }
//
//    public int getNbrOfConnections() {
//        return nbrOfConnections;
//    }
//
//    public void setNbrOfConnections(int nbrOfConnections) {
//        this.nbrOfConnections = nbrOfConnections;
//    }
}
