//demonstrate JUnit life cycle 
package com.tnsif.daytwentyfive.basictestcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {

	@BeforeEach
	 void beforeEachTest() {
		System.out.println("Before each test");
	}

	@AfterEach
	 void afterEachTest() {
		System.out.println("After each test");
	}

	@BeforeAll
	void beforeAllTests() {
		System.out.println("Before all tests");
	}

	@AfterAll
	void afterAllTests() {
		System.out.println("After all tests");
	}

	@Test
	 void testMethod1() {
		System.out.println("this is test method1...");
	}

	@Test
	 void testMethod2() {
		System.out.println("this is test method2...");
	}	
}