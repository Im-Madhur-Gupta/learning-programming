class Base1{
    public Base1() {
        System.out.println("Contructor of base.");
    }
    public Base1(int a) {
        System.out.println("Contructor of base with a = "+a);
    }
}
class Derived1 extends Base1{
    public Derived1(){
        // yaha super ni likha to its equivalent to super(); matlab by default bina arguments wala constructor trigger hoga.
        System.out.println("Constructor of derived.");
    }

    public Derived1(int a){
        // **
        super(a); // wo wala iski superclass ka constructor chahiye jo 1 int value as input le
        System.out.println("Constructor of derived with a.");
    }

    public Derived1(int a,int b){
        super(a);
        System.out.println("Overloaded Constructor of derived with b = "+b);
    }
}
class ChildOfDerived1 extends Derived1{
    public ChildOfDerived1(){
        super(); // matlab parent class ka aisa constructor trigger karo jo koi argument na le.
        System.out.println("I am constructor of child of derived.");
    }
    public ChildOfDerived1(int a,int b,int c){
        super(a,b); // iski super class ka aisa constructor chahiye jo 2 int value as input le
        System.out.println("I am overloaded constructor of child of derived with c = "+c);
    }
}
public class Constructors_in_Inheriatnce {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
        // Agr app derived class ka object banaoge to pehle wo base class ke constructor ko call karga
        // phir derived class ke constructor ko call karega.

        // Remember agr kisi class ka constructor apn define ni karte to java default constructor (not an actual name)
        // ko call karta he matlab parameters me default values acc. to their datatype fill kardeta he

        // IMPORTANT -
        // derived class ke object creation me by DEFAULT wo base class ka non-agruement wala constructor ko call karta he
        // (Above happens when super isnt used or super(); is used.)
        // Ab manlo base class me constructor overloading ho rakhi he, aur mujhe base ka koisa overloaded constructor trigger
        // karna he from derived class object creation, to kaise kare, MOVE TO CONSTRUCTOR OF DERIVED CLASS **

//        Derived1 d1 = new Derived1(1);
//        Derived1 d2 = new Derived1(12,44);

        ChildOfDerived1 cd = new ChildOfDerived1();
//        ChildOfDerived1 cd1 = new ChildOfDerived1(21,54,73);
    }
}
