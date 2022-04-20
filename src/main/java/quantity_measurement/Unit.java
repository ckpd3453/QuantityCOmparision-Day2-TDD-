package quantity_measurement;

public enum Unit {
	FEET(12.0),INCH(1),YARD(36.0);

	
	final double val;

    Unit(double val) {
    this.val = val;
    }
}
