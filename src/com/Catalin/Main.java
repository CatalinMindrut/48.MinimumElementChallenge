package com.Catalin;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    /** By setting the scanner as a static field, we are allowing other static methods in this class to
     * access the scanner field.
     * The scanner was also set to private so other classes can not access it. In this case this is not
     * really applicable since we have no other classes but it is a good idea in general to set the
     * fields to private in order to encapsulate the data.
     */

    public static void main(String[] args) {
//        Write a method called readIntegers() with a parameter called count that represents how many
//        integers the user needs to enter.
//        The method needs to read from the console until all the numbers are entered, and then return
//        an array containing the numbers entered.
//        Write a method findMin() with the array as the parameter. The method need to return the minimum
//        value in the array.
//        In the main() method read the count from the console and call the method readIntegers() with the
//        count parameter.
//        Then call the findMin() method passing the array returned from the call to the readIntegers()
//        method.
//        Finally, print the minimum element in the array.

//        Tips:
//        Assume that the user will only enter numbers, never letters
//        For simplicity, create a Scanner as a static field to help with data input
//        Create a new console project with the name MinElementChallenge

        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArrray = readIntegers(count);
        int returnedMin = findMin(returnedArrray);

        System.out.println("min = " + returnedMin);


    }
    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i=0; i<array.length; i++){
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;
        /** The starting value is set to the maximum value an integer can hold. This means that the
         * value entered by the user will initially be measured against this. A higher value will
         * trigger an error and be invalid.
         * If the value was set to 0, the numbers entered by the user will be checked against 0 and
         * 0 will always be the lowest value, thus, invalidating the test.
         */

        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }
}
