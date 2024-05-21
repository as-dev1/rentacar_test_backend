package com.rent.rentacar.services;

import com.rent.rentacar.exception.ReservationNotFoundException;
import com.rent.rentacar.models.Reservation;
import com.rent.rentacar.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository repository;

    public List<Reservation> getAllReservations() {
        return repository.findAll();
    }

    public Reservation getReservationById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new ReservationNotFoundException(id));
    }

    public Reservation createReservation(Reservation reservation) {
        return repository.save(reservation);
    }

    public String deleteReservation(Integer id) {
        if (!repository.existsById(id)) {
            throw new ReservationNotFoundException(id);
        }
        repository.deleteById(id);
        return "Reservation with id " + id + " has been deleted successfully";

    }
}