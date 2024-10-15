package co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions.enums.Layer;

public final class GeneralUcobetException extends  UcobetException{

        private static final long serialVersionUID = 1L;

    public GeneralUcobetException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.GENERAL, rootException);
    }

    public static final GeneralUcobetException create(final String technicalMessage, final String userMessage, final Exception rootException){
        return new GeneralUcobetException(technicalMessage, userMessage, rootException);
    }

    public static final GeneralUcobetException create(final String userMessage, final Exception rootException){
        return new GeneralUcobetException(userMessage, userMessage, rootException);
    }

    public static final GeneralUcobetException create(final String technicalMessage, final String userMessage){
        return new GeneralUcobetException(technicalMessage, userMessage, new Exception());
    }

    public static final GeneralUcobetException create(final String userMessage){
        return new GeneralUcobetException(userMessage, userMessage, new Exception());
    }


}
