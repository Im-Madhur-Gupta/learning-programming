import java.util.*;

class ArrayListS{
    protected Object element[];
    protected int size=0;

    public ArrayListS(){
        element = new Object[10];
    }
    public ArrayListS(int initialCapacity){
        if(initialCapacity<1){
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        element = new Object[initialCapacity];
    }

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

class NodeS{
    Object data;
    Node next;

    public NodeS(){
    }
    public NodeS(Object element){
        this.data=element;
    }
    public NodeS(Object element, Node addrs){
        this.data=element;
        this.next=addrs;
    }
}

class LinkedListS<E>{
    protected Node firstNode;
    protected int size;

    public LinkedListS(){
        firstNode = null;
        size = 0;
    }

    public void add(int index,E element_data) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Either index is negative or index is greater than size.");
        }
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

    public void checkIndex(int index){
        if(index<0 || index>(size-1)){
            throw new IndexOutOfBoundsException("Either index is negative or index is greater than (size-1).");
        }
    }

    public Object get(int index){
        checkIndex(index);
        Node currentNode = firstNode;
        for(int i=1;i<=index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public int indexOf(E element_data) {
        int index=0;
        Node currentNode = firstNode;
        while(currentNode!=null){
            if(currentNode.data.equals(element_data)){
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

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

class StackAL<E> extends ArrayListS{
    public StackAL(){
        super();
    }
    public StackAL(int initial_capacity){
        super(initial_capacity);
    }

    public boolean empty(){
        return isEmpty();
    }
    public E peek(){
        if(empty()){
            throw new EmptyStackException();
        }
        return (E) super.get(size()-1);
    }
    public void push(E obj_temp){
        super.add(size(),obj_temp);
    }
    public E pop(){
        if (empty()) {
            throw new EmptyStackException();
        }
        return (E) super.remove(size() - 1);
    }
    public void display(){
        StringBuffer temp_str = new StringBuffer("\nTop --> [");
        for(int i=this.size()-1;i>=0;i--){
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
        System.out.println(new String(temp_str));
    }
    public int getSize(){
        return this.size();
    }
    public int search(E search_element){
        int temp_index = this.indexOf(search_element);
        if(temp_index==-1){
            return -1;
        }
        return (this.size() - temp_index - 1);
    }
    @Override
    public void add(int index, Object the_element){
        throw new UnsupportedOperationException();
    }
    @Override
    public Object get(int index){
        throw new UnsupportedOperationException();
    }
    @Override
    public Object remove(int index){
        throw new UnsupportedOperationException();
    }
}

class StackLL<E> extends LinkedListS{
    public StackLL(){
        super();
    }

    public boolean empty(){
        return isEmpty();
    }
    public E peek(){
        if(empty()){
            throw new EmptyStackException();
        }
        return (E) super.get(0);
    }
    public void push(E obj_temp){
        super.add(0,obj_temp);
    }
    public E pop(){
        if (empty()) {
            throw new EmptyStackException();
        }
        return (E) super.remove(0);
    }
    public void display(){
        System.out.println("\nTop --> " + this);
    }
    public int getSize(){
        return this.size();
    }
    public int search(E search_element){
        return this.indexOf(search_element);
    }
    @Override
    public void add(int index, Object the_element){
        throw new UnsupportedOperationException();
    }
    @Override
    public Object get(int index){
        throw new UnsupportedOperationException();
    }
    @Override
    public Object remove(int index){
        throw new UnsupportedOperationException();
    }
}

class Driver{
    public static void main(String[] args) {
        StackAL<Character> stack_array_list = new StackAL<>(20);
        StackLL<Integer> stack_linked_list = new StackLL<>();

        stack_array_list.push('R');
        stack_array_list.push('U');
        stack_array_list.push('H');
        stack_array_list.push('D');
        stack_array_list.push('A');
        stack_array_list.push('M');

        stack_linked_list.push(2);
        stack_linked_list.push(1);
        stack_linked_list.push(1);
        stack_linked_list.push(1);
        stack_linked_list.push(5);
        stack_linked_list.push(0);
        stack_linked_list.push(2);
        stack_linked_list.push(0);
        stack_linked_list.push(2);

        System.out.println("Is the stack_array_list empty - "+stack_array_list.empty());
        System.out.println("Is the stack_linked_list empty - "+stack_linked_list.empty());

        System.out.println("\nElement at the top of stack_array_list - "+stack_array_list.peek());
        System.out.println("Element at the top of stack_linked_list - "+stack_linked_list.peek());

        stack_array_list.display();
        stack_linked_list.display();

        System.out.println("\nNumber of elements in stack_array_list - "+stack_array_list.getSize());
        System.out.println("\nNumber of elements in stack_linked_list - "+stack_linked_list.getSize());

        // search() returns -1 if element not found
        System.out.println("\nIndex of 'M' in stack_array_list from Top(0) is : "+stack_array_list.search('M'));
        System.out.println("Index of 9 in stack_linked_list from Top(0) is : "+stack_linked_list.search(9));

        System.out.println("\nPoping the elements of stack_array_list - ");
        while(!(stack_array_list.empty())){
            System.out.println(stack_array_list.pop());
        }
        System.out.println("\nPoping the elements of stack_linked_list - ");
        while(!(stack_linked_list.empty())){
            System.out.println(stack_linked_list.pop());
        }
        System.out.println("Is the stack_array_list empty - "+stack_array_list.empty());
        System.out.println("Is the stack_linked_list empty - "+stack_linked_list.empty());
    }
}