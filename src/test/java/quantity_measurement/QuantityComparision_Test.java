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

}
