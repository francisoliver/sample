package com.nokia.sample;

import java.lang.reflect.Array;

/**
 * Created by francis on 6/24/2017.
 */
public class Bubble {

    public static void main(String args[]) {
        Integer counter = args.length;
        Integer arr[] = new Integer[counter];
        //for initialization
        for(int x=0; x < counter ; x++) {
            arr[x] = Integer.parseInt(args[x]);
        }
        bubbleSort(arr);
        for(int x=0; x < counter ; x++) {
            System.out.println(arr[x]);
        }

    }

    private static int swap(int x, int y) {
        return x;
    }

    public static void bubbleSort(Integer[] numArray) {

        int n = numArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numArray[j - 1] > numArray[j]) {
                    numArray[j] = swap(numArray[j - 1] , numArray[j - 1] = numArray[j]);
                }
            }
        }

    }
}
