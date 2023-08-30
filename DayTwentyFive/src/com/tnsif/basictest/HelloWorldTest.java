//program to demonstrate child test class
package com.tnsif.basictest;

import org.junit.jupiter.api.Test;

class HelloWorldTest extends TestLifeCycle {

	@Test
	void test() {
		System.out.println("HelloWorld Test Case");
	}
}
