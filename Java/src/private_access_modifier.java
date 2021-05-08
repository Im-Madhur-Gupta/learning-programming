class Employee_private{
    private int id;
    private String name;
    int salary; // agr koi access modifier mentioned nhi he matlab wo default type ka he.
    // id and name are private matlab ki they can only be accessed by methods of it's class ie Employee_private.
    // they cannot be accessed directly outside this class.

    // getters and setters - getters are used to return some info, setters are used to set some info.
    // private attributes ke liye getters and setters banane padenge

    // setter for id
    public void setId(int temp_id){
        id=temp_id;
    }
    // setter for name
    public void setName(String  temp_name){
        name=temp_name;
    }
    // getter for id
    public int getId(){
        return id;
    }
    // getter for name
    public String  getName(){
        return name;
    }

//    Note - getter and setter banane ka shortcut (alt+insert) --> Getter and Setter, then select the variables for
//    which we want to create g and s. alternatively top bar me Code then Generate then same
}
public class private_access_modifier {
    public static void main(String[] args) {
        Employee_private emp = new Employee_private();
        emp.setId(12);
        System.out.println(emp.getId());
        emp.setName("madhur");
        System.out.println(emp.getName());
        emp.salary=100000000;
        System.out.println(emp.salary);

    }
}
