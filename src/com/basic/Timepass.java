package com.basic;

public class Timepass {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6};
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]);
        }
        int b = Integer.parseInt(s.toString());
        System.out.println(b);

    }
}
