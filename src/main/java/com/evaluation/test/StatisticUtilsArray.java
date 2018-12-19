package com.evaluation.test;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;


/**
 * This class is responsible for providing the minimum value, maximum value, median value, mean value and standard deviation
 * for an array of double values.
 * @author Evelina Mpazouki
 * @version 1.0
 * @since 2018-12-14
 */
public class StatisticUtilsArray {

    /**
     * This variable is responsible for computing the metrics needed
     * using DescriptiveStatistics' class methods.
     */
    private DescriptiveStatistics metrics;

    /**
     * The main constructor of the class used for initializations.
     *
     * @param inputArray The array that holds the input values.
     */
    StatisticUtilsArray(double[] inputArray) {

        // nitializing local variable
        double[] input;
        input = inputArray;

        // Check if there is an empty or null array as input. In case of that, an exception is thrown
        if (input == null || input.length == 0)
            throw new IllegalArgumentException("Array must not be empty or null");

        // Get a DescriptiveStatistic instance
        metrics = new DescriptiveStatistics(inputArray);
    }

    /**
     * This method is responsible to provide the minimum value of the double values of the given array.
     *
     * @return The minimum value of the double values of given array.
     */
    double min_value() { return metrics.getMin(); }

    /**
     * This method is responsible to provide the maximum value of the double values of the given array.
     *
     * @return The maximum value of the double values of given array.
     */
    double max_value() { return metrics.getMax(); }

    /**
     * This method is responsible to provide the median value of the double values of the given array.
     *
     * @return The median value of the double values of given array.
     */
    double median_value() { return metrics.getPercentile(50); }

    /**
     * This method is responsible to provide the mean value of the double values of the given array.
     *
     * @return The mean value of the double values of given array.
     */
    double mean_value() { return metrics.getMean(); }

    /**
     * This method is responsible to provide the standard deviation of the double values of the given array.
     *
     * @return The standard deviation of the double values of given array.
     */
    double std_value() { return metrics.getStandardDeviation(); }
}