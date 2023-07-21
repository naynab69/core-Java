package com.tnsif.dayseven.compiletimedemo;

public class Point {
	private float x;
	private float y;

	// default constructor
	public Point() {

		x = 0.0f;
		y = 0.0f;
	}

	
	//parameterized con./constructor overloading
		public Point(float x) {
			this.x = x;
			this.y = x;
		}

	
	//parameterized con./constructor overloading
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	
}
