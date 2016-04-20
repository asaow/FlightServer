package com.mycompany.flightserver.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Grupp 2
 */
@Entity
@XmlRootElement
public class Airport implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String code;
    private String name;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "Airport_Departures") 
//    @LazyCollection(LazyCollectionOption.FALSE) 
//    private Collection<Flight> departures = new ArrayList<Flight>();
//
//    public Collection<Flight> getArrivals() {
//        return arrivals;
//    }
//
//    public void setArrivals(Collection<Flight> arrivals) {
//        this.arrivals = arrivals;
//    }
//
//    public Collection<Flight> getDepartures() {
//        return departures;
//    }
//
//    public void setDepartures(Collection<Flight> departures) {
//        this.departures = departures;
//    }
    
   
}
