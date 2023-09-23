package com.basic;

import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        
        int[] arr = { 1,3,5,7,8,9,0};
        Swaping sw = new Swaping();
        int[] arr1 = sw.Rswap(arr);
        System.out.print(Arrays.toString(arr1));
    }

    public int[] Rswap(int[] arr){

        int start = 0;
        int end = arr.length-1;
        while(end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        return arr;
    }
}
