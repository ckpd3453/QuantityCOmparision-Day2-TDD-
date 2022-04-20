package quantity_measurement;

public enum Units {
	FEET(12.0),INCH(1),YARD(36.0);

	
	final double val;

    Units(double val) {
    this.val = val;
    }
}
