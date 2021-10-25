import java.util.Scanner;

public class Circle {
    float radius; // radius attribute of Circle class
    // Constructor of this class
    Circle(float radius) {
        //setting radius when the class will be called
        this.radius = radius;
        // Calculating area and then printing it
        float area = 3.14f * this.radius * this.radius;
        System.out.println("Area of the circle is " + area + " sq units.");
    }
}
class Driver2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter radius of circle : "); // taking input
        float radius = obj.nextFloat();
        Circle circle1 = new Circle(radius);
    }
}
