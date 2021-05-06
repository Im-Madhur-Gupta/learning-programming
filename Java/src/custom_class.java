package com.company;

class Employee{
    // A .java file can contain only 1 public class, and the name of this public class should match with
    // the name of the .java file, here, custom_class.java

    // A custom class is an extension of structure in C, structure me mai sirf variables (attributes)
    // dalta tha, class me mai attributes ke sath sath functions/methods bhi dal sakta hu.

    // Attributes -
    int id;
    int age;
    String address;
    String name;
    int salary;

    // Methods -
    public void printDetails(){
        // Note - This function isn't static matlab object bana ke hi call karna padega.
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
    }
    public int getSalary(){
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); // Instantiating an object of custom class Employee
        emp1.name = "Madhur Gupta";
        emp1.id = 202051112;
        emp1.age = 20;
        emp1.printDetails(); // ye line ye keh rahi he ki emp1 ki details print kardo.

        Employee emp2 = new Employee();
        emp2.name = "Jay Gupta";
        emp2.id = 202052112;
        emp2.age = 18;
        emp2.salary = 10000000;
        emp2.printDetails();
        System.out.println(emp2.getSalary());

    }
}
