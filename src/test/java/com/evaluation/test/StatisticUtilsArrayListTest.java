package com.evaluation.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.function.Executable;
import java.util.ArrayList;

/**
 * This is a unit test for the StatisticUtilsArrayList class.
 *
 * @author Evelina Mpazouki
 * @version 1.0
 * @since 2018-12-18
 *
 */
public class StatisticUtilsArrayListTest {

    // Initializing variables
    private  ArrayList<Double> alist = new ArrayList<>(){{add(1.0);add(2.0);add(3.0);add(4.0);add(5.0);
        add(6.0);add(7.0);add(8.0);add(9.0);add(10.0);}};
    private ArrayList<Double> nullArrayList = null;
    private ArrayList<Double> emptyArrayList = new ArrayList<>(){};
    private StatisticUtilsArrayList testObj;


    /**
     * This method is responsible for creating StatisticUtilsArrayList instance.
     */
    @Before
    public void setUp(){

        testObj = new StatisticUtilsArrayList(alist);

    }

    /**
     * This method is responsible for testing the min_value() method of the StatisticUtilsArrayList class with
     * valid argument.
     */
    @Test
    public void min_value() {

        double result = testObj.min_value();
        assertEquals(1.0, result);

    }

    /**
     * This method is responsible for testing the max_value() method of the StatisticUtilsArrayList class with
     * valid argument.
     */
    @Test
    public void max_value() {

        double result = testObj.max_value();
        assertEquals(10, result);

    }

    /**
     * This method is responsible for testing the mean_value() method of the StatisticUtilsArrayList class with
     * valid argument.
     */
    @Test
    public void mean_value() {


        double result = testObj.mean_value();
        assertEquals(5.5, result);

    }

    /**
     * This method is responsible for testing the median_value() method of the StatisticUtilsArrayList class with
     * valid argument.
     */
    @Test
    public void median_value() {

        double result = testObj.median_value();
        assertEquals(5.5, result);

    }

    /**
     * This method is responsible for testing the std_value() method of the StatisticUtilsArrayList class with
     * valid argument.
     */
    @Test
    public void std_value() {


        double result = testObj.std_value();
        assertEquals(3.02765, result, 0.001);

    }

    /**
     * This method is responsible for testing if the IllegalArgumentException is thrown
     * when the input array list is empty or null.
     */
    @Test
    public void testNullArgument(){

        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testObj = new StatisticUtilsArrayList(nullArrayList);
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {

                testObj = new StatisticUtilsArrayList(emptyArrayList);
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