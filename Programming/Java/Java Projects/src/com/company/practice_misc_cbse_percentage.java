package com.company;
import java.util.Scanner;
public class practice_misc_cbse_percentage
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter marks for subject 1 : ");
        float s1 = obj.nextFloat();
        System.out.print("Enter marks for subject 2 : ");
        float s2 = obj.nextFloat();
        System.out.print("Enter marks for subject 3 : ");
        float s3 = obj.nextFloat();
        System.out.print("Enter marks for subject 4 : ");
        float s4 = obj.nextFloat();
        System.out.print("Enter marks for subject 5 : ");
        float s5 = obj.nextFloat();

        float percent = (s1+s2+s3+s4+s5)/5;
        System.out.println("Obtained percentage is : "+percent);
    }
}
