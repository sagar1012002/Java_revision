package com.basic;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {-32,-65,454,23,6,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int[] arr){

        for(int i =0;i<arr.length;i++){
            int last = arr.length -i -1;
            int max = findMax(arr, last);
            swap(arr,max,last);
        }

    }

    static int findMax(int[] arr, int end){
        int max = 0;
        for (int i = 0; i <= end ; i++) {
            if(arr[max] < arr[i]) max = i;
        }
        return max;

    }
}
