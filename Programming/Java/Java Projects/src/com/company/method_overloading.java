package com.company;

public class method_overloading {
    static void foobar() {
        System.out.println("check");
    }

    static void foobar(int a) { // a is a parameter.
        System.out.println(a);
    }

    public static void main(String[] args) {

//        Overloaded Methods - 2 or more methods that have the same name but different input parameters (different datatype or
//        different in number), note - method overloading cant be achieved just by changing the return type of methods.

        foobar();
        foobar(7); // 7 is a argument.
    }
}
