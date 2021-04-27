package com.company;

public class arrays
{
    public static void main(String[] args)
    {
        // Declaring an array-

        // 1.
        int marks1[]; // declaring , ye maine array ka reference banaya he , abhi ye ni pata ki konsa/kya array isme dalega.
        marks1 = new int[5]; // memory allocation, memory allocate ki aur phir usko banaye hue reference pe point karwa di.

        // 2.
        int marks2[] = new int[5]; // declaring + memory allocation

        // 3.
        int marks3[] = {1,2,3,4,5}; // declaring + initialization (memory is automatically allocated using number of elements in array)

        // int [] marks will also work, yani sq. bracket can come before the name of the array.

        // compiler assigns a default value to array elements which isn't garbage -
//        boolean : false
//        int : 0
//        double : 0.0
//        String : null

        // Obtaining length of an array -
//        array_name.length returns the no. of elements in the array, remember no parenthesis is present after length
        System.out.println(marks1.length);
        System.out.println(marks2.length);
        System.out.println(marks3.length);

        // Creating a string array -
        String student_name[] = new String[5]; // 5 strings ka ek array bana diya.
        System.out.println(student_name.length);
        student_name[0]="Madhur";
        student_name[1]="Aditya";
        student_name[2]="Madhur";
        student_name[3]="Aditya";
        student_name[4]="Madhur";
//        student_name[5]="Aditya"; --> will throw error

    }
}
