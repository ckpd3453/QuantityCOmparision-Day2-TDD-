package quantity_measurementTDD;
import quantityMeasurementTDD.MeasurementUnit;

public enum Volume implements MeasurementUnit {
    Gallon(3.78),Litre(1.0), ML(1/1000.0), KG(1), Gram(1/1000.0), Tone(1000.0), Fahrenheit(1.0), Celsius(1.0);

    private final double unitVal;

    Volume(double unitVal) {
        this.unitVal = unitVal;
    }


    @Override
    public double getBaseUnitValue(double value) {
        return unitVal*value;
    }

    @Override
    public boolean supportAddition() {
        return true;
    }
}
