package co.edu.uco.UcoBet.generales.crosscutting.exceptions.messagecatalog.impl;

import co.edu.uco.UcoBet.generales.crosscutting.exceptions.messagecatalog.data.CodigoMensaje;
import co.edu.uco.UcoBet.generales.crosscutting.exceptions.messagecatalog.data.Mensaje;

public interface MessageCatalog {
	
	void inicializar();
	
	String obtenerContenidoMensaje(final CodigoMensaje codigo,String ...parametros);
	Mensaje obtenerMensaje(final CodigoMensaje codigo,String ...parametros);

}
