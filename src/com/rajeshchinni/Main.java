package com.rajeshchinni;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);   // this is a static variable. all static methods can access it directly.

    public static void main(String[] args) {

        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }


    // below is a method
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r"); // \r brings the cursor to the next line. Instead of \r, you can use scanner.nextline
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    // below is a method
    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++ ){
            System.out.println("Element " + i + ", value is " + array[i]);
        }

    }

    // below is a method
    public static int[] sortIntegers(int[] arraykaka){
        int[] sortedArray = new int[arraykaka.length]; // sortedArray and arraykaka will have same number of elements
        for (int i = 0; i < arraykaka.length; i++){    // copying the values of arraykaka into sortedArray
            sortedArray[i] = arraykaka[i];
        }
        // Alternatively we can do copy as follows
        // int[] sortedArray = Arrays.copyOf(arraykaka,array.length);

        // now rest of the steps we will do with sortedArray only
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            // first stage:
            // element 0 is 50, element 1 is 160 and element 2 is 40
            // second stage:
            // now element 0 is 160, element 1 is 50 and element 2 is 40
            for (int i =0; i<sortedArray.length - 1; i++){                // "sortedArray.length - 1" because of sortedArray[i + 1]
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}
