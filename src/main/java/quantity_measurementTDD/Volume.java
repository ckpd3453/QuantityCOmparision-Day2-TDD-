package quantity_measurementTDD;
import quantityMeasurementTDD.MeasurementUnit;

public enum Volume implements MeasurementUnit {
    Gallon(3.78),Litre(1);

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
