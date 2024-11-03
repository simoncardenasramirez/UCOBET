package co.edu.uco.UcoBet.generales.application.secondaryports.mapper;

import co.edu.uco.UcoBet.generales.application.secondaryports.entity.CityEntity;
import co.edu.uco.UcoBet.generales.application.secondaryports.entity.CountryEntity;
import co.edu.uco.UcoBet.generales.application.secondaryports.entity.StateEntity;
import co.edu.uco.UcoBet.generales.domain.city.CityDomain;
import co.edu.uco.UcoBet.generales.domain.country.CountryDomain;
import co.edu.uco.UcoBet.generales.domain.state.StateDomain;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-03T15:19:23-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.50.v20240918-0643_BETA_JAVA23, environment: Java 23 (Eclipse Adoptium)"
)
public class CityEntityMapperImpl implements CityEntityMapper {

    @Override
    public CityEntity toEntity(CityDomain domain) {
        if ( domain == null ) {
            return null;
        }

        UUID id = null;
        String name = null;
        StateEntity state = null;

        id = domain.getId();
        name = domain.getName();
        state = stateDomainToStateEntity( domain.getState() );

        CityEntity cityEntity = new CityEntity( id, name, state );

        return cityEntity;
    }

    @Override
    public List<CityEntity> toEntityCollection(List<CityDomain> domainCollection) {
        if ( domainCollection == null ) {
            return null;
        }

        List<CityEntity> list = new ArrayList<CityEntity>( domainCollection.size() );
        for ( CityDomain cityDomain : domainCollection ) {
            list.add( toEntity( cityDomain ) );
        }

        return list;
    }

    protected CountryEntity countryDomainToCountryEntity(CountryDomain countryDomain) {
        if ( countryDomain == null ) {
            return null;
        }

        CountryEntity countryEntity = new CountryEntity();

        countryEntity.setId( countryDomain.getId() );
        countryEntity.setName( countryDomain.getName() );

        return countryEntity;
    }

    protected StateEntity stateDomainToStateEntity(StateDomain stateDomain) {
        if ( stateDomain == null ) {
            return null;
        }

        StateEntity stateEntity = new StateEntity();

        stateEntity.setId( stateDomain.getId() );
        stateEntity.setName( stateDomain.getName() );
        stateEntity.setCountry( countryDomainToCountryEntity( stateDomain.getCountry() ) );

        return stateEntity;
    }
}
