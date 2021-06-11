// We know that Abstract Class contains atleast 1 abstract method, its abvious that it can contain non-abstract/concrete methods.
// Interface in java is a group of related methods such that all of them have only been defined but not implemented
// (these methods are abstract methods but we don't use that name).

// If a class implements an interface then it has to implement all of its methods or be a abstract class itself.

// Remember - When we implement a method of an interface in a class then I HAVE to use public access modifier for that method.

// Basic difference between Interface and Abstract Class is that, at a time 1 abstarct class can create only 1 child class
// (a class can inherit from only 1 parent) but multiple interfaces can be simultaenously implemented on a class.
// inheritance and interface implementation can be simultaenously done on a single class.

// Note - Interface can also contain properties/parameters, but these properties/parameters can't be modified as they are final, Go to main.

interface Bicycle{
    int a = 7;
    void speedUp();
    void speedDown();
}
interface Bicycle1{
    String b = "Mad";
    void speedUp1();
    void speedDown1();
}

abstract class C implements Bicycle{}

class C1 implements Bicycle{
    public void speedUp(){
        System.out.println("temp");
    }
    public void speedDown(){
        System.out.println("temp2");
    }
//    void speedDown(){ --> as the access modifier isnt public this will cause error.
//        System.out.println("temp2");
//    }
}

class C2 implements Bicycle1, Bicycle{
    public void speedUp1(){
        System.out.println("temp");
    }
    public void speedDown1(){
        System.out.println("temp2");
    }
    public void speedUp(){
        System.out.println("temp3");
    }
    public void speedDown(){
        System.out.println("temp4");
    }
}

public class Interface{
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.speedUp();
        obj.speedDown();
        System.out.println(obj.a);
//        obj.a = 8; --> a can't be changed.
    }
}
