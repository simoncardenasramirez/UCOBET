package co.edu.uco.ucobet.ucobet.generales.application.secondaryports.mapper;

import co.edu.uco.ucobet.ucobet.generales.application.secondaryports.entity.StateEntity;
import co.edu.uco.ucobet.ucobet.generales.domain.state.StateDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StateEntityMapper {

    StateEntityMapper INSTANCE = Mappers.getMapper(StateEntityMapper.class);

    StateEntity toEntity(StateDomain domain);

    StateDomain toDomain(StateEntity entity);

    List<StateEntity> toEntityCollection(List<StateDomain> domainCollection);

    List<StateDomain> toDomainCollection(List<StateEntity> entityCollection);


}
