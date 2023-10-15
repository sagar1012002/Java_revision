package com.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateAndMissing {

    //cyclic sort

    public static void main(String[] args) {
        int[] arr = {3,2,2};
        sort(arr);
        int[] list1 = new int[2];
        int i=0;
        while(i< arr.length){
            int value = arr[i] -1;
            if(i != value){
                list1[0] = arr[i];
                list1[1] = i+1;
            }
            i++;
        }
        System.out.println(Arrays.toString(list1));
    }

    static void sort(int[] arr){
        int index =0;
        while(index< arr.length){
            int value = arr[index] -1;
            if(arr[index] != arr[value]){
                swap(arr,index,value);
            }else index++;
        }

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}

