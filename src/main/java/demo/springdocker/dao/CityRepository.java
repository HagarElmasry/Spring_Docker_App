package demo.springdocker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.springdocker.entity.City;

@RepositoryRestResource(path="cities")
public interface CityRepository extends JpaRepository<City, Integer>{

}
