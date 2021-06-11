class Phone{
    public void greet(){
        System.out.println("GM");
    }
    public void on(){
        System.out.println("Turning on Phone....");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone....");
    }
    public void swagat(){
        System.out.println("Apka swagat he.");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        jab bhi new lagate he to runtime pe banta he object.
//        obj.name();
//        SmartPhone smtobj = new SmartPhone();

//        IMP -
          Phone obj = new SmartPhone();
//        above is valid, just think that a smartphone can be called a phone
//        SmartPhone smtobj = new Phone();  a phone can't be called a smartphone

//      ** Super class ke reference/object me aap sub class ka object store/refer karwa sakte ho. vice-versa is false

        // IMP - which METHODS would be allowed for obj -
        // basically all the METHODS OF SUPER CLASS ARE ALLOWED BUT THE ONES WHICH HAVE BEEN OVERRIDDEN in SUB CLASS
        // THEN THE OVERRIDDEN VERSION WILL RUN.
        obj.greet();
        obj.on(); // will run the overridden version
//        obj.swagat(); // not allowed.
    }
}
