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

}
