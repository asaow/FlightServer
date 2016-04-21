package com.mycompany.flightserver.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Grupp 2
 */
@Entity
@XmlRootElement
public class Booking implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    private Flight flight;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Passenger> passengers = new ArrayList<Passenger>();

    private String type;
    public static final String FIRST_CLASS_TYPE = "FÖRSTA KLASS";
    public static final String BUSINESS_TYPE = "BUSINESSKLASS";
    public static final String ECONOMY_TYPE = "EKONOMIKLASS";
    
    public Booking(){
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String getFIRST_CLASS_TYPE() {
        return FIRST_CLASS_TYPE;
    }

    public static String getBUSINESS_TYPE() {
        return BUSINESS_TYPE;
    }

    public static String getECONOMY_TYPE() {
        return ECONOMY_TYPE;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Collection<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Collection<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
