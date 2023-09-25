package com.basic;
import java.util.*;
import java.util.stream.Stream;


public class ArrayFormOfInteger {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        int k = 10;
        System.out.println(addToArrayForm(num, k));


    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        //char[] ch = Arrays.toString(num).toCharArray();
        String s = "";
        for (int i = 0; i < num.length; i++) {
            s = s + num[i];
        }
        int value = Integer.parseInt(s);
        value += k;
        s = Integer.toString(value);
        //int[] arr = Stream.of(String.valueOf(value).split("")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list1 = new LinkedList<>();
        int[] arr = new int[s.length()];
        int i=0;;
        while(value!=0){
            arr[i] = value%10;
            value = value/10;
            i++;
        }
        for(int j = arr.length-1;j>0;j--){
            list1.add(arr[j]);
        }


        return list1;
    }
}
