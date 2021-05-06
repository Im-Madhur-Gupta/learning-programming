package com.company;

public class recursion {
    static long factorial(int n) {
        if(n==1||n==0) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    static long fibonacci(int n) {
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(5));
    }
}
