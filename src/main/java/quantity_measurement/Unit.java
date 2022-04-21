package quantity_measurement;
interface MeasurementUnit {
    public double convertToBaseUnit(double value);
}

public enum Unit implements MeasurementUnit {
	INCH(12),CM(1), FEET(1);

	
	final double unitVal;

    private Unit(double unitVal) {
    this.unitVal = unitVal;
    }

    public double convertToBaseUnit(double value) {
        return value*unitVal;
    }
}
