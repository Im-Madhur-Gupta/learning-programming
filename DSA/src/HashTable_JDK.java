import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashTable_JDK {
//    https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/HashMap.html
    public static void main(String[] args) {
        Map<String,Employee> ht1 = new HashMap<String,Employee>();
        ht1.put("gupta1", new Employee("madhur1", "gupta1", 1));
        ht1.put("gupta2_", new Employee("madhur2", "gupta2_", 2));
        ht1.put("gupta3__", new Employee("madhur3", "gupta3__", 3));
        ht1.put("gupta4___", new Employee("madhur4", "gupta4___", 4));
        ht1.put("g", new Employee("madhur4", "g", 5));
        ht1.put("gupta5", new Employee("madhur5", "gupta5", 5));
        ht1.put("gupta6", new Employee("madhur6", "gupta6", 6));
        // JDK implementation of HashTables doesnt allow duplicate keys,
        // if found then the new data is replaced with the old data (for put() method).

        // Reentering an already inserted key will cause the old data to be replaced with the new one.
        Employee oldemp = ht1.put("gupta6", new Employee("madhur6", "gupta6", 10));

//        ht1.putIfAbsent("gupta6", new Employee("madhur6", "gupta6", 10));
//        putIfAbsent() will insert the element only if the key hasnt already been used
//        And it returns the currently stored element at that key

        // Printing our HashMap
        // 1. using iterator
//        Iterator<Employee> iter = ht1.values().iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        Note - The order in which I added the elements isnt the order in which they are stored in the hashmap
//        bcz storing is done corresponding to the hashed value and not acc. to the order in which the were added.

        // 2. using forEach() loop
        ht1.forEach((k,v)->System.out.println("Key = "+k+", value = "+v));

        System.out.println("old emp at 'gupta6' is - "+oldemp);

        // Searching with a key or value
        System.out.println(ht1.containsKey("gupta6"));
        System.out.println(ht1.containsKey("gupta10"));
        System.out.println(ht1.containsValue(new Employee("madhur6", "gupta6", 10)));
        System.out.println(ht1.containsValue(new Employee("mad12hur6", "gupta600", 102)));

        // Searching for an element corresponding to a key using get(), returns null if not found.
        System.out.println(ht1.get("gupta1"));
        System.out.println(ht1.get("gupta10"));

        // if not found then return the second arguement.
        System.out.println(ht1.getOrDefault("gupta10",new Employee("404 Not Found", " ", 1000)));

        // Removing - If element is not present nothing happens and a null is returned.
        System.out.println(ht1.remove("gupta1"));
        System.out.println(ht1.remove("gupta10"));
        ht1.forEach((k,v)->System.out.println("Key = "+k+", value = "+v));
    }
}
