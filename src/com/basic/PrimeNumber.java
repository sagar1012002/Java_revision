package com.basic;

public class PrimeNumber {


    public static void main(String[] args) {

        double value1 = 347556515;
        PrimeNumber p = new PrimeNumber();
        boolean ans = p.isPrime(value1);
        System.out.println(ans);

    }

    public boolean isPrime(double value) {


        double a = Math.sqrt(value);
        for (double i = 2; i < a; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;


    }

}

