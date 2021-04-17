package com.company;

public class operators {
    public static void main(String[] args) {
        // In java % (Modulo) operator can work on floats and doubles.
        // arithmetic operators can't be used with boolean operands
        // = operator works similar as it did in C, right wali value ko utha ke left wale container me dal do
        // int int ke beech arithmetic operation returns an int, int aur float returns float , float float returns float
        // more on above in notes chp-2.
        // char on arith. op. with any integer will result an integer
        // rest all operator ppt. are same as in C language.

        // Associativity (to break tie) - agr L to R he matlab left side se execution chalu hoga, similar for R to L

        // by default decimal literal is a double literal in java

        char a = 'A';
        a++; // a = a + 1 - (a+1) will give int but as we are storing it in an char variable it gets converted
        System.out.println(a);
    }
}
