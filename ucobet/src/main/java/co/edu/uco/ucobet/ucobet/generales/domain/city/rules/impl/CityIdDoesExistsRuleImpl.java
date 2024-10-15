package co.edu.uco.ucobet.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet.generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.ucobet.generales.domain.city.exceptions.CityIdDoesNotExistsException;
import co.edu.uco.ucobet.ucobet.generales.domain.city.rules.CityIdDoesExistsRule;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.UUID;

public final class CityIdDoesExistsRuleImpl implements CityIdDoesExistsRule {

    private CityRepository cityRepository;


    public CityIdDoesExistsRuleImpl(final CityRepository cityRepository) {
        this.cityRepository=cityRepository;
    }


    @Override
    public void execute(final UUID data) {
        if(!cityRepository.existsById(data)){
            throw CityIdDoesNotExistsException.create();
        }
    }
}
