package com.company;
import java.util.Scanner;
public class ch_1_pr {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
//        Q1
//        System.out.print("Enter number 1 : ");
//        float a = obj.nextFloat();
//        System.out.print("Enter number 2 : ");
//        float b = obj.nextFloat();
//        System.out.print("Enter number 3 : ");
//        float c = obj.nextFloat();
//        float sum = a+b+c;
//        System.out.println("Sum is : "+sum);

//        Q3
//        System.out.print("Enter your name : ");
//        String name = obj.nextLine();
//        System.out.println("Hello "+name+", have a good day.");

//        Q4
//        System.out.print("Enter kilometer value : ");
//        float km = obj.nextFloat();
//        System.out.print("Converted value for miles is : ");
//        System.out.println(km*0.621371);

//        Q5
        System.out.println("Enter an int value -");
        boolean int_test = obj.hasNextInt();
        System.out.println(int_test);
    }
}
