package demo.springdocker.entity;

import java.io.Serializable;


public class LanguageId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Country country;

	private String language;

	
	public LanguageId() {
		
	}


	public LanguageId(Country country, String language) {
		this.country = country;
		this.language = language;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LanguageId other = (LanguageId) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		return true;
	}


	

	
}
