package co.edu.uco.ucobet.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityIdFormatIsNotValidException extends RuleUcobetException {
    private static final long serialVersionUID = 1L;

    public CityIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }

    public static final CityIdFormatIsNotValidException create(){
        var userMessage = "La ciudad tiene un identificador con formato no válido al valor por defecto ...";
        return new CityIdFormatIsNotValidException(userMessage,userMessage, new Exception());
    }

}
