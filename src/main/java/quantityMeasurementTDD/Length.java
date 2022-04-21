package quantityMeasurementTDD;

/*
@Enum
 */
public enum Length implements MeasurementUnit {
    INCH(1), CM(1/2.5), FEET(12);


    final double unitVal;

    /*
    Constructor of Enum
     */
    private Length(double unitVal) {
        this.unitVal = unitVal;
    }

    /*
    Implementing Method of MeasurementUnit Interface
     */
    @Override
    public double getBaseUnitValue(double value) {  //Base Unit Value
        return unitVal * value;
    }

    public boolean supportAddition() { //Support Addition
        return true;
    }
}
