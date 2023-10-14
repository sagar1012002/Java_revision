package com.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class FindKthPosition {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4};
            int k = 2;
            FindKthPosition fn = new FindKthPosition();
            int ans = fn.findKthPositive(arr,k);
        System.out.println(ans);
    }
//    public int findKthPositive(int[] arr, int k) {
//        int[] ans = new int[k];
//
//        for(int i=1;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(i != arr[j]){
//                    ans[i] = i;
//                    break;
//                }
//                else if(i == arr[j]) break;
//            }
//        }
//
//
//        int i = ans[ans.length-1];
//        while(i<= k){
//            ans[i] = i+1;
//            i++;
//
//        }
//
//        int n = ans[k-1];
//        return n;
//
//    }
public int findKthPositive(int[] arr, int k) {
    ArrayList<Integer> ans = new ArrayList<>();
    int n = arr.length;
    for(int i=1;i<=20;i++){
        ans.add(i);
    }

    for(int i = 0;i<n;i++){
        ans.remove(Integer.valueOf(arr[i]));
        System.out.println(ans);
    }


    int value = ans.get(k);
    return value;


}
}
