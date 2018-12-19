package com.evaluation.test;

import java.util.ArrayList;

import static java.util.Arrays.copyOfRange;

/**
 * This class is responsible for providing the Ascending Minima Algorithm. This algorithm computes the minimum of each
 * possible consecutive k elements of an array.
 * @author Evelina Mpazouki
 * @version 1.0
 * @since 2018-12-17
 */
public class AscendingMinima {

    /**
     * This variable holds any given values for the input.
     */
    private double[] inputArray;

    /**
     * This variable holds the first element of the original given array.
     */
    private double firstElement;

    /**
     * This variable stores the results of the algorithm (minimum values).
     */
    private ArrayList<Double> ama;

    /**
     * This is the constructor of the class used for initialization actions.
     *@param inputArray The array that holds the input values.
     */
    public AscendingMinima(double[] inputArray) {

        // Store the input data in array an initialize private variables
        this.inputArray = inputArray;
        ama = new ArrayList<>();

        // Check if there is an empty  or null array as input. In case of that, an exception is thrown
        if ( this.inputArray == null || this.inputArray.length == 0  )
            throw new IllegalArgumentException("Array must not be empty or null");

        firstElement = inputArray[0];

        //Call finfSmallest() method
        findSmallest();
    }

    /**
     * This is the getter method for ama Arraylist.
     * @return ama Arraylist.
     */
    public ArrayList<Double> getAma() { return ama; }

    /**
     * This method is responsible to compute the minimum values of the original given array and his subarrays and
     * store them to Arraylist ama.
     */
    public void findSmallest() {

        // Definition of variables
        double min;
        int k;

        // While inputArray is not empty
        while (inputArray.length > 0) {
            //Initialization of variable for minimum storage and variable of index where the minimum got found
            min = inputArray[0];
            k = 0;

            //Search for the minimum value of inputArray and save it in a variable. Do the save for its index
            for (int i = 1; i < inputArray.length; i++) {

                //Equality exists in case of duplicates. We want the last index of duplicate minimums
                if (inputArray[i] <= min) {
                    min = inputArray[i];
                    k = i;
                }
            }

            //Store the minimum value in ama Arraylist
            ama.add(min);

            //Create subarray from previous inputArray starting from the next element of the previous minimum found
            //till the end of array
            inputArray = copyOfRange(inputArray, k + 1, inputArray.length);
        }
    }

    /**
     * This method is responsible to provide the ascending minima ArrayList (ama) if a new element is added at the end of the
     * initial array discarding the first element.
     *
     * @param newElement The new element of the array.
     * @return ama ArrayList.
     */
    public ArrayList<Double> minima_adjusted_to_shift(double newElement) {

        // Check if the first element of the original array is equal to the first element of ama ArrayList
        // If true, then discard first element from ama because this is not the minimum value anymore
        if( firstElement == ama.get(0)) ama.remove(0);

        // Check if the new value is <= to ama values. If true, discard all the ama
        // elements greater than the new value and place it to the end of ama ArrayList
        for (int i = ama.size()-1; i>=0; i--)
            if (newElement <= ama.get(i)) ama.remove(i);
        ama.add(newElement);
        return ama;
    }
}