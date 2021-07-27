package com.frankmoley.lil.roomreservationservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Esta marcação faz com que o Feign encontre o serviço e faça o parse da chamada
@FeignClient("guestservices")
public interface GuestClient {

    @GetMapping("/guests")
    List<Guest> getAllGuests();

    @GetMapping("/guests/{id}")
    Guest getGuest(@PathVariable("id")long id);
}