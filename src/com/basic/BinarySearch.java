package com.basic;

import static java.lang.Math.sqrt;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {76,8,6,4,3,2,1,0};
        int target = 1;
        BinarySearch bs = new BinarySearch();
        int ans = bs.binarySearch(arr,target);
        System.out.println(ans);

    }

    private int binarySearch(int[] arr,int target){

        int start = 0;
        int end = arr.length -1;

        boolean order = arr[start] < arr[end];
        if(order){
            while(start <= end){
                int mid = start + (end-start)/2;
                if(arr[mid] < target) start = mid + 1;
                else if(arr[mid] > target) end = mid - 1;
                else return mid;
            }
        }
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) start = mid + 1;
                else if (arr[mid] < target) end = mid - 1;
                else return mid;

            }
        }

        return -1;
    }
}
