import java.util.NoSuchElementException;

// Chaining wali hashTable - Doesnt work for duplicate keys
public class HashTable_Chaining {
    LinkedList<Employee> hashTable[];

    public HashTable_Chaining() {
        hashTable = new LinkedList[10]; // Instantiated the array
        // Note - This algo doesnt check for load factor.
    }

    public void put(String key, Employee emp) {
        int hashedvalue = HashFuncMam(key);
        if (hashTable[hashedvalue] == null) { // Instantaited the Linked list present at index hashedvalue
            hashTable[hashedvalue] = new LinkedList<Employee>();
        }
        hashTable[hashedvalue].addToFront(emp);
    }

    public Employee get(String key) {
        int hashedvalue = HashFuncMam(key);
        if (hashTable[hashedvalue] != null) {
            Node currentNode = hashTable[hashedvalue].firstNode, prevNode = null;
            Employee currentEmp;
            while (currentNode != null) {
                currentEmp = (Employee) currentNode.data;
                if (currentEmp.getLastName().equals(key)) {
                    return currentEmp;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        throw new NoSuchElementException("Element not found.");
    }

    public Employee delete(String key) {
        int hashedvalue = HashFuncMam(key);
        if (hashTable[hashedvalue] != null) {
            Node currentNode = hashTable[hashedvalue].firstNode, prevNode = null;
            Employee currentEmp;
            while (currentNode != null) {
                currentEmp = (Employee) currentNode.data;
                if (currentEmp.getLastName().equals(key)) {
                    if (prevNode == null) {
                        hashTable[hashedvalue].firstNode = hashTable[hashedvalue].firstNode.next;
                    }
                    else {
                        prevNode.next = currentNode.next;
                    }
                    hashTable[hashedvalue].size--;
                    return currentEmp;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        throw new NoSuchElementException("Element not found.");
    }

    private int HashFuncMam(String key) {
        return key.length() % 10;
//        return Math.abs(key.hashCode()%hashTable.length);
//        upar maine absolute function ka use issi liye kiya he kyoki string.hashCode() can be -ive.
    }

    public void printHT_C() {
        for (int i = 0; i < 10; i++) {
            if (hashTable[i] != null) {
                System.out.print(hashTable[i] + ",   ");
            }
            else {
                System.out.print("null,   ");
            }
        }
    }
}

class Apply2 {
    public static void main(String[] args) {
        HashTable_Chaining htc1 = new HashTable_Chaining();
        htc1.put("gupta1", new Employee("madhur1", "gupta1", 1));
        htc1.put("gupta2_", new Employee("madhur2", "gupta2_", 2));
        htc1.put("gupta3__", new Employee("madhur3", "gupta3__", 3));
        htc1.put("gupta4___", new Employee("madhur4", "gupta4___", 4));
        htc1.put("g", new Employee("madhur4", "g", 5));
        htc1.put("gupta5", new Employee("madhur5", "gupta5", 5));
        htc1.put("gupta6", new Employee("madhur6", "gupta6", 6));

        htc1.printHT_C();

        System.out.println("\nkey = 'g' --> Employee = " + htc1.get("g"));
        System.out.println("\nkey = 'gupta1' --> Employee = " + htc1.get("gupta1"));
        System.out.println("\nkey = 'gupta5' --> Employee = " + htc1.get("gupta5"));
        System.out.println("\nkey = 'gupta6' --> Employee = " + htc1.get("gupta6"));
//        System.out.println("\nkey = 'gupta7' --> Employee = " + htc1.get("gupta7"));

        System.out.println("\nkey = 'gupta2_' --> Employee = " + htc1.delete("gupta2_"));
        System.out.println("\nkey = 'gupta4___' --> Employee = " + htc1.delete("gupta4___"));

        htc1.printHT_C();

        System.out.println("\nkey = 'g' --> Employee = " + htc1.get("g"));
        System.out.println("\nkey = 'gupta1' --> Employee = " + htc1.get("gupta1"));
        System.out.println("\nkey = 'gupta5' --> Employee = " + htc1.get("gupta5"));
        System.out.println("\nkey = 'gupta6' --> Employee = " + htc1.get("gupta6"));
//        System.out.println("\nkey = 'gupta2_' --> Employee = " + htc1.get("gupta2_"));
    }
}