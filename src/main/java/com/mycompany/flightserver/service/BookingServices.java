/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver.service;

import com.mycompany.flightserver.hibernate.HibernateQueries;
import com.mycompany.flightserver.model.Booking;
import java.util.List;

/**
 *
 * @author Loki
 */
public class BookingServices {
    
    HibernateQueries hibernateQueries = new HibernateQueries();
    
    public BookingServices(){
        
    }
    
    //Hämtar en bokning
    public Booking getBooking(int bookingId){
        return hibernateQueries.getBooking(bookingId);  
    }
    
    //Hämtar alla bokningar
    public List<Booking> getBookings(){
        return hibernateQueries.getBookings();
    }
    
    //Skapar en bokning
    public Booking createBooking(Booking b){
        return hibernateQueries.createBooking(b);
    }
    
    //Tar bort en bokning
    public void deleteBooking(int bookingId){
        hibernateQueries.deleteBooking(bookingId);
    }
}
