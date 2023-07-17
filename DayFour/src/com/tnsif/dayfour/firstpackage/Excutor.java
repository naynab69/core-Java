package com.tnsif.dayfour.firstpackage;

public class Excutor {

	public static void main(String[] args) {
		// accessing same package class
		Base b = new Base();
		b.methodDefault();
		// b.methodPrivate();
		b.methodProtected();
		b.methodPublic();

		b.varDefault = 45;
		b.varProtected = 23;
		b.varPublic = 67;
		b.methodDefault();

		b.methodProtected();
		b.methodPublic();

	}

}
