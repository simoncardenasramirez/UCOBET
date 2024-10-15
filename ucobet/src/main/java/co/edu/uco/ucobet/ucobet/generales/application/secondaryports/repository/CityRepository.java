package co.edu.uco.ucobet.ucobet.generales.application.secondaryports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<CityRepository, UUID>, CityRepositoryCustom{

}
