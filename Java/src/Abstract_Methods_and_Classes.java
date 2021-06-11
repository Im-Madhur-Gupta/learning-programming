// Abstract Class matlab aisi class jisme atleast 1 abstract method ho.
// these abstract methods can later be implemented/coded in the subclasses of an abstract class.
// Also, it's mandatory for a child class of an abstract class to either implement/code the abstract methods or be abstract itself.
// Why Abstract Class - Basically it sets a standard/template, upon which other classes will be made.
// IMP - For this reason we cannot make objects of an Abstract Class, but we can create its reference tho, Go to main method.
abstract class Parent{
    public Parent(){
        System.out.println("Main Parent Class ka constructor hoon.");
    }
    public void sayHello(){
        System.out.println("Hello.");
    }
    // abstract method matlab aisa method jiska maine implementation/code ni diya he sirf definition de he, later it
    // can be coded in a subclass of its abstract class.
    abstract public void greet();
}
class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning.");
    }
}
class Child2 extends Parent{
    @Override
    public void greet(){
        System.out.println("Whats up.");
    }
}
abstract class Child3 extends Parent{}

public class Abstract_Methods_and_Classes {
    public static void main(String[] args) {
        // Parent p = new Parent(); --> Not possible as Parent is Abstract Class.

        Parent p1 = new Child1();
        Parent p2 = new Child2();
        // --> Above valid he kyoki maine abstract class ke reference ko concrete subclass ke object pe point karwadiya he
        // Dynamic Method Dispatch.

        // Parent p3 = new Child3(); --> Not possible as Child3 is Abstract Class.
    }
}
