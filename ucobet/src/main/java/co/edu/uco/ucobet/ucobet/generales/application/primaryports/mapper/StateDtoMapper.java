package co.edu.uco.ucobet.ucobet.generales.application.primaryports.mapper;

import co.edu.uco.ucobet.ucobet.generales.application.primaryports.dto.StateDto;
import co.edu.uco.ucobet.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.ucobet.generales.domain.state.StateDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StateDtoMapper {

    StateDtoMapper INSTANCE = Mappers.getMapper(StateDtoMapper.class);

    StateDto toDto(CityDomain domain);

    CityDomain toDomain(StateDto dto);

    List<StateDto> toDTOCollection(List<StateDomain> domainCollection);

    List<StateDomain> toDomainCollection(List<StateDto> dtoCollection);
}
