package com.rent.rentacar.exception;

public class ReservationNotFoundException extends NotFoundException{
    public ReservationNotFoundException(Integer id){
        super("Reservation with id " + id + " not found");
    }
}
