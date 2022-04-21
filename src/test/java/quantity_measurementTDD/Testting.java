package quantity_measurementTDD;

import org.junit.Assert;
import org.junit.Test;
import quantityMeasurementTDD.UnitMeasurementSystem;

public class Testting {

    public static UnitMeasurementSystem vol1;
    public static UnitMeasurementSystem vol2;

    public static boolean checkBoolean;


    /*
    Test Case -1.26 (Given 1Gallon And 3.78Litre Should Return True)
     */
    @Test
    public void givenOneGallonAndThreePointSevenEight_ShouldReturnTrue(){
        vol1 = new UnitMeasurementSystem(Volume.Gallon,1);
        vol2 = new UnitMeasurementSystem(Volume.Litre,3.78);
        checkBoolean = vol1.compare(vol2);
        Assert.assertTrue(checkBoolean);
    }
}
