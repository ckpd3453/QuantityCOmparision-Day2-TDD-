package quantity_measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Measurement_Tests {

    public QuantityMeasurements quantityMeasurement;
    double val1, val2;

    @Before
    public void dir() {
        quantityMeasurement = new QuantityMeasurements();
    }

    /*
     * Test case 1.13
     */
    @Test
    public void given3FeetAnd1YardValue_ShouldReturnEqual() {

        val1 = quantityMeasurement.getConvertedUnit(3.0, Unit.FEET);
        val2 = quantityMeasurement.getConvertedUnit(1.0, Unit.YARD);
        Assert.assertEquals(val1, val2,0.0);
    }
}
