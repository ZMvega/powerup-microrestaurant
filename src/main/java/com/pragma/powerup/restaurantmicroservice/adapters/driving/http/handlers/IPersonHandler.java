package com.pragma.powerup.restaurantmicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.restaurantmicroservice.adapters.driving.http.dto.request.PersonRequestDto;

public interface IPersonHandler {
    void savePerson(PersonRequestDto personRequestDto);
}
