package co.edu.uco.ucobet.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public class CityIdIsEmptyException extends RuleUcobetException {
    private static final long serialVersionUID = 1L;

    public CityIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }

    public static final CityIdIsEmptyException create(){
        var userMessage = "La ciudad tiene un identificador vacio ...";
        return new CityIdIsEmptyException(userMessage,userMessage, new Exception());
    }

}
