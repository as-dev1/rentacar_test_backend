package com.rent.rentacar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ReservationNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ReservationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> reservationNotFoundHandler(ReservationNotFoundException exception) {
        Map<String,String> map = new HashMap<>();
        map.put("errorMessage", exception.getMessage());

        return map;
    }
}