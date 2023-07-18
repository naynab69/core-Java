package com.tnsif.dayfive.multilevelinherdemo;

//Parent Class
public class Country {
	// data members
	private String countryName;
	private String capital;
	private int code;

	// getters and setters
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + ", code=" + code + "]";
	}

}
