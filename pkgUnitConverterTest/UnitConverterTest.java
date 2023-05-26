/*
Student Name: Chen Wu
Student Number: 041057604
Course & Section #: 23S_CST8288_023
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverterTest;

import pkgUnitConverter.*;

/**
 * simple class to test 4 classes for converting units
 *
 * @author Chen Wu
 */
public class UnitConverterTest {

    /**
     * The main method that is executed when running the UnitConverterTest class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        UnitConverter u = new UnitConverter();
        u.setValue(20.0);
        u.convert(u.getValue());
        System.out.println(u);

        u.changeBehaviourTo(new FCconverter());
        u.setValue(70.0);
        u.convert(u.getValue());
        System.out.println(u);

        u.changeBehaviourTo(new PKconverter());
        u.setValue(130.0);
        u.convert(u.getValue());
        System.out.println(u);

        u.changeBehaviourTo(new KPconverter());
        u.setValue(75.0);
        u.convert(u.getValue());
        System.out.println(u);

    }

}
