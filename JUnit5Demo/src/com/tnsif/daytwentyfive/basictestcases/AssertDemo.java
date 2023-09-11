//Sample test cases based on assertion 
package com.tnsif.daytwentyfive.basictestcases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class AssertDemo {
	@Test
	public void testForAssertEquals() {
		int actual = 1;
		int expected = 1;
		assertEquals(actual, expected);
	}

	@Test
	public void testForAssertTrue() {
		assertTrue("Hello".contains("e"));
	}

	@Test
	public void testForAssertFalse() {
		assertFalse("Hello".contains("z"));
	}

	@Test
	public void testForNull() {
		//String s =null; //"";
		Integer[] arr= null;
		assertNull(arr);
	}

	@Test
	public void testForNotSame() {
		String originalObject, otherObject;
		originalObject = "Hello"; 
	    otherObject="Hi"; 
		//otherObject="Hello";
		//otherObject = new String("Hello");
		assertNotSame(originalObject, otherObject);

	}

	@Test
	public void testAssertThrow() {
		assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("Invalid Arguments");
		});
	}

	@Test
	public void testFail() {
		fail("FAilure because of time");
	}

}
