package com.company;
import java.util.Scanner;
public class ch_4_pr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Q1
//        int age = 10;
//        if(age=11)
//            // kisi variable me agr non-0 value stored hoti thi to usse C LANGUAGE me True mana jata tha
//            // nothing of this sort occurs in Java.
//            // so this code will give error as I have used assignment operator in if condition
//        {
//            System.out.println("I am 11");
//        }
//        else
//        {
//            System.out.println("I am not 11");
//        }

        // Q2
//        System.out.print("Enter marks obtained in subject 1 : ");
//        float marks1 = obj.nextFloat();
//        System.out.print("Enter marks obtained in subject 2 : ");
//        float marks2 = obj.nextFloat();
//        System.out.print("Enter marks obtained in subject 3 : ");
//        float marks3 = obj.nextFloat();
//
//        float sum = marks1 + marks2 + marks3;
//
//        if(sum>= 120 && marks1>=33 && marks2>=33 && marks3>=33)
//        {
//            System.out.print("You have Passed this examination.");
//        }
//        else
//        {
//            System.out.print("You have Failed this examination.");
//        }

        // Q3
//        System.out.print("Enter your annual income : ");
//        float income = obj.nextFloat();
//        float income_tax=0;
//
//        if(income > 1000000)
//        {
//            income_tax += (income-1000000)*0.3;
//            income = 1000000;
//        }
//
//        if(income <= 1000000 && income>500000)
//        {
//            income_tax += (income-500000)*0.2;
//            income = 500000;
//        }
//
//        if(income <= 500000 && income>250000)
//        {
//            income_tax += (income-250000)*0.05;
//            income = 250000;
//        }
//
//        System.out.printf("You have to pay Rs.%.2f as income tax.",income_tax);

        // Q4
//        System.out.print("Enter num to find it's corresponding day : ");
//        byte num = obj.nextByte();
//
//        switch(num)
//        {
//            case 1-> System.out.println("Associated day is Monday.");
//            case 2-> System.out.println("Associated day is Tuesday.");
//            case 3-> System.out.println("Associated day is Wednesday.");
//            case 4-> System.out.println("Associated day is Thursday.");
//            case 5-> System.out.println("Associated day is Friday.");
//            case 6-> System.out.println("Associated day is Saturday.");
//            case 7-> System.out.println("Associated day is Sunday.");
//            default-> System.out.println("Invalid number entered.");
//        }

        // Q5
//        System.out.print("Enter a year : ");
//        short year = obj.nextShort();
//        if ( (( (year%4) == 0 ) && ( (year%100) != 0 )) || (( (year%400) == 0 ) && ( (year%100) == 0 ))) {
//
//            System.out.print("Entered Year is a Leap Year");
//        }
//
//        else
//        {
//            System.out.print("Year is NOT a Leap Year");
//        }

        // Q6
//        System.out.print("Enter a URL : ");
//        String  url = obj.next(); // url cannot contain spaces, so I have used next() and not nextLine()
//
//        if(url.endsWith(".com"))
//        {
//            System.out.println("URL is for a commercial website.");
//        }
//        else if(url.endsWith(".org"))
//        {
//            System.out.println("URL is for an organization.");
//        }
//        else if(url.endsWith(".in"))
//        {
//            System.out.println("URL is for an Indian website.");
//        }
    }
}
