package com.pragma.powerup.restaurantmicroservice.domain.api;

import com.pragma.powerup.restaurantmicroservice.domain.model.Person;

public interface IPersonServicePort {
    void savePerson(Person person);
}
