package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityComparision_Test {
	/**
	 * Test Case 1.1
	 */
	@Test
	public void givenOfeet_shouldReturn0feet() {
		/*
		 * Created two objects of feet
		 */
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		/*
		 * Comparing two objects by assert method
		 */
		Assert.assertEquals(feet1, feet2);
	}

	/**
	 * Test Case 1.2
	 */
	@Test
	public void givenNullfeet_shouldReturnFalse() {
		/*
		 * Created a objects of feet
		 */
		Feet feet1 = new Feet(0.0);
		/*
		 * Comparing objects value by null if true then test case fail
		 */
		Assert.assertFalse(feet1.equals(null));
	}

	/**
	 * Test Case 1.3
	 */
	@Test
	public void givenReferencefeet_shouldReturn_sameReferencefeet() {
		/*
		 * Created two objects of feet
		 */
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		/*
		 * Comparing reference of two objects by assert method
		 */
		Assert.assertSame(feet1, feet1);
	}
	
	/*
	 * Test Case 1.4
	 */
	@Test
	public void givenObject_whenSameType_shouldReturnTrue() {
		/*
		 * Created objects of feet
		 */
		Feet feet1 = new Feet();
		/*
		 * Comparing object of same type
		 */
		Assert.assertEquals(feet1, feet1);
	}
	
	@Test
	public void givenObject_whenNotSameType_shouldReturnFalse() {
		/*
		 * Created objects of feet and inch
		 */
		Feet feet = new Feet();
		Inch inch = new Inch();
		/*
		 * Comparing objects of different types
		 */
		Assert.assertNotSame(feet, inch);
	}
	
}
