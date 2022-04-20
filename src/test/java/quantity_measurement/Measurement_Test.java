package quantity_measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Measurement_Test {

	public QuantityMeasurement quantityMeasurement;
    double val1, val2;

    @Before
    public void dir(){
        quantityMeasurement = new QuantityMeasurement();
    }

    //*******Feet*******
    @Test
    public void givenOFeetAnd0Feet_WhenEqual_ShouldReturnEqual(){
        val1 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
        val2 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
        Assert.assertEquals(val1, val2,0.0);
    }
    
    @Test
	public void givenOneFeetAndZeroFeetValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
		Double value2 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
		Assert.assertNotEquals(value1, value2);
	}
	
	@Test
	public void givenOneFeetAndOneInchValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
		Double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.INCH);
		Assert.assertNotEquals(value1, value2);
	}
	
	/*
	 * Test case 1.14
	 */
	@Test
	public void given3FeetAnd1YardValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(3.0, Units.FEET);
		Double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Assert.assertEquals(value1, value2);
	}
	
	/*
	 * Test case 1.14
	 */
	@Test
	public void given1FeetAnd1YardValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
		Double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Assert.assertNotEquals(value1, value2);
	}
	
	/*
	 * Test case 1.15
	 */
	@Test
	public void given1InchAnd1YardValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.INCH);
		Double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Assert.assertNotEquals(value1, value2);
	}
	/*
	 * Test case 1.16
	 */
	@Test
	public void given1YardAnd36InchValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Double value2 = quantityMeasurement.getConvertedUnit(36.0, Units.INCH);
		Assert.assertEquals(value1, value2);
	}
	
	/*
	 * Test Case 1.17
	 */
	@Test
	public void given36InchAnd1YardValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Double value2 = quantityMeasurement.getConvertedUnit(36.0, Units.INCH);
		Assert.assertEquals(value1, value2);
	}
	
	/*
	 * Test Case 1.8
	 */
	@Test
	public void given1YardAnd3FeetValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Double value2 = quantityMeasurement.getConvertedUnit(3.0, Units.FEET);
		Assert.assertEquals(value1, value2);
	}
}
