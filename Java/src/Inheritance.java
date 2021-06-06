class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printMe() {
        System.out.println("just a sout.");
    }
}
class Derived extends Base{
    // Now Derived class has inherited all the ppts and methods of Base class.
    // Base class ke sare varaibles and methods are AVAILABLE in Derived class, whether they would be ACCESSIBLE or not that depends on access modifier.
    // Java doesn't allow multiple inheritances, ie. ek sub class ki 2 or more super class ni ho sakti.
    // Base is also called Parent and Super Class
    // Derived class is also called Child and Sub Class
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    int x;
    public Animal(){
        System.out.println("Im an animal.");
    }
}
class Dog extends Animal{
    int y;
    public Dog(){
        System.out.println("Im a dog.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base obj1 = new Base();
        obj1.setX(7);
        System.out.println(obj1.getX());

        Derived obj2 = new Derived();
        obj2.setY(6);
        System.out.println(obj2.getY());
        obj2.setX(4);
        System.out.println(obj2.getX());
    }
}
