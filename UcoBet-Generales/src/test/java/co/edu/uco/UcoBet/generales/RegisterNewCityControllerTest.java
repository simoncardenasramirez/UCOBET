package co.edu.uco.UcoBet.generales;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.edu.uco.UcoBet.generales.application.primaryports.dto.city.RegisterNewCityDto;
import co.edu.uco.UcoBet.generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.UcoBet.generales.crosscutting.exceptions.UcoBetException;
import co.edu.uco.UcoBet.generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.UcoBet.generales.infraestructure.primaryadapters.controller.city.RegisterNewCityController;
import co.edu.uco.UcoBet.generales.infraestructure.primaryadapters.controller.response.CityResponse;

class RegisterNewCityControllerTest {

    @Mock
    private RegisterNewCityInteractor registerNewCityInteractor;

    @InjectMocks
    private RegisterNewCityController registerNewCityController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCrear_CiudadExitosa() {
        // Arrange
        RegisterNewCityDto cityDto = RegisterNewCityDto.create("Rionegro", UUIDHelper.getDefault());

        // Act
        ResponseEntity<CityResponse> response = registerNewCityController.crear(cityDto);

        // Assert
        assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());
        assertTrue(response.getBody().getMensajes().contains("Ciudad creada exitosamente"));
    }

    @Test
    void testCrear_CiudadConExcepcionUcoBet() {
        // Arrange
        RegisterNewCityDto cityDto = RegisterNewCityDto.create("Rionegro", UUIDHelper.getDefault());
        doThrow(UcoBetException.create("Error técnico", "Error de usuario")).when(registerNewCityInteractor).execute(any());

        // Act
        ResponseEntity<CityResponse> response = registerNewCityController.crear(cityDto);

        // Assert
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertTrue(response.getBody().getMensajes().contains("Error de usuario"));
    }


 

}



