package academy.learnprogramming.hashtableschallenge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        HashMap<Integer,Employee> tempHM = new HashMap<>();
        Employee tempemp;

        // 1. easiest but not the fastest
//        while(!employees.isEmpty()){
//            tempemp = employees.remove();
//            tempHM.put(tempemp.getId(),tempemp);
//        }
//        tempHM.forEach((k,v)->employees.add(v));

        // 2. fastest possible -
        Iterator<Employee> iter = employees.listIterator();
        while(iter.hasNext()){
            tempemp = iter.next();
            if(tempHM.containsKey(tempemp.getId())){
                iter.remove(); // MVP step - iterator ne jo latest value return ki uss value ko actual List me se delete kardo.
                continue;
            }
            tempHM.put(tempemp.getId(),tempemp);
        }

        employees.forEach(e -> System.out.println(e));

        

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value) % 10;
    }
}
