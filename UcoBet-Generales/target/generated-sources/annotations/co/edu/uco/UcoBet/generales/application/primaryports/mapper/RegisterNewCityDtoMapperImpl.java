package co.edu.uco.UcoBet.generales.application.primaryports.mapper;

import co.edu.uco.UcoBet.generales.application.primaryports.dto.city.RegisterNewCityDto;
import co.edu.uco.UcoBet.generales.domain.city.CityDomain;
import co.edu.uco.UcoBet.generales.domain.state.StateDomain;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-03T15:19:23-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.50.v20240918-0643_BETA_JAVA23, environment: Java 23 (Eclipse Adoptium)"
)
public class RegisterNewCityDtoMapperImpl implements RegisterNewCityDtoMapper {

    @Override
    public CityDomain toDomain(RegisterNewCityDto dto) {
        if ( dto == null ) {
            return null;
        }

        StateDomain state = null;
        String name = null;

        state = mapState( dto.getState() );
        name = dto.getName();

        UUID id = null;

        CityDomain cityDomain = new CityDomain( id, name, state );

        return cityDomain;
    }
}
