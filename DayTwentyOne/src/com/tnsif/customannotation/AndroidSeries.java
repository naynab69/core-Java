package com.tnsif.customannotation;

@SmartTV(height = 40, os = "android", width = 50)
@SmartPhone
public class AndroidSeries {
	
	String model;
	
	int ScreenSize;

	public AndroidSeries(String model, int screenSize) {
		super();
		this.model = model;
		ScreenSize = screenSize;
	}
	
	

}
