package com.basic;

import java.util.Arrays;

public class MinValueIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {111,21},
                {11,34,6,8,3,41},
                {71,8}
                        };

        int ans = minimumValueIn2D(arr);
        System.out.println(ans);
        int[] index = minimumValueIn2DIndex(arr);
        System.out.println(Arrays.toString(index));

    }

    static int minimumValueIn2D(int[][] arr){

        int element = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(element > arr[i][j]) element = arr[i][j];
            }
        }
        return element;


    }

    static int[] minimumValueIn2DIndex(int[][] arr){

        int element = arr[0][0];
        int[] a = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(element > arr[i][j]){
                    element = arr[i][j];
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;

    }

}
