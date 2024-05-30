package com.rent.rentacar.repository;

import com.rent.rentacar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findAllByDeletedAtIsNull();

    Optional<Car> findByIdAndDeletedAtIsNull(Integer id);
}
