package com.tnsif.dayseven.covariantoverridingdemo;

//Parent class
class Color {

	protected Color getColor() {
		Color s = new Color();
		return s;
	}

}

//child class
class Red extends Color{
	
	protected Red getColor() {
		Red s = new Red();
		return s;
	}
}


//child class
class Green extends Color{
	
	protected Green getColor() {
		Green s = new Green();
		return s;
	}
}
public class CovariantOverridingDemo {
	
	public static void main(String[] args) {
		Color c=new Color();
		System.out.println(c.getColor());
		
		Red r=new Red();
		System.out.println(r.getColor());
	}

}
