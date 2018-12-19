package com.evaluation.test;

import org.junit.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is a unit test for the StatisticUtilsArray class.
 *
 * @author Evelina Mpazouki
 * @version 1.0
 * @since 2018-12-18
 *
 */
public class StatisticUtilsArrayTest {

    // Initializing variables
    private double[] nullArray = null;
    private double[] emptyArray = new double[]{};
    private double[] array = {1,2,3,4,5,6,7,8,9,10};
    private StatisticUtilsArray testObj;


    /**
     * This method is responsible for creating StatisticUtilsArray instance.
     */
    @Before
    public void setUp() {

        testObj = new StatisticUtilsArray(array);

    }

    /**
     * This method is responsible for testing the min_value() method of the StatisticUtilsArray class with
     * valid argument.
     */
    @Test
    public void min_value() {

        double result = testObj.min_value();
        assertEquals(1, result);

    }

    /**
     * This method is responsible for testing the max_value() method of the StatisticUtilsArray class with
     * valid argument.
     */
    @Test
    public void max_value() {

        double result = testObj.max_value();
        assertEquals(10, result);

    }

    /**
     * This method is responsible for testing the median_value() method of the StatisticUtilsArray class with
     * valid argument.
     */
    @Test
    public void median_value() {

        double result = testObj.median_value();
        assertEquals(5.5, result);

    }

    /**
     * This method is responsible for testing the mean_value() method of the StatisticUtilsArray class with
     * valid argument.
     */
    @Test
    public void mean_value() {


        double result = testObj.mean_value();
        assertEquals(5.5, result);

    }

    /**
     * This method is responsible for testing the std_value() method of the StatisticUtilsArray class with
     * valid argument.
     */
    @Test
    public void std_value() {


        double result = testObj.std_value();
        assertEquals(3.02765, result, 0.001);

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
                testObj = new StatisticUtilsArray(nullArray);
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {

                testObj = new StatisticUtilsArray(emptyArray);
            }
        });

    }

    /**
     * This method is responsible to clear the instance's value.
     */
    @After
    public void tearDown() {

        testObj = null;

    }
}