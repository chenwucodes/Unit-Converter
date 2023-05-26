/*
Student Name: Chen Wu
Student Number: 041057604
Course & Section #: 23S_CST8288_023
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * class to convert Fahrenheit to Celsius
 *
 * @author Chen Wu
 */
public class FCconverter implements ConverterBehaviour {

    private final double convFactor = 1.8;
    private final double convOrigin = 32.0;

    /**
     * Returns the unit type of the converter.
     *
     * @return The unit type as a String.
     */
    @Override
    public String unitType() {
        return "Temperature";
    }

    /**
     * Returns the source unit of the converter.
     *
     * @return The source unit as a String.
     */
    @Override
    public String sourceUnit() {
        return "Fahrenheit";
    }

    /**
     * Returns the target unit of the converter.
     *
     * @return The target unit as a String.
     */
    @Override
    public String targetUnit() {
        return "Celsius";
    }

    /**
     * Converts the given value from Fahrenheit to Celsius.
     *
     * @param fahrenheit value in Fahrenheit to be converted
     * @return equivalent in Celsius
     */
    @Override
    public double convert(double fahrenheit) {
        return (fahrenheit - convOrigin) / convFactor;
    }
}
