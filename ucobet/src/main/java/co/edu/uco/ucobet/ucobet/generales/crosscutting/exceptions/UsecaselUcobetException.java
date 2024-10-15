package co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions.enums.Layer;

public final class UsecaselUcobetException extends  UcobetException{

        private static final long serialVersionUID = 1L;

    public UsecaselUcobetException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.USECASE, rootException);
    }

    public static final UsecaselUcobetException create(final String technicalMessage, final String userMessage, final Exception rootException){
        return new UsecaselUcobetException(technicalMessage, userMessage, rootException);
    }

    public static final UsecaselUcobetException create(final String userMessage, final Exception rootException){
        return new UsecaselUcobetException(userMessage, userMessage, rootException);
    }

    public static final UsecaselUcobetException create(final String technicalMessage, final String userMessage){
        return new UsecaselUcobetException(technicalMessage, userMessage, new Exception());
    }

    public static final UsecaselUcobetException create(final String userMessage){
        return new UsecaselUcobetException(userMessage, userMessage, new Exception());
    }


}
