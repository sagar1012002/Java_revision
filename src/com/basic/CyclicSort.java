package com.basic;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,0,7};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(checkMissingNumber(arr));
    }

    static void cyclicSort(int[] arr){
        int index=0;
        while(index<arr.length){
            int value = arr[index];
            if(arr[index] < arr.length && arr[index] != arr[value] ){
                swap(arr,index,value);
            }else{
                index++;

            }
        }

    }

    static int checkMissingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            if(i != arr[i]) return i;
            else i++;
        }
        return -1;
    }
    static void swap(int[] arr,int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
