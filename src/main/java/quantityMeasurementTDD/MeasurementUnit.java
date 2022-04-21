package quantityMeasurementTDD;

/*
Interface MeasurementUnit with two abstract method
 */
public interface MeasurementUnit {
    public double getBaseUnitValue(double value);

    public boolean supportAddition();
}

