package com.basic;

public class loop {
    public static void main(String[] args) {

        int number = 23597;
        int newNumber = 0;
        while(number !=0){
            int a = number%10;
            newNumber = newNumber*10 + a;
            number = number/10;
        }
        System.out.print(newNumber);

    }
}
