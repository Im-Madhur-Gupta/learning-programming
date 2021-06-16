import java.util.NoSuchElementException;

class QueueAL<E> implements Queue<E>{ // Queue<E> interface is in queue linked list.
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

class Driver2{
    public static void main(String[] args) {
        QueueAL queue1 = new QueueAL(5);
        Employee emp1 = new Employee("madhur","gupta",1);
        Employee emp2 = new Employee("jay","gupta",2);
        Employee emp3 = new Employee("mamta","gupta",3);
        Employee emp4 = new Employee("shishir","gupta",4);
        queue1.enqueue(emp1);
        queue1.enqueue(emp2);
        queue1.enqueue(emp3);
        queue1.enqueue(emp4);
        System.out.println(queue1.display());

        queue1.dequeue();
        queue1.dequeue();
        System.out.println(queue1.display());

        System.out.println(queue1.getFrontElement());
        System.out.println(queue1.display());

        queue1.enqueue(emp1);
        queue1.enqueue(emp2);
        System.out.println(queue1.display());

        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        System.out.println(queue1.display());

        queue1.enqueue(emp3);
        System.out.println(queue1.display());
    }
}
