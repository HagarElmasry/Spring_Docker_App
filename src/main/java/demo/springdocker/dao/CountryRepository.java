package demo.springdocker.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.springdocker.entity.Country;


@RepositoryRestResource(path="countries")
public interface CountryRepository extends JpaRepository<Country, Integer>  {

	
	@Query("Select DISTINCT country.name, country.continent, country.population, country.lifeExpectancy, language.language ,"
			+ " language.percentage from Country country join CountryLanguage language"
			+ " on country.code = language.country.code and language.percentage>0 and language.country.code=:code")
	public List<String> findByCode(@Param("code")String code);
	
	
}
