import java.util.Iterator;
import java.util.LinkedList;
// java docs link - https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/LinkedList.html
public class LinkedListJDK {
    public static void main(String[] args) {
        // this linked list is basically doubly linked list
        LinkedList<Employee> employee_DLL_JDK = new LinkedList<>();
        employee_DLL_JDK.addFirst(new Employee("Madhur","Gupta",123));
        employee_DLL_JDK.addFirst(new Employee("Jay","Gupta",323));
        employee_DLL_JDK.addFirst(new Employee("Aditya","Singh",173));
        employee_DLL_JDK.addLast(new Employee("Mamta","Gupta",133));
        employee_DLL_JDK.add(2,new Employee("Shishir","Gupta",132));
        // Note - add() without any index is basically addLast()

        // PRINTING THE LIST
        // METH 1 - Iterator class's object iter is used to iterate through our list
        Iterator iter = employee_DLL_JDK.iterator();
        // hasNext() basically tells us whether there are elements left in the list or not
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

//        // METH 2 - For each loop
//        for(Employee emp:employee_DLL_JDK){
//            System.out.println(emp);
//        }

        employee_DLL_JDK.remove();
        // remove() removes the 1st element
        employee_DLL_JDK.removeFirst();
        employee_DLL_JDK.removeLast();
        employee_DLL_JDK.remove(1);
        for(Employee emp:employee_DLL_JDK){
            System.out.println(emp);
        }
    }
}
