package com.evaluation.test;

import org.junit.*;
import org.junit.jupiter.api.function.Executable;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is a unit test for the AscendingMinima class.
 *
 * @author Evelina Mpazouki
 * @version 1.0
 * @since 2018-12-17
 *
 */
public class AscendingMinimaTest {

    // Initializing variables
    private double[] nullArray = null ;
    private double[] emptyArray = new double[]{};
    private double[] inputArray;
    private AscendingMinima testObj;
    private ArrayList<Double> result;

    /**
     * This method is responsible for filling an array with values and
     * create an AscendingMinima instance.
     */
    @Before
    public void setUp() {

        inputArray = new double[]{1,3,3,2,5,8,7,8,9};
        testObj =  new AscendingMinima(inputArray);
    }

    /**
     * This method is responsible for testing the constructor of the Ascending Minima class.
     */
    @Test
    public void AscendingMininaConstructor(){

        assertNotNull(inputArray);

        assertNull(nullArray);

        assertEquals(emptyArray.length, 0);
    }

    /**
     * This method responsible for testing the getter of the Ascending Minima class.
     */
    @Test
    public void getAma() {

        ArrayList<Double> expected = new ArrayList<>();
        result = testObj.getAma();
        expected.add(1.0);
        expected.add(2.0);
        expected.add(5.0);
        expected.add(7.0);
        expected.add(8.0);
        expected.add(9.0);
        assertEquals(expected, result);
        assertEquals(expected.size(), result.size());
        expected.add(3.0);

        assertEquals(expected.size(), result.size() + 1);
        assertNotNull(testObj.getAma());

        result = testObj.minima_adjusted_to_shift(6);
        assertEquals(testObj.getAma(), result);
    }

    /**
     * This method is responsible for testing if the IllegalArgumentException is thrown
     * when the input array is empty or null.
     */
    @Test

    public void testNullArgument(){

        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testObj = new AscendingMinima(nullArray);
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testObj = new AscendingMinima(emptyArray);
            }
        });

    }

    /**
     * This method is responsible for testing if the findSmallest() method of the Ascending Minima class
     * fills the ama array list in a right way.
     */
    @Test
    public void findSmallest() {

        result = testObj.getAma();
        double var = result.get(0);
        assertEquals(1.0, var);
    }

    /**
     * This method is responsible for testing the minima_adjusted_to_shift() of the Ascending Minima class.
     * Given a new value, test if the ama array list is right.
     */
    @Test
    public void minima_adjusted_to_shift() {

        result = testObj.minima_adjusted_to_shift(6);
        ArrayList<Double> expected = new ArrayList<>();
        expected.add(2.0);
        expected.add(5.0);
        expected.add(6.0);

        assertEquals(expected,result);
    }

    /**
     * This method is responsible to clear the instances' values.
     */
    @After
    public void tearDown() {

        testObj = null;
    }
}