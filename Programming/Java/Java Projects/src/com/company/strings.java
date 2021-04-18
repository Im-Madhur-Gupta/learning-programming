package com.company;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        // String in java is not a primitive datatype
        // it's rather a class which gives special support for strings.
        // it could be used like a primitive datatype.

        // creating a new object/variable of String class -

//        String str = new String("Madhur Gupta");
        // OR
//         String str;
//         str = new String("Madhur Gupta");
        // OR
        String str = "Madhur Gupta"; // used String as a primitive datatype.
        System.out.println(str);
        // Strings are immutable, element wise modification isn't allowed.

        // some other methods to print besides .print and .println -

        // 1. System.out.printf() --> this is just like printf of C language.
        int a = 7;
        float b = 7.6f;
        System.out.printf("a is %d\nf is %6.2f",a,b);
        // to control num of decimal places in a float value, use %m.nf for
        // total m places (including .) with n places of decimal.
        // %c for char and %s for String.
        // Just like in C, .printf() will not print an extra newline after completing it's job.

        // 2. System.out.format() --> works SAME as .printf().
//        System.out.format("a is %d\nf is %f",a,b);

        Scanner obj = new Scanner(System.in);

        String str2 = obj.nextLine(); // .next() - one word , .nextLine() - multi word
    }
}
