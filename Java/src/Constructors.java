class MyEmployee{
    private int id;
    private String name;
    int salary;

    public void setId(int temp_id){
        id=temp_id;
    }
    public void setName(String  temp_name){
        name=temp_name;
    }
    public int getId(){
        return id;
    }
    public String  getName(){
        return name;
    }

    public MyEmployee(){ // constructor public hoga and it has NO return type
        id = -1;
        name = "Your-Name";
        salary = -1;
    }
    public MyEmployee(int myId){
        id = myId;
        name = "Your-Name";
        salary = -1;
    }
    public MyEmployee(int myId,String myName){
        id = myId;
        name = myName;
        salary = -1;
    }
}
public class Constructors {
    public static void main(String[] args) {
        MyEmployee obj = new MyEmployee();
        // in the above line MyEmployee() is a constructor of MyEmployee class
        // constructors are such functions of a class that have the same name as the class name
        // and they are used to initialize an object while creating it.

        // one use of constructors is to set some default values to an object's attributes.
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.salary);

        obj.setId(7);
        obj.setName("Ronaldo");
        obj.salary = 1000000;
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.salary);

        // ab zaroori ni he ki constructor koi argument na le, it can take any number of arguments.
        // also, constructors being a method can be overloaded
        MyEmployee obj1 = new MyEmployee(1);
        MyEmployee obj2 = new MyEmployee(1,"Aditya");
        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
        System.out.println(obj2.getId());
        System.out.println(obj2.getName());
    }
}
