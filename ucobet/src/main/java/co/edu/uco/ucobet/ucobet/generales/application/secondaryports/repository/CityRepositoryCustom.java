package co.edu.uco.ucobet.ucobet.generales.application.secondaryports.repository;

import co.edu.uco.ucobet.ucobet.generales.application.secondaryports.entity.CityEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepositoryCustom {

    List<CityEntity> findByFilter(CityEntity filter);
}
