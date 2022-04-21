package quantity_measurementTDD;

import org.junit.Assert;
import org.junit.Test;
import quantityMeasurementTDD.Length;
import quantityMeasurementTDD.UnitMeasurementSystem;

public class Testting {

    public static UnitMeasurementSystem length1;
    public static UnitMeasurementSystem length2;

    public static double check;

    /*
    Test Case -1.22 (2Inch+2Inch = 4Inch)
     */
    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inch() {
        length1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        length2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        check = length1.add(length2);
        Assert.assertEquals(4.0, check, 0.0);
    }

    /*
    Test Case -1.23 (1Feet + 2Inch = 14Inch)
     */
    @Test
    public void given1FeetAnd2Inch_ShouldReturn14Inch() {
        length1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        length2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        check = length1.add(length2);
        Assert.assertEquals(14, check, 0.0);
    }

    /*
    Test Case -1.24 (1Feet + 1Feet = 24Inch)
     */
    @Test
    public void given1FeetAnd1Feet_ShouldReturn24Inch() {
        length1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        length2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        check = length1.add(length2);
        Assert.assertEquals(24.0, check, 0.0);
    }

    /*
    Test Case -1.25 (2Inch + 2.5Cm = 3Inch)
     */
    @Test
    public void givenAdditionOf_TwoInchAndTwoAndHalfCm_ShouldReturn3Inch() {
        length1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        length2 = new UnitMeasurementSystem(Length.CM, 2.5);
        check = length1.add(length2);
        Assert.assertEquals(3, check,0.0);
    }
}
