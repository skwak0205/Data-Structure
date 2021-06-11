package com.insertion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = {7,5,3,4,1,3,9,2};
	    InsertionSort sorter = new InsertionSort();
	    sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
