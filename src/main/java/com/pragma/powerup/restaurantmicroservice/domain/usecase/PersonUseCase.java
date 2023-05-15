package com.pragma.powerup.restaurantmicroservice.domain.usecase;

import com.pragma.powerup.restaurantmicroservice.domain.model.Person;
import com.pragma.powerup.restaurantmicroservice.domain.spi.IPersonPersistencePort;
import com.pragma.powerup.restaurantmicroservice.domain.api.IPersonServicePort;

public class PersonUseCase implements IPersonServicePort {
    private final IPersonPersistencePort personPersistencePort;

    public PersonUseCase(IPersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    @Override
    public void savePerson(Person person) {
        personPersistencePort.savePerson(person);
    }
}
