import java.util.ArrayList;
import java.util.List;

public class ArrayLinearListJDK {
    public static void main(String[] args) {
        // Initializing an ArrayList that can store objects of the Employee class
        ArrayList<Employee> employee_list = new ArrayList<>();
        // upar wale statement me khali List shuru me likh sakte then I can change it from ArrayList to LinkedList etc
        // quickly, matlab --> List<Employee> employee_list = new ArrayList<>();

        // Initializing an ArrayList that can store objects of the String class
        List<String> str_list = new ArrayList<>(20);

        // using add() method of ArrayList to add an objects of Employee class to the end of the list (Appending)
        employee_list.add(new Employee("Madhur","Gupta",123));
        employee_list.add(new Employee("Jay","Gupta",323));
        employee_list.add(new Employee("Aditya","Singh",173));
        employee_list.add(new Employee("Mamta","Gupta",133));

        // printing the data stored in our employee_list -
        // Alt 1. using lamda expression (the thing written inside ())
//        employee_list.forEach(employee -> System.out.println(employee));
        // Alt 2. Direct use of for each loop
        for (Employee employee : employee_list) {
            System.out.println(employee);
        }
        // Alt 3. - use normal for loop to iterate and print.

        // printing data stored at a particular index in our employee_list -
        // Alt 1.
        System.out.println(employee_list.get(1).toString());
        // Alt 2.
//        System.out.println(employee_list.get(1));

        System.out.println(employee_list.isEmpty());
        System.out.println(str_list.isEmpty());

        // replacing an element (employee) from ArrayList
        employee_list.set(1,new Employee("Jaggu","Gupta",323));
        System.out.println(employee_list.get(1));

        // size -
        System.out.println(employee_list.size());

        // adding an element to a particular index in ArrayList -
        // say I want to add an element at index 3
        employee_list.add(3, new Employee("Dev","Patel",322));
        System.out.println(employee_list.get(3));

        // (IMP) converting our ArrayList to a normal Array whose elements would be objects of the class Employee  -
        Employee employee_array[] = employee_list.toArray(new Employee[employee_list.size()]);
        for (Employee emp: employee_array) {
            System.out.println(emp);
        }

        // checking whether an element / instance is present in our ArrayList or not
        System.out.println(employee_list.contains(new Employee("Dev","Patel",322)));
        System.out.println(employee_list.contains(new Employee("Dev","Ashok",322)));
        // IMP Note - The above statements return false as we have created NEW INSTANCES ie data maybe structurally
        // the same but its stored in different memory addresses hence the default .equals() method for
        // Objects that was used somewhere in .conatins() returns false.
        // So, to fix this we have to create a .equals() method in Employee class such that it checks whether data is
        // structurally same or not for the given Objects of Employee class.

        // now as we have defined equals() for Employee we can use indexOf()
        System.out.println(employee_list.indexOf(new Employee("Dev","Patel",322)));
        System.out.println(employee_list.indexOf(new Employee("Dev","Ashok",322)));

        // removing an element from ArrayList -
        // we can remove an element by index or by its instance / data.
        employee_list.remove(2);
        employee_list.remove(new Employee("Dev","Patel",322));
        // in the below line such instance is not found in the list so remove() won't do anything / no error.
        employee_list.remove(new Employee("Dev","Patel",312));

        // IMPORTANT
        // Following are 2 resizing methods for ArrayList -

        // 1. trimToSize - Trims the capacity of this ArrayList instance to be the list's current size.
         employee_list.trimToSize();

        // 2. ensureCapacity - Increases the capacity of this ArrayList instance, if necessary, to ensure that it
        // can hold at least the number of elements specified by the minimum capacity argument.
        employee_list.ensureCapacity(100);
    }
}
