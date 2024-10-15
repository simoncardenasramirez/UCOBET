package co.edu.uco.ucobet.ucobet.generales.application.secondaryports.mapper;

import co.edu.uco.ucobet.ucobet.generales.application.secondaryports.entity.CountryEntity;
import co.edu.uco.ucobet.ucobet.generales.domain.country.CountryDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CountryEntityMapper {

    CountryEntityMapper INSTANCE = Mappers.getMapper(CountryEntityMapper.class);

    CountryEntity toEntity(CountryDomain domain);

    CountryDomain toDomain(CountryEntity entity);

    List<CountryEntity> toEntityCollection(List<CountryDomain> domainCollection);

    List<CountryDomain> toDomainCollection(List<CountryEntity> entityCollection);

}
