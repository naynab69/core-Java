package com.tnsif.dayeight.abstractclassdemo;

public class Rectangle extends Shape {

	float width, height;

	// Constructors
	public Rectangle() {

		width = 3.2f;
		height = 2.0f;
	}

	public Rectangle(float width, float height) {

		this.width = width;
		this.height = height;
	}

	@Override
	public void calArea() {
	this.area=width*height;

	}

}
