package com.pragma.powerup.restaurantmicroservice.domain.spi;

import com.pragma.powerup.restaurantmicroservice.domain.model.Person;

public interface IPersonPersistencePort {
    void savePerson(Person person);
}
