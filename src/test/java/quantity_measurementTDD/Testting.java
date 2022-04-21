package quantity_measurementTDD;

import org.junit.Assert;
import org.junit.Test;
import quantityMeasurementTDD.UnitMeasurementSystem;

public class Testting {

    public static UnitMeasurementSystem vol1;
    public static UnitMeasurementSystem vol2;

    public static boolean checkBoolean;
    public double check;

    /*
    Test Case -1.26 (Given 1Gallon And 3.78Litre Should Return True)
     */
    @Test
    public void givenOneGallonAndThreePointSevenEightLitre_ShouldReturnTrue(){
        vol1 = new UnitMeasurementSystem(Volume.Gallon,1);
        vol2 = new UnitMeasurementSystem(Volume.Litre,3.78);
        checkBoolean = vol1.compare(vol2);
        Assert.assertTrue(checkBoolean);
    }

    /*
    Test Case -1.27 (Given 1Litre And 1000ML Should Return True)
     */
    @Test
    public void givenOneLitreAnd1000ML_ShouldReturnTrue(){
        vol1 = new UnitMeasurementSystem(Volume.Litre,1);
        vol2 = new UnitMeasurementSystem(Volume.ML,1000);
        checkBoolean = vol1.compare(vol2);
        Assert.assertTrue(checkBoolean);
    }

    /*
    Test Case -1.28 (1Gallon+3.78Litre = 7.56Litre)
     */
    @Test
    public void givenAdditionOf_1GallonAndThreePointSevenEightLitre_ShouldReturnSevenPointFiveSevenLitres(){
        vol1 = new UnitMeasurementSystem(Volume.Gallon,1);
        vol2 = new UnitMeasurementSystem(Volume.Litre,3.78);
        check = vol1.add(vol2);
        Assert.assertEquals(7.56,check,0.0);
    }

    /*
    Test Case -1.29 (1Litre+1000ML = 2Litre)
     */
    @Test
    public void givenAdditionOf_1LiteAnd1000ML_ShouldReturn2Litres(){
        vol1 = new UnitMeasurementSystem(Volume.Litre,1);
        vol2 = new UnitMeasurementSystem(Volume.ML,1000);
        check = vol1.add(vol2);
        Assert.assertEquals(2.0,check,0.0);
    }

    /*
    Test Case -1.30 (Given 1Kg And 1000Gram Should Return True)
     */
    @Test
    public void given1kgAnd1000Grams_ShouldReturnTrue(){
        vol1 = new UnitMeasurementSystem(Volume.KG,1);
        vol2 = new UnitMeasurementSystem(Volume.Gram,1000);
        checkBoolean = vol1.compare(vol2);
        Assert.assertTrue(checkBoolean);
    }

    /*
    Test Case -1.31 (Given 1KTone And 1000KG Should Return True)
     */
    @Test
    public void given1ToneAnd1000Kg_ShouldReturnTrue(){
        vol1 = new UnitMeasurementSystem(Volume.Tone,1);
        vol2 = new UnitMeasurementSystem(Volume.KG,1000);
        checkBoolean = vol1.compare(vol2);
        Assert.assertTrue(checkBoolean);
    }
}
