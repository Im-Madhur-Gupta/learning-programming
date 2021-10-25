import java.util.Scanner;

public class Student {
    String name;
    String en_num;
    double science;
    double maths;
    double english;

    // Constructor that will initialize object with name and enrollment number
    public Student(String name, String en_num) {
        this.name = name;
        this.en_num = en_num;
    }

    // setMarks() Method will initialize marks of an object of Student Class
    public void setMarks(double science, double maths, double english) {
        this.science = science;
        this.maths = maths;
        this.english = english;
    }

    public double getAvgPercent() {
        return (this.science + this.maths + this.english) / 3.0;
    }

    // display() method will display all the details of a student object
    public void display() {
        System.out.println("Name of the student: " + this.name);
        System.out.println("Enrollment Number of the student: " + this.en_num);
        System.out.println("Marks obtained in Science: " + this.science);
        System.out.println("Marks obtained in Maths : " + this.maths);
        System.out.println("Marks obtained in English: " + this.english);
        System.out.println("Average percentile obtained: " + this.getAvgPercent());
    }
}

class Driver3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // taking all required Inputs
        System.out.print("Enter the Name of the student: ");
        String name = obj.nextLine();
        System.out.print("Enter the Enrollment number of the student: ");
        String en_num = obj.nextLine();

        System.out.print("Enter marks obtained in Science: ");
        double science = obj.nextDouble();
        System.out.print("Enter marks obtained in Maths: ");
        double maths = obj.nextDouble();
        System.out.print("Enter marks obtained in English: ");
        double english = obj.nextDouble();

        //creating an object of Student class
        Student student1 = new Student(name,en_num);
        student1.setMarks(science,maths,english);
        System.out.println("\n*****The details of student1 are as follows: *****");
        student1.display(); // calling display() method
    }
}