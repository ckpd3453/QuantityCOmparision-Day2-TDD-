package quantity_measurementTDD;

import org.junit.Assert;
import org.junit.Test;
import quantityMeasurementTDD.Length;
import quantityMeasurementTDD.UnitMeasurementSystem;

public class Testting {


    /*
    Test Case -1.22 (2Inch+2Inch = 4Inch)
     */
    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inch(){
        UnitMeasurementSystem length1= new UnitMeasurementSystem(Length.INCH,2.0);
        UnitMeasurementSystem length2 = new UnitMeasurementSystem(Length.INCH,2.0);
        double check = length1.add(length2);
        Assert.assertEquals(4.0,check,0.0);
    }

}
