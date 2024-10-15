package co.edu.uco.ucobet.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.ucobet.generales.domain.city.exceptions.CityIdFormatIsNotValidException;
import co.edu.uco.ucobet.ucobet.generales.domain.city.exceptions.CityIdIsEmptyException;
import co.edu.uco.ucobet.ucobet.generales.domain.city.rules.CityIdIsNotEmptyRule;

public final class CityIdIsNotEmptyRuleImpl implements CityIdIsNotEmptyRule {

    @Override
    public void execute(CityDomain data) {
        if(ObjectHelper.isNull(data)){
            throw CityIdIsEmptyException.create();
        }
    }
}
