package quantity_measurement;

public class Feet {
	/*
	 * Created a final variable
	 */
	private double value;

	/*
	 * Constructor to initialize the variable
	 */
	public Feet(double value) {
		this.value = value;
	}

	/*
	 * Equals to method to compare the equality of objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feet other = (Feet) obj;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

}
