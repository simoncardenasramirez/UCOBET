package co.edu.uco.ucobet.ucobet.generales.application.primaryports.mapper;

import co.edu.uco.ucobet.ucobet.generales.application.primaryports.dto.CountryDto;
import co.edu.uco.ucobet.ucobet.generales.domain.country.CountryDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CountryDtoMapper {

    CountryDtoMapper INSTANCE = Mappers.getMapper(CountryDtoMapper.class);

    CountryDto toDto(CountryDomain domain);

    CountryDomain toDomain(CountryDto dto);

    List<CountryDto> toDTOCollection(List<CountryDomain> domainCollection);

    List<CountryDomain> toDomainCollection(List<CountryDto> dtoCollection);
}
