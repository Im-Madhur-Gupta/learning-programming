import java.util.NoSuchElementException;

public interface Queue<E>{
    public boolean isEmpty();
    public E getFrontElement();
    public E getRearElement();
    public void enqueue(E theElement);
    public E dequeue();
    public String display();
    public int getSize();
    public int search(E theElement);
}

class QueueAL<E> implements Queue<E>{
    private Object[] queue;
    private int front; // this front points to the front element of the queue
    private int right_of_rear; // right_of_rear parameter points to the next available index in queue ie rear+1.
    private int size=0;

    public QueueAL(int capacity){ queue = new Object[capacity]; }
    public QueueAL(){queue = new Object[10];}

    public int getSize(){return size;}

    public boolean isEmpty(){return getSize()==0;}

    public void enqueue(E temp_emp){
        // increasing size if required -
        if(getSize() == queue.length) {
            System.out.println("Queue size exceeded, doubling the array size.");
            Object[] temp_arr = new Object[2 * queue.length];
            System.arraycopy(queue, front, temp_arr, 0, queue.length-front);
            if(front!=0){
                System.arraycopy(queue, 0, temp_arr, queue.length-front, front);
                front=0;
                right_of_rear = queue.length;
            }
            queue = temp_arr;
        }
        // adding element -
        if(front!=0 && queue.length==right_of_rear){
            right_of_rear=0;
        }
        queue[right_of_rear++] = temp_emp;
        size++;
    }

    public E dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        E dequeued = (E) queue[front];
        queue[front] = null;
        if(front==queue.length-1){
            front=0;
        }
        else{
            front++;
        }
        if(front==right_of_rear) {
            front = 0;
            right_of_rear = 0;
        }
        size--;
        return dequeued;
    }

    public E getFrontElement(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return (E) queue[front];
    }

    public E getRearElement(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return (E) queue[right_of_rear-1];
    }

    public int search(E theElement){
        if(front!=0){
            Object[] temp_arr = new Object[queue.length];
            System.arraycopy(queue, front, temp_arr, 0, queue.length-front);
            System.arraycopy(queue, 0, temp_arr, queue.length-front, front);
            front=0;
            right_of_rear = queue.length;
            queue = temp_arr;
        }
        for(int i=0;i<getSize();i++){
            if(queue[i].equals(theElement)){
                return i;
            }
        }
        return -1;
    }

    public String display(){
        StringBuffer temp_strbuf = new StringBuffer("(Front) ");

        for(int i=front;i<queue.length;i++){
            if(queue[i]==null){
                continue;
            }
            temp_strbuf.append(queue[i]+" - ");
        }
        if(front>=right_of_rear){
            for(int i=0;i<right_of_rear;i++){
                if(queue[i]==null){
                    continue;
                }
                temp_strbuf.append(queue[i]+" - ");
            }
        }

        if(getSize()>0){
            temp_strbuf.delete(temp_strbuf.length()-2,temp_strbuf.length());
        }
        temp_strbuf.append("(Rear)");
        return new String(temp_strbuf);
    }
}

class QueueLL<E> implements Queue<E>{
    private class NodeQueueLL{
        E data;
        NodeQueueLL next;
        public NodeQueueLL() {
            this.data = null;
            this.next = null;
        }
        public NodeQueueLL(E theData) {
            this.data = theData;
            this.next = null;
        }
    }
    private NodeQueueLL front;
    private NodeQueueLL rear;
    private int size=0;
    public QueueLL(){
        this.front=null;
        this.rear=null;
    }

    public int getSize(){return size;}

    public boolean isEmpty(){return getSize()==0;}

    public E getFrontElement(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public E getRearElement(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return rear.data;
    }

    public void enqueue(E theElement){
        NodeQueueLL newNode = new NodeQueueLL(theElement);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public E dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        E dequeued = front.data;
        front = front.next;
        size--;
        return dequeued;
    }

    public String display(){
        NodeQueueLL currentNode = front;
        StringBuffer str = new StringBuffer("(Front) ");
        while(currentNode!=null){
            if(currentNode.data==null) {
                str.append("null, ");
            }
            else{
                str.append(currentNode.data.toString()+" - ");
            }
            currentNode = currentNode.next;
        }
        if(size>0){
            str.delete(str.length()-2,str.length());
        }
        str.append("(Rear)");
        return new String(str);
    }

    public int search(E theElement){
        int index=0;
        NodeQueueLL currentNode = front;
        while(currentNode!=null){
            if(currentNode.data.equals(theElement)){
                return index; // returning the index of the found node
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1; // element_data not found
    }
}

class Driver1{
    public static void main(String[] args) {
        QueueAL<Character> queue1 = new QueueAL<>(7);
        queue1.enqueue('M');
        queue1.enqueue('A');
        queue1.enqueue('D');
        queue1.enqueue('H');
        queue1.enqueue('U');
        queue1.enqueue('R');

        QueueLL<Integer> queue2 = new QueueLL<>();
        queue2.enqueue(2);
        queue2.enqueue(0);
        queue2.enqueue(2);
        queue2.enqueue(0);
        queue2.enqueue(5);
        queue2.enqueue(1);
        queue2.enqueue(1);
        queue2.enqueue(1);
        queue2.enqueue(2);

        System.out.println("\nqueue1 is -\n"+queue1.display());
        System.out.println("\nqueue2 is -\n"+queue2.display());

        System.out.println("\nIs queue1 empty - "+queue1.isEmpty());
        System.out.println("Is queue2 empty - "+queue2.isEmpty());

        System.out.println("\nSize of queue1 is - "+queue1.getSize());
        System.out.println("Size of queue2 is - "+queue2.getSize());

        System.out.println("\nElement at front of queue1 is - "+queue1.getFrontElement());
        System.out.println("Element at rear of queue1 is - "+queue1.getRearElement());
        System.out.println("\nElement at front of queue2 is - "+queue2.getFrontElement());
        System.out.println("Element at rear of queue2 is - "+queue2.getRearElement());

        System.out.println("\nIndex of 'C' from front(0) in queue1 is - "+queue1.search('C'));
        System.out.println("Index of 'M' from front(0) in queue1 is - "+queue1.search('M'));
        System.out.println("\nIndex of 1 from front(0) in queue2 is - "+queue2.search(1));
        System.out.println("Index of 7 from front(0) in queue2 is - "+queue2.search(7));

        System.out.println("\nDequeued element from queue1 - "+queue1.dequeue());
        System.out.println("Dequeued element from queue1 - "+queue1.dequeue());
        System.out.println("\nDequeued element from queue2 - "+queue2.dequeue());
        System.out.println("Dequeued element from queue2 - "+queue2.dequeue());

        System.out.println("\nAfter dequeing queue1 is -\n"+queue1.display());
        System.out.println("\nAfter dequeing queue2 is -\n"+queue2.display());
    }
}
