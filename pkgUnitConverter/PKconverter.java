/*
Student Name: Chen Wu
Student Number: 041057604
Course & Section #: 23S_CST8288_023
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * class to convert pounds to kilograms 
 *
 * @author Chen Wu
 */
public class PKconverter implements ConverterBehaviour {

    private final double convFactor = 0.453592;

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
        return "Pounds";
    }

    /**
     * Returns the target unit of the converter.
     *
     * @return The target unit as a String.
     */
    @Override
    public String targetUnit() {
        return "Kilograms";
    }

    /**
     * Converts the given value from pounds to kilograms.
     *
     * @param pounds The value in pounds to be converted.
     * @return equivalent in kilograms
     */
    @Override
    public double convert(double pounds) {
        return pounds * convFactor;
    }
}
