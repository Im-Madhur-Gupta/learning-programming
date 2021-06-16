import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front; // this front points to the front element of the queue
    private int right_of_back; // this parameter points to the next available index in queue ie back+1 = back ke thik right wali.
    // Note - no. of elements in the queue is (right_of_back-front).
    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }
    public ArrayQueue(){
        queue = new Employee[10];
    }

    public int size(){return right_of_back-front;}
    public void enqueue(Employee temp_emp){
        if(queue.length == right_of_back){
            // The memory management is poor here, as the end of the array may have no place but the front part
            // of the array can have unused space, consider case - queue capacity = 5, u enqueue 5 elements and
            // then dequeue 4 of them now acc. to this condition more space is required but actually the front 4 positions
            // of the queue are empty and are getting wasted.
            Employee[] temparr = new Employee[2*queue.length];
            System.arraycopy(queue,0,temparr,0,queue.length);
            queue = temparr;
        }
        queue[right_of_back++] = temp_emp;
    }
    public Employee dequeue(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        Employee dequeued = queue[front];
        queue[front++] = null;
        if(size()==0){
            front=0;
            right_of_back=0;
        }
        return dequeued;
    }
    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }
    public void printQueue(){
        StringBuffer temp_strbuf = new StringBuffer("(Front) ");
        for(int i=front;i<right_of_back;i++){
            temp_strbuf.append(queue[i]+" - ");
        }
        if(size()>0){
            temp_strbuf.delete(temp_strbuf.length()-2,temp_strbuf.length());
        }
        temp_strbuf.append("(Back)");
        System.out.println(new String(temp_strbuf));
    }
}
// IMP - This queue implementation isnt memory efficient, Go to enque method.
class Driver1{
    public static void main(String[] args) {
        ArrayQueue queue1 = new ArrayQueue(4);
        Employee emp1 = new Employee("madhur","gupta",1);
        Employee emp2 = new Employee("jay","gupta",2);
        Employee emp3 = new Employee("mamta","gupta",3);
        Employee emp4 = new Employee("shishir","gupta",4);
        queue1.enqueue(emp1);
        queue1.enqueue(emp2);
        queue1.enqueue(emp3);
        queue1.enqueue(emp4);
        queue1.printQueue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.enqueue(emp1);
        queue1.printQueue();
        System.out.println(queue1.peek());
        queue1.printQueue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.printQueue();
        queue1.enqueue(emp3);
        queue1.printQueue();
    }
}