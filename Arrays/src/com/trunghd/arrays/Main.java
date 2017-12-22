/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.arrays;

import java.util.Scanner;

/**
 *
 * @author trunghd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] myInteger = getIntegers(5);
        
        for (int i=0; i< myInteger.length; i++){
            System.out.println("Element " + i + ", typed value was " + myInteger[i]);
        }
        
        System.out.println("The average is " + getAverage(myInteger));
        // TODO code application logic here
//        int[] myIntArray = new int[25];//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;
//        myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);

//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//    }
//    
//    public static void printArray(int[] array){
//        for(int i=0;i<array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
    }
    
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer valules. \r");
        int[] values = new int[number];
        
        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
            
        }
        return values;
    }
    
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
