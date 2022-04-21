package quantityMeasurementTDD;

/*
Interface MeasurementUnit with two abstract method
 */
public interface MeasurementUnit {
    double getBaseUnitValue(double value);

    boolean supportAddition();
}

