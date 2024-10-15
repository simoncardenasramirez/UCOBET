package co.edu.uco.ucobet.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityIdDoesNotExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }

    public static final CityIdDoesNotExistsException create(){
        var userMessage = "No existe la ciudad con el identificador indicado ...";
        return new CityIdDoesNotExistsException(userMessage,userMessage, new Exception());
    }

}
