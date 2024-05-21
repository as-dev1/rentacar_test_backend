package com.rent.rentacar.controllers;

import com.rent.rentacar.models.Reservation;
import com.rent.rentacar.services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/reservation")
@RequiredArgsConstructor
public class ReservationController {

    public final ReservationService service;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return service.getAllReservations();
    }

    @GetMapping(path = "/{id}")
    public Reservation getReservationById(@PathVariable Integer id) {
        return service.getReservationById(id);
    }

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return service.createReservation(reservation);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteReservation(@PathVariable Integer id) {
        service.deleteReservation(id);
    }
}
