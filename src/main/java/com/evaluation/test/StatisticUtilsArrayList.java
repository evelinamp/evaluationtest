package com.evaluation.test;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.ArrayList;

/**
 * This class is responsible for providing the minimum value, maximum value, median value, mean value and standard deviation
 * for an arraylist of double values.
 * @author Evelina Mpazouki
 * @version 1.0
 * @since 2018-12-14
 */
public class StatisticUtilsArrayList {

    /**
     * This variable is responsible for computing the metrics needed
     * using DescriptiveStatistics' class methods
     */
    private DescriptiveStatistics metrics;
    private ArrayList<Double> inputlist;

    /**
     *The main constructor of the class used for initializations
     * @param inputList The arraylist that holds the input values
     */
    StatisticUtilsArrayList( ArrayList<Double>  inputList ) {
        this.inputlist = inputList;

        if (this.inputlist == null || this.inputlist.size() == 0)
            throw new IllegalArgumentException("List must not be empty or null");

        //Converting the input arraylist to array
        //The inputArray holds the input data
        Double[] inputArray = inputList.toArray(new Double[inputList.size()]);

        //Convert object Double to primitive data type
        double[] doubleArray = ArrayUtils.toPrimitive(inputArray);

        //Get a DescriptiveStatistic instance
        metrics = new DescriptiveStatistics(doubleArray);
    }

    /**
     * This method is responsible to provide the minimum value of the double values of the given arraylist
     *
     * @return The minimum value of the double values of given arraylist
     */
    double min_value() { return metrics.getMin(); }

    /**
     * This method is responsible to provide the maximum value of the double values of the given arraylist
     *
     * @return The maximum value of the double values of given arraylist
     */
    double max_value() { return metrics.getMax(); }

    /**
     * This method is responsible to provide the median value of the double values of the given arraylist
     *
     * @return The median value of the double values of given arraylist
     */
    double median_value() { return metrics.getPercentile(50); }

    /**
     * This method is responsible to provide the mean value of the double values of the given arraylist
     *
     * @return The mean value of the double values of given arraylist
     */
    public double mean_value() { return metrics.getMean(); }

    /**
     * This method is responsible to provide the standard deviation of the double values of the given arraylist
     *
     * @return The standard deviation of the double values of given arraylist
     */
    double std_value(){ return metrics.getStandardDeviation(); }
}