package com.basic;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,346,7,8,4};
        int ans = minimumValueUsingLinearSearch(arr);
        System.out.println(ans);
    }

    static int minimumValueUsingLinearSearch(int[] arr){

        if(arr.length == 0) return -1;
        int element = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(element > arr[i]) element = arr[i];
        }
        return element;
    }
}

