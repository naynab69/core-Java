package com.tnsif.dayfive.multilevelinherdemo;

//child class for country
public class State extends Country {
	// data members
	private String stateName;
	private String language;

	// Getters and setters
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", getCountryName()=" + getCountryName()
				+ "]";
	}

}
