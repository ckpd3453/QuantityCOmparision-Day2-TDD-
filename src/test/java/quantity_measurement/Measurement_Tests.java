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
     * Test case 1.19
     */
    @Test
    public void given2InchAnd5CmValue_ShouldReturnEqual() {

        val1 = quantityMeasurement.getConvertedUnit(2.0, Unit.INCH);
        val2 = quantityMeasurement.getConvertedUnit(5.0, Unit.CM);
        Assert.assertEquals(val1, val2,0.0);
    }
}
