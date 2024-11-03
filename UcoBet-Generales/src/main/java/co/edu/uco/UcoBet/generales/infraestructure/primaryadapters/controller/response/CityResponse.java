package co.edu.uco.UcoBet.generales.infraestructure.primaryadapters.controller.response;

import java.util.ArrayList;



public class CityResponse extends Response<RegisterNewCityDto> {

	public CityResponse() {
		setMensajes(new ArrayList<>());
		setDatos(new ArrayList<>());
	}

}
