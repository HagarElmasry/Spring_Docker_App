package demo.springdocker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="country_language")
@IdClass(LanguageId.class)
public class CountryLanguage {

	@Id
	@OneToOne
    @JoinColumn(name = "country_code")
	private Country country;

	@Id
	@Column(name="language")
	private String language;
	
	@Column(name="is_official")
	private boolean isOfficial ;
	
	@Column(name="percentage")
	private float percentage ;

	
	

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isOfficial() {
		return isOfficial;
	}

	public void setOfficial(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "CountryLanguage [country=" + country + ", language=" + language + ", isOfficial=" + isOfficial
				+ ", percentage=" + percentage + "]";
	}
	
	
}
