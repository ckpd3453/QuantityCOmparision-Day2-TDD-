package quantity_measurement;

public class QuantityMeasurement {

	public double getConvertedUnit(double value, Units unitType) {
		return value * unitType.val;
	}

}
