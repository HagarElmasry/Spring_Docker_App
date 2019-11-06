package demo.springdocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import demo.springdocker.dao.CountryRepository;

@RestController
@RequestMapping("/")
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;
	
	@GetMapping("/{code}")
    public List<String> home(@PathVariable String code){
	
		//Due to ERROR:  constraint "uk_hh2sr9vn57r9h5r45697kvska" of relation "country_language" does not exist
		// every country has many languages so 
		//country data contains [name,continent,population,life_expectancy,country_language,
		//percentage(to differentiate between languages)]

		List<String> countryData = countryRepository.findByCode(code);
		
		if(countryData.isEmpty() || countryData.size() == 0) {
			throw new CodeNotFoundException("INVALID_COUNTRY_CODE");
		}
		
        return countryData;
    }
	
	



}
