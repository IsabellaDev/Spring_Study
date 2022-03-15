package springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	private String firstName;
	
	@NotNull(message="Last name is required.") //validation rules
	@Size(min=1, message="Last name is required.")
	private String lastName;
	
	@NotNull(message="Value here is required.")
	@Min(value=0, message="It must be greater than or equal to 0.")
	@Max(value=10, message="It must be less than or equal to 10.")
	private Integer freePasses;
	
	@Pattern(regexp="[a-zA-Z][0-9][a-zA-z] [0-9][a-zA-z][0-9]", message="It should follow pattern \"A1B 2RC\".")
	private String postalCode;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;

	private String favoriteLanguage;
	
	private String[] operatingSystems;
	

	public Student() {
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("CA", "Canada");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
}
