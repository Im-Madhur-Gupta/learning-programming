import java.util.*;
// LAB 4
public class ArrayList{
//  declaraing element array of Object type (generic) and size variable (default = 0)
    protected Object element[];
    protected int size=0;

//   constructors -
    public ArrayList(){
//      when initial capacity of array isn't known, array of capacity 10 is declared
        element = new Object[10];
    }

    public ArrayList(int initialCapacity){
        if(initialCapacity<1){
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        element = new Object[initialCapacity];
    }

//   methods -
    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public void checkIndex(int index){
        if(index<0 || index>(size-1)){
            throw new IndexOutOfBoundsException("Make sure that index is >= 0 and <= (size-1).");
        }
    }

    public Object get(int index){
        checkIndex(index);
        return element[index];
    }

    public int indexOf(Object search_element){
        // this method returns index corresponding to 1st occurence of an element
        // and returns -1 if element is not found in the list
        for(int i=0;i<size;i++){
            if(element[i].equals(search_element)){
                return i;
            }
        }
        return -1;
    }

    public Object remove(int index){
        checkIndex(index);
        Object removed_element = element[index];
        for(int i=index;i<(size-1);i++){
            element[i] = element[i+1];
        }
        element[size-1]=null;
        size--;
        return removed_element;
    }

    public void removeFront(){
        remove(0);
    }

    public void removeRear(){
        remove(size-1);
    }

    public void add(int index,Object the_element){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Make sure that index is >= 0 and <= size.");
        }

        if(size==element.length){
            Object doublesize_element[] = new Object[element.length*2];
            System.arraycopy(element,0,doublesize_element,0,element.length);
            element = doublesize_element;
        }
        for (int i=size-1;i>=index;i--){
            element[i+1] = element[i];
        }
        element[index]=the_element;
        size++;
    }

    public void addToFront(Object the_element){
        add(0,the_element);
    }

    public void addToRear(Object the_element){
        add(size,the_element);
    }

    public String convToString(){
        StringBuffer temp_str = new StringBuffer("[");
        for(int i=0;i<size;i++){
            if(element[i]==null){
                temp_str.append("null, ");
            }
            else{
                temp_str.append(element[i].toString()+", ");
            }
        }
        if(size>0){
            temp_str.delete(temp_str.length()-2,temp_str.length());
        }
        temp_str.append("]");
        return new String(temp_str);
    }
}
class Application {
    public static void main(String[] args) {
        // Creating objects of ArrayList class
        ArrayList list1 = new ArrayList(5);
        ArrayList list2 = new ArrayList();

        // using wrapper classes to convert primitive datatypes to objects which will be passed to ArrayList object
        Integer int_obj_1 = new Integer(7);
        Integer int_obj_2 = new Integer(2);
        Float float_obj_1 = new Float(1.2);
        Float float_obj_2 = new Float(-0.7);
        Character char_obj_1 = new Character('m');
        Character char_obj_2 = new Character('a');
        Boolean boolean_obj_1 = new Boolean(true);
        Boolean boolean_obj_2 = new Boolean(false);
        // as strings are themselves objects of String class so no need to convert them
        String str1 = new String("Madhur Gupta");
        String str2 = new String("Batman");

        // adding objects to list 1 ( add(), addToFront() and addToRear() )
        list1.addToFront(int_obj_1);
        list1.addToRear(int_obj_2);
        list1.add(2,float_obj_1);
        list1.add(1,char_obj_1);
        list1.add(3,char_obj_2);
        list1.add(1,boolean_obj_1);
        list1.add(2,str1);

        // adding objects to list 2 ( add(), addToFront() and addToRear() )
        list2.addToFront(int_obj_1);
        list2.addToRear(int_obj_2);
        list2.addToRear(int_obj_2);
        list2.addToRear(str1);
        list2.add(2,float_obj_1);
        list2.add(2,float_obj_2);
        list2.add(3,float_obj_1);
        list2.add(1,char_obj_1);
        list2.add(3,char_obj_2);
        list2.add(1,boolean_obj_2);
        list2.add(2,str2);

        // checking whether list1 and list2 are empty or not ( isEmpty() )
        System.out.println("\nList1 (true = empty and false = non-empty) : "+list1.isEmpty());
        System.out.println("List2 (true = empty and false = non-empty) : "+list2.isEmpty());

        // printing the sizes of list1 and list2 ( size() )
        System.out.println("\nSize of list1 is : "+list1.size());
        System.out.println("Size of list2 is : "+list2.size());

        // Note - The checkIndex() is of return type void, and according to its code if if executes
        // succesfully then it won't show/print anything.
        list1.checkIndex(3);
        list1.checkIndex(4);
        list2.checkIndex(7);
        list2.checkIndex(9);

        // getting an element corresponding to an index from our list ( get() )
        System.out.println("\nElement at index 4 in list1 is : "+list1.get(4));
        System.out.println("Element at index 2 in list2 is : "+list2.get(2));

        // getting index corresponding to an element from our list ( indexOf() )
        // indexOf() method returns index corresponding to 1st occurence of an element
        // and returns -1 if element is not found in the list
        System.out.println("\nIndex of 'm' in list1 is : "+list1.indexOf(new Character('m')));
        System.out.println("Index of 1.9 in list2 is : "+list2.indexOf(new Float(1.9)));

        // converting our lists to String ( convToString() )
        System.out.println("\nList1 is - \n"+list1.convToString());
        System.out.println("\nList2 is - \n"+list2.convToString());

        // removing elements from our lists ( remove(), removeFront() and removeRear() )
        list1.remove(3);
        list1.removeFront();
        list1.removeRear();
        list2.remove(2);
        list2.remove(5);
        list2.remove(7);
        list2.removeFront();
        list2.removeRear();
        System.out.println("\nList1 after removing certain elements is - \n"+list1.convToString());
        System.out.println("\nList2 after removing certain elements is - \n"+list2.convToString());

    }
}
