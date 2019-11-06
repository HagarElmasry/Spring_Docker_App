package demo.springdocker.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;

import java.net.ConnectException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import demo.springdocker.entity.Country;

@DataJpaTest
class CountryRepositoryTest {

	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private CountryRepository countryRepository;
 

	
	@Test
	public void findByCodeTest() {
		Country country = new Country();
	    country.setCode("Egy");
		entityManager.persist(country);
	    entityManager.flush();
	 
	    List<String> returnedCountry = countryRepository.findByCode(country.getCode());
	 
	    assertFalse(returnedCountry.isEmpty());
	    Assertions.assertTrue(!returnedCountry.isEmpty());
	    Assertions.assertTrue(returnedCountry.isEmpty(), "INVALID_COUNTRY_CODE");
	}
	
	@Test
	public void connectionExceptionTest() {
		ConnectException ex = new ConnectException();  
	    Assertions.assertTrue(ex instanceof ConnectException,"INTERNAL_ERROR");
	}

}
