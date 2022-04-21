package quantityMeasurementTDD;

import quantity_measurementTDD.Volume;

public class UnitMeasurementSystem {

    private final Volume unit;
    private final double value;

    /*
    Constructor
     */
    public UnitMeasurementSystem(Volume unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /*
    Compare method to compare the reference and values
     */
    public boolean compare(UnitMeasurementSystem that) {

        if (this.unit.getClass() != that.unit.getClass()) {
            return false;
        }
        if (this.unit.equals(that.unit)) {
            return this.equals(that);
        }
        return Double.compare(this.unit.getBaseUnitValue(this.value), that.unit.getBaseUnitValue(that.value)) == 0;
    }

    /*
    Addition method to add two values
     */
    public double add(UnitMeasurementSystem that) {
        if (this.unit.getClass() != that.unit.getClass() ||
                !this.unit.supportAddition() || !that.unit.supportAddition()) {
            return 0.0;
        }
        return this.unit.getBaseUnitValue(this.value) + that.unit.getBaseUnitValue(that.value);
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
