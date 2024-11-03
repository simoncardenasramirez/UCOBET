package co.edu.uco.UcoBet.generales.application.secondaryports.mapper;

import co.edu.uco.UcoBet.generales.application.secondaryports.entity.CountryEntity;
import co.edu.uco.UcoBet.generales.application.secondaryports.entity.StateEntity;
import co.edu.uco.UcoBet.generales.domain.country.CountryDomain;
import co.edu.uco.UcoBet.generales.domain.state.StateDomain;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-03T15:19:23-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.50.v20240918-0643_BETA_JAVA23, environment: Java 23 (Eclipse Adoptium)"
)
public class StateEntityMapperImpl implements StateEntityMapper {

    @Override
    public StateEntity toEntity(StateDomain domain) {
        if ( domain == null ) {
            return null;
        }

        StateEntity stateEntity = new StateEntity();

        stateEntity.setId( domain.getId() );
        stateEntity.setName( domain.getName() );
        stateEntity.setCountry( countryDomainToCountryEntity( domain.getCountry() ) );

        return stateEntity;
    }

    @Override
    public List<StateEntity> toEntityCollection(List<StateDomain> domainCollection) {
        if ( domainCollection == null ) {
            return null;
        }

        List<StateEntity> list = new ArrayList<StateEntity>( domainCollection.size() );
        for ( StateDomain stateDomain : domainCollection ) {
            list.add( toEntity( stateDomain ) );
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
}
