package co.edu.uco.ucobet.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.ucobet.generales.domain.city.exceptions.CityIdFormatIsNotValidException;
import co.edu.uco.ucobet.ucobet.generales.domain.city.rules.CityIdFormatIsValidRule;
import co.edu.uco.ucobet.ucobet.generales.domain.state.StateDomain;

import java.util.UUID;

public final class CityIdFormatIsValidRuleImpl implements CityIdFormatIsValidRule {


    @Override
    public void execute(UUID data) {
        if(UUIDHelper.isDefault(data)){
            throw CityIdFormatIsNotValidException.create();
        }
    }
}
