class A{
    public int a;
    public int madhur(){
        return 7;
    }
    public int jay(){
        return 10;
    }
    public void meth2(){
        System.out.println("I am method 2 of A class.");
    }
}
class B extends A{
    public void meth3(){
        System.out.println("I am method 3 of B class.");
    }

    // maine B ko A ki cheeze inherit to kara di but mai chahta hu ki jo B ka meth2() ho wo A ke meth2() se alag ho
    // to mai method overriding karunga aur meth2() ko B (child class) me phirse define kardunga, ab agr b ka object
    // banake meth2() ko call karenge ya B class me kahi meth2() ko simply call karenge to overriden meth2() respond
    // karega, note agr A (parent class) ka object banake meth2() ko call kiya to non-overriden version respond karega
    // aur agr mujhe B (child class) ke andar non-overridden version call karna he to I can use super.meth2();
    @Override
    // ye @Override likh dena is a part of good programming practice.
    // Also, if in the future we change the super class code for the overriden method (meth2()) then this @Override
    // will give an error saying that the method hasn't being overriden.
    // Basically agr @Override ke neche wala method sahi me override ni ho raha hoga to error milega.
    public void meth2(){
        System.out.println("I am method 2 of B class.");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        System.out.println(a.madhur());

        B b = new B();
        b.meth2();
    }
}
