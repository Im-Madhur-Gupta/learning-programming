class Node{
    Object data;
    Node next;

    // Constructors
    public Node(){
        // both data and next field are left as default ie. null.
    }

    public Node(Object element){
        this.data=element;
    }

    public Node(Object element, Node addrs){
        this.data=element;
        this.next=addrs;
    }
}

public class LinkedList<E>{
    // This E is the type parameter of the Linked List matlab iske implementtion me mai jaha bhi iske andar ke data
    // ki baat karunga to wo E type ka hoga.
    protected Node firstNode;
    protected int size;

    // constructor
    public LinkedList(){
        firstNode = null;
        size = 0;
    }

    // methods

    // Following method adds a node to the LinkedList
    public void add(int index,E element_data) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Either index is negative or index is greater than size.");
        }
        // For the following the lecture slides contained a single step but I have divided it into 3 steps for simplicity
        Node newNode = new Node(element_data);
        if (index == 0) {
            newNode.next = firstNode;
            firstNode = newNode;
        }
        else {
            Node previousNode = firstNode;
            for (int i = 1; i <= (index - 1); i++) {
                previousNode = previousNode.next;
            }
            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
        size++;
    }
    public void addToFront(E element_data){ add(0,element_data); }
    public void addToRear(E element_data){ add(size,element_data); }

    public boolean isEmpty(){return size==0;}

    public int size(){return size;}

    // Following method checks whether index is valid or not
    public void checkIndex(int index){
        if(index<0 || index>(size-1)){
            throw new IndexOutOfBoundsException("Either index is negative or index is greater than (size-1).");
        }
    }

    // Following method returns the data stored in a node corresponding to an index
    public Object get(int index){
        checkIndex(index);
        Node currentNode = firstNode;
        for(int i=1;i<=index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    // Following method returns index corresponding to a node
    public int indexOf(E element_data) {
        int index=0;
        Node currentNode = firstNode;
        while(currentNode!=null){
            if(currentNode.data.equals(element_data)){
                return index; // returning the index of the found node
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1; // element_data not found
    }

    // Following method removes a node from the LinkedList
    public E remove(int index){
        checkIndex(index);
        E removedNode;
        if (index == 0) {
            removedNode = (E) firstNode.data;
            firstNode = firstNode.next;
        }
        else {
            Node previousNode = firstNode;
            for (int i = 1; i <= (index - 1); i++) {
                previousNode = previousNode.next;
            }
            removedNode = (E) previousNode.next.data;
            previousNode.next = previousNode.next.next;
        }
        size--;
        return removedNode;
    }

    // Following converts our LinkedList's data to a string
    public String toString(){
        Node currentNode = firstNode;
        // string to be returned
        StringBuffer str = new StringBuffer("[");
        while(currentNode!=null){
            if(currentNode.data==null) {
                str.append("null, ");
            }
            else{
                str.append(currentNode.data.toString()+", ");
            }
            currentNode = currentNode.next;
        }
        if(size>0){
            str.delete(str.length()-2,str.length());
        }
        str.append("]");
        return new String(str);

    }

}

class ApplicationClass {
    public static void main(String[] args) {
        LinkedList<Character> linked_list_char = new LinkedList<Character>();

        // using add() methods
        linked_list_char.addToFront('M');
        linked_list_char.add(1, 'A');
        linked_list_char.add(2, 'D');
        linked_list_char.add(3, 'H');
        linked_list_char.add(4, 'U');
        linked_list_char.addToRear('R');

        // checking whether linked_list_char is empty or not ( isEmpty() )
        System.out.println("\nlinked_list_char (true = empty and false = non-empty) : "+linked_list_char.isEmpty());

        // printing the size of linked_list_char ( size() )
        System.out.println("\nSize of linked_list_char is : "+linked_list_char.size());

        // Note - The checkIndex() is of return type void
        // according to its code if it executes succesfully then it won't show/print anything.
        linked_list_char.checkIndex(3);
        linked_list_char.checkIndex(2);

        // getting an element corresponding to an index from our list ( get() )
        System.out.println("\nElement at index 4 in linked_list_char is : "+linked_list_char.get(4));

        // getting index corresponding to an element from our list ( indexOf() )
        // indexOf() method returns index corresponding to 1st occurence of an element
        // and returns -1 if element is not found in the list
        System.out.println("\nIndex of 'M' in linked_list_char is : "+linked_list_char.indexOf('M'));

        // printing the LinkedList's data using toString() method
        // we dont have to specify it rather it will get automatically called.
        System.out.println("\nList is : "+linked_list_char);

        // using remove() methods
        char a = linked_list_char.remove(3);
        char b = linked_list_char.remove(3);
        char c = linked_list_char.remove(3);
        System.out.printf("\nRemoved elements from the list are : %c, %c and %c.\n",a,b,c);
        System.out.println("\nList after removal of elements is : "+linked_list_char);
    }
}