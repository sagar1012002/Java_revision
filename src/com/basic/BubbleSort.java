package com.basic;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {-2,-3,-4,-5,-6,-7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean check;
        for(int i=0;i<arr.length;i++){
            check = false;
            for (int j = 1; j < arr.length -i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    check = true;
                }
            }
            if(!check) break;
        }
    }
}
