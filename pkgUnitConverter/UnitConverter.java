/*
Student Name: Chen Wu
Student Number: 041057604
Course & Section #: 23S_CST8288_023
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * class that represents the "context" in the Strategy Design Pattern
 *
 * @author Chen Wu
 */
public class UnitConverter {

    private double value;
    private ConverterBehaviour converterBehaviour;

    /**
     * Constructs a UnitConverter object with a default ConverterBehaviour.
     */
    public UnitConverter() {
        this.converterBehaviour = new CFconverter();
    }

    /**
     * Returns the value to be converted.
     *
     * @return The value as a double.
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value to be converted.
     *
     * @param value The value to be set.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Sets the ConverterBehaviour to be used for conversion.
     *
     * @param converterBehaviour The ConverterBehaviour implementation to be set.
     */
    public void changeBehaviourTo(ConverterBehaviour converterBehaviour) {
        this.converterBehaviour = converterBehaviour;
    }

    /**
     * Performs the conversion based on the selected ConverterBehaviour.
     *
     * @param value the source value
     * @return The converted value as a double.
     */
    public double convert(double value) {
        return converterBehaviour.convert(value);
    }

    /**
     *
     * Returns a string representation of the UnitConverter object.
     *
     * @return The string representation of the object.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%.2f", value)) 
                        .append(" in ")
                        .append(converterBehaviour.sourceUnit())
                        .append(" is ")
                        .append(String.format("%.2f ", converterBehaviour.convert(value))) 
                        .append(converterBehaviour.targetUnit())
		       .append(" unit type: [")
		       .append(converterBehaviour.unitType())
		       .append("]");
        return builder.toString();
    }
}
