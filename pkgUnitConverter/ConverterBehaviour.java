/*
Student Name: Chen Wu
Student Number: 041057604
Course & Section #: 23S_CST8288_023
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * interface represents the behavior of a unit converter
 * @author Chen Wu
 */
public interface ConverterBehaviour {
    public String unitType();
    public String sourceUnit();
    public String targetUnit();
    public double convert(double value);
    
}
