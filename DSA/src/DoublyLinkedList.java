class DLLNode{
    Object data;
    DLLNode next;
    DLLNode prev;

    public DLLNode(){}

    public DLLNode(Object element){
        this.data=element;
    }

    public DLLNode(Object element, DLLNode addrs_prev, DLLNode addrs_next){
        this.data=element;
        this.next=addrs_next;
        this.prev=addrs_prev;
    }
}

public class DoublyLinkedList<E>{
    protected DLLNode head;
    protected DLLNode tail;
    protected int size;

    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    // methods

    // Following method adds a node to the LinkedList
    public void add(int index,E element_data) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Either index is negative or index is greater than size.");
        }

        DLLNode newNode = new DLLNode(element_data);
        if (index == 0 && size!=0) {
//            newNode.prev = null; naye bane node ki .prev pehle se hi null hogi
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else if(index==(size-1) && size!=0){
//            newNode.next = null; naye bane node ki .next pehle se hi null hogi
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        else if (index == 0 && size==0){
//            newNode.prev = null; naye bane node ki .prev pehle se hi null hogi
//            newNode.next = null; naye bane node ki .next pehle se hi null hogi
            head = newNode;
            tail = newNode;
        }
        else {
            DLLNode priortoindexNode = moveToIndex(index-1);
            DLLNode indexNode = priortoindexNode.next;
            newNode.next = priortoindexNode.next;
            newNode.prev = indexNode.prev;
            priortoindexNode.next = newNode;
            indexNode.prev = newNode;
        }
        size++;
    }
    public void addToFront(E element_data){ add(0,element_data); }
    public void addToRear(E element_data){ add(size,element_data); }


    public DLLNode moveToIndex(int index){
        DLLNode currentNode;
        if(index<(size/2))
        {
            currentNode = head;
            for (int i = 1; i <=index; i++)
            {
                currentNode = currentNode.next;
            }
        }
        else{
            currentNode = tail;
            for (int i = 1; i <=(size-index); i++)
            {
                currentNode = currentNode.prev;
            }
        }
        return currentNode;
    }


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
        DLLNode currentNode = moveToIndex(index);
        return currentNode.data;
    }

    // Following method returns index corresponding to a node
    public int indexOf(E element_data) {
        int index=0;
        DLLNode currentNode = head;
        for(int i=0;i<size;i++)
        {
            if(currentNode.data.equals(element_data)){
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1; // element_data not found
    }

    // Following method removes a node from the LinkedList
    public E remove(int index){
        checkIndex(index);
        E removedNode;
        if (index == 0 && size!=1) {
            removedNode = (E) head.data;
            head.next.prev = null;
            head = head.next;
//            alt version easier -
//            DLLNode index1Node = moveToIndex(1);
//            index1Node.prev = null;
//            head = index1Node;
        }
        else if(index == (size-1) && size!=1){
            removedNode = (E) tail.data;
            tail.prev.next = null;
            tail = tail.prev;
//            alt version easier -
//            DLLNode indexsecondlastNode = moveToIndex(size-2);
//            indexsecondlastNode.next = null;
//            tail = indexsecondlastNode;
        }
        else if(index==0 && size==1){
            removedNode = (E) tail.data;
            head=null;
            tail=null;
        }
        else {
            DLLNode indexNode = moveToIndex(index);
            removedNode = (E) indexNode.data;
            indexNode.prev.next =  indexNode.next;
            indexNode.next.prev = indexNode.prev;
        }
        size--;
        return removedNode;
    }

    // Following converts our LinkedList's data to a string
    public String toString(){
        DLLNode currentNode = head;
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

class Testing {
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