import java.util.NoSuchElementException;
// Linear Probing wali Hash Table - Doesnt work for duplicate keys
public class HashTable_LinearProbing {
    private Employee hashTable[];

    public HashTable_LinearProbing() {
        hashTable = new Employee[10];
    }

    public void put(String key, Employee emp) { // Linear Probing
        int hashedvalue = HashFuncMam(key);
        if (!indexIsEmpty(hashedvalue)) {
            int stopIndex = hashedvalue;
            do {
                hashedvalue = (hashedvalue + 1) % 10;
            } while (!indexIsEmpty(hashedvalue) && hashedvalue != stopIndex);
            if (hashedvalue == stopIndex) {
                throw new IllegalArgumentException("Hash Table is full.");
            }
        }
        hashTable[hashedvalue] = emp;
    }

    public Employee get(String key) {
        int hashedvalue = HashFuncMam(key), stopIndex = hashedvalue;
        do {
            if (hashTable[hashedvalue] != null && hashTable[hashedvalue].getLastName().equals(key)) {
                return hashTable[hashedvalue];
            }
            hashedvalue = (hashedvalue + 1) % 10;
        } while (hashedvalue != stopIndex);
        // Loop condition says that you have to iterate through the whole hash table unless you
        // find an element whose lastname matches with the key.
        throw new NoSuchElementException("Element doesn't exist.");
    }

    public Employee delete(String key) {
        int hashedvalue = HashFuncMam(key), stopIndex = hashedvalue;
        Employee toReturn=hashTable[hashedvalue];
        do {
            if (hashTable[hashedvalue] != null && hashTable[hashedvalue].getLastName().equals(key)) {
                hashTable[hashedvalue]=null;
                this.rehash();
                return toReturn;
            }
            hashedvalue = (hashedvalue + 1) % 10;
        } while (hashedvalue != stopIndex);
        throw new NoSuchElementException("Element doesn't exist.");
    }
    private void rehash(){
        HashTable_LinearProbing tempHT = new HashTable_LinearProbing();
        for(int i=0;i<this.hashTable.length;i++){
            if(this.hashTable[i]!=null){
                tempHT.put(this.hashTable[i].getLastName(),this.hashTable[i]);
            }
        }
        this.hashTable = tempHT.hashTable;
    }

    private Boolean indexIsEmpty(int index) {
        return hashTable[index] == null;
    }

    public void printHashtable() {
        System.out.println("\nPrinting - ");
        for (Employee emp : hashTable) {
            System.out.println(emp);
        }
    }

    // Hashing Function - Key --> Hashed Value.
//    1. Mam's hash function - Not that great.
    private int HashFuncMam(String key) {
        return key.length() % 10; // mam wrote %hashTable.length; but thats a constant 10.
    }

}

class Apply1 {
    public static void main(String[] args) {
        HashTable_LinearProbing hashtable1 = new HashTable_LinearProbing();
        hashtable1.put("gupta1", new Employee("madhur1", "gupta1", 1));
        hashtable1.put("gupta2_", new Employee("madhur2", "gupta2_", 2));
        hashtable1.put("gupta3__", new Employee("madhur3", "gupta3__", 3));
        hashtable1.put("gupta4___", new Employee("madhur4", "gupta4___", 4));
        hashtable1.put("g", new Employee("madhur4", "g", 5));
        hashtable1.put("gupta5", new Employee("madhur5", "gupta5", 5));
        hashtable1.put("gupta6", new Employee("madhur6", "gupta6", 6));

        hashtable1.printHashtable();
        System.out.println("\nkey = 'g' --> Employee = " + hashtable1.get("g"));
        System.out.println("\nkey = 'gupta1' --> Employee = " + hashtable1.get("gupta1"));
        System.out.println("\nkey = 'gupta5' --> Employee = " + hashtable1.get("gupta5"));
        System.out.println("\nkey = 'gupta6' --> Employee = " + hashtable1.get("gupta6"));
//        System.out.println("\nkey = 'gupta6' --> Employee = " + hashtable1.get("gupta7")); --> not in the hashtable so it will throw error

        hashtable1.delete("gupta1");
//        hashtable1.delete("gupt"); --> not in the hashtable so it will throw an error.
        hashtable1.printHashtable();
    }
}
