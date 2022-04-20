package quantity_measurement;

public enum Unit {
	INCH(2.5),CM(1);

	
	final double val;

    Unit(double val) {
    this.val = val;
    }
}
