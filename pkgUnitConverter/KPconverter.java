/*
Student Name: Chen Wu
Student Number: 041057604
Course & Section #: 23S_CST8288_023
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * class to convert kilograms to pounds
 *
 * @author Chen Wu
 */
public class KPconverter implements ConverterBehaviour {

    private final double convFactor = 2.20462;

    /**
     * Returns the unit type of the converter.
     *
     * @return The unit type as a String.
     */
    @Override
    public String unitType() {
        return "Weight";
    }

    /**
     * Returns the source unit of the converter.
     *
     * @return The source unit as a String.
     */
    @Override
    public String sourceUnit() {
        return "Kilograms";
    }

    /**
     * Returns the target unit of the converter.
     *
     * @return The target unit as a String.
     */
    @Override
    public String targetUnit() {
        return "Pounds";
    }

    /**
     * Converts the given value from kilograms to pounds.
     *
     * @param kilograms The value in kilograms to be converted.
     * @return equivalent in pounds 
     */
    @Override
    public double convert(double kilograms) {
        return kilograms * convFactor;
    }
}
