package org.dnyanyog;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street1;
	private String street2;
	private String city;
	private String country;
	private String state;
	
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", country=" + country
				+ ", state=" + state + "]";
	}



}
