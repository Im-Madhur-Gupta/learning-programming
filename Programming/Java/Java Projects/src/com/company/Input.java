package com.company;
import java.util.Scanner; // This statement will import Scanner class, which we can use to take input from user.

public class Input
{
    public static void main(String[] args)
    {
        // shortcut for System.out.println is sout
        System.out.println("Taking input from the user.");

        Scanner obj = new Scanner(System.in);
        // obj is the name of the object I just created, it's an identifier it can be anything.

        System.out.print("Enter number 1 : ");
        int a = obj.nextInt(); // taking an int input using the object of Scanner class and nextInt() method
        // .nextInt() jaise baki datatype ke liye bhi hote he, like nextFloat() etc.

        System.out.print("Enter number 2 : ");
        int b = obj.nextInt(); // taking an int input using the object of Scanner class and nextInt() method

        int sum = a+b;
        System.out.println("Sum of the numbers is : "+sum);

//        A little about classes and objects -
//        class is a template, like a blank exam answer sheet + the question paper.
//        so the object will be each student's filled answer sheet


        // checking whether an input is valid or not -
        // 1. int input
//        System.out.println("Enter an int number -");
//        boolean b1 = obj.hasNextInt();
//        System.out.println(b1);

        // 2. float input
//        System.out.println("Enter a float number -");
//        boolean b2 = obj.hasNextFloat();
//        System.out.println(b2);

    }
}
