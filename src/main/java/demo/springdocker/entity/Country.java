package demo.springdocker.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {

	@Id
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="continent")
	private String continent ;
	
	@Column(name="population")
	private int population ;
	
	@Column(name="life_expectancy")
	private int lifeExpectancy ;
		
	@OneToOne
	@JoinColumn(name = "capital")
	private City City;
		
	@OneToMany(mappedBy = "country")
    private Set<City> cities;
	

	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	
	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	public City getCity() {
		return City;
	}

	public void setCity(City city) {
		City = city;
	}

	
}
