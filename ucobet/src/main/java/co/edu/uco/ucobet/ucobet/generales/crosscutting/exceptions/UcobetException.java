package co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.exceptions.enums.Layer;
import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.TextHelper;

public class UcobetException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private String userMessage;
    private Layer layer;

    public  UcobetException(final String technicalMessage, final String userMessage, final Layer layer,final Exception rootException) {

        super(ObjectHelper.getDefault(technicalMessage,TextHelper.applyTrim(technicalMessage)), ObjectHelper.getDefault(rootException,new Exception()));
        setUserMessage(userMessage);
        setLayer(layer);
    }





    public String getUserMessage() {
        return userMessage;
    }

    private void setUserMessage(String userMessage) {
        this.userMessage = TextHelper.applyTrim(userMessage);
    }

    public Layer getLayer() {
        return layer;
    }

    private  void setLayer(Layer layer) {
        this.layer = ObjectHelper.getDefault(layer, Layer.GENERAL);
    }

    public static  UcobetException create(final String technicalMessage, final String userMessage, final Exception rootException){
        return new UcobetException(technicalMessage, userMessage, Layer.GENERAL, rootException);
    }

    public static  UcobetException create(final String technicalMessage, final String userMessage){
        return new UcobetException(technicalMessage, userMessage, Layer.GENERAL, new Exception());
    }

    public static  UcobetException create(final String userMessage){
        return new UcobetException(userMessage, userMessage, Layer.GENERAL, new Exception());
    }

}
