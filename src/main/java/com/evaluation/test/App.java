package com.evaluation.test;



//import org.apache.commons.math3.*;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {

        //double[] myarray = new double[]{1,2,3,4,5,6,7,8,9};
        //double[] nullArray = {};

        //StatisticUtilsArray obj = new StatisticUtilsArray(myarray);
        //System.out.println(myarray.length);
        //double a = obj.max_value();

        //System.out.println(a);

        ArrayList<Double> alist = new ArrayList<>(){{add(1.0);add(2.2);add(3.2);add(4.2);add(5.2);add(6.2);add(7.2);add(8.2);add(9.2);add(10.2);}};
        //ArrayList<Double> alist = null;
        StatisticUtilsArrayList obj2 = new StatisticUtilsArrayList(alist);
        //obj2.min_value();
        //obj2.max_value();
        // obj2.mean_value();
        // obj2.std_value();
        // obj2.median_value();
        double a = obj2.median_value();

        System.out.println(a);


        // double array[] = new double[]{1,2,3,4,5,6,7,8,9};
        //AscendingMinima obj3 = new AscendingMinima(array);
        /*ArrayList<Double> a= new ArrayList<>();
        a=obj3.getAma();
        System.out.println(a);*/


        //obj3.FindSmallest();
        //System.out.println(obj3.minima_adjusted_to_shift(2));


        //array = ArrayUtils.removeElement(array, 2);
        // System.out.println(Arrays.toString(array));*/

    }
}

