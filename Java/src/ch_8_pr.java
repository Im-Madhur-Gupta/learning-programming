import java.util.Scanner;
// Q1
class Employee{
    int salary;
    String name;
    public int getSalary(){return salary;}
    public String getName(){return name;}
    public void setName(){
        System.out.print("Enter new name : ");
        Scanner obj = new Scanner(System.in);
        name = obj.nextLine();
    }
//     driver code -
//    Employee emp1 = new Employee();
//    emp1.salary=10000000;
//    emp1.name="Madhur Gupta";
//        System.out.println(emp1.getSalary());
//        System.out.println(emp1.getName());
//        emp1.setName();
//        System.out.println(emp1.getName());
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
//    CellPhone phone = new CellPhone();
//        phone.ring();
//        phone.vibrate();
}

class Square{
    double side;
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return side*4;
    }
//    Square sq1 = new Square();
//    sq1.side=10.0;
//        System.out.println(sq1.area());
//        System.out.println(sq1.perimeter());
}

class Rectangle{
    double length;
    double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return (length+breadth)*2;
    }
}
public class ch_8_pr {
    public static void main(String[] args) {

    }
}
