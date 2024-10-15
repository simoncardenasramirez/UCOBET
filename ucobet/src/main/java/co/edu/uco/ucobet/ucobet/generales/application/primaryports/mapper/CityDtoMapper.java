package co.edu.uco.ucobet.ucobet.generales.application.primaryports.mapper;

import co.edu.uco.ucobet.ucobet.generales.application.primaryports.dto.CityDto;
import co.edu.uco.ucobet.ucobet.generales.domain.city.CityDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CityDtoMapper {

    CityDtoMapper INSTANCE = Mappers.getMapper(CityDtoMapper.class);

    CityDto toDto(CityDomain domain);

    CityDomain toDomain(CityDto dto);

    List<CityDto> toDTOCollection(List<CityDomain> domainCollection);

    List<CityDomain> toDomainCollection(List<CityDto> dtoCollection);

}