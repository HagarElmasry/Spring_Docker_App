package demo.springdocker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.springdocker.entity.CountryLanguage;

@RepositoryRestResource(path="languages")
public interface LanguageRepository extends JpaRepository<CountryLanguage, Integer>  {

}
