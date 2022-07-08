// Integer Queue using Array
// 1. Simple Implementation - Simply 2 pointer rakho for front and rear, once rear hits last index means
// we have filled the queue. Poor space management, bcz queue ke samne space ho sakti he phir bhi full bol rahe.
// 2. Circular Queue - rear gol ghumke agge wapis aa sakta to utilize tha unoccupied space at front of array.

// Note -
// 1. Queue and Circular Queue both follow FIFO. Dequeue (Doubly Ended Queue) jismai front, rear dono ends pai
// element add/remove kar sakte, may not follow FIFO.
// 2. Time Complexity for both enqueue and dequeue is O(1) for both the implementations,
//    assuming that resizing is not required, as this is an array then resizng will cost O(n).
// 3. Backing by array (circular) makes it momory efficient as pointers arent involved.
public class QueueArr {
    private int queueArr[];
    int size;
    private int front; // points at the current front element
    private int rear; // points at the current rear element

    // constructor
    public QueueArr(int capacity){
        this.queueArr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public int getCapacity(){
        return this.queueArr.length;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public boolean isFull(){
        return this.size==this.getCapacity();
    }

    public boolean enqueue(int newElement){
        if(this.isFull()) return false;

        if(this.rear==this.getCapacity()-1){ // wrapping
            this.rear = -1;
        }

        this.queueArr[++this.rear] = newElement;

        // IMPORTANT
        // if we add an element to an empty queue then both front and rear need to increment
        if(this.size==0) this.front = 0;

        this.size++;

        return true;
    }

    public int dequeue(){
        if(this.isEmpty()) return Integer.MIN_VALUE;

        int frontElement = this.queueArr[this.front++];

        if(this.front==this.getCapacity()){ // wrapping
            this.front=0;
        }

        // IMPORTANT
        // if we remove an element from a queue containing only 1 element then both front and rear need to decrement
        if(this.size==1){
            this.front = -1;
            this.rear = -1;
        }

        this.size--;

        return frontElement;
    }

    public int front(){
        return this.queueArr[this.front];
    }

    public int rear(){
        return this.queueArr[this.rear];
    }
}

class MainQueueArr{
    public static void main(String args[]){
        QueueArr myQueue = new QueueArr(5);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.enqueue(1));
        System.out.println(myQueue.enqueue(2));
        System.out.println(myQueue.enqueue(3));
        System.out.println(myQueue.enqueue(4));
        System.out.println(myQueue.enqueue(5));
        System.out.println(myQueue.enqueue(6));
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.enqueue(6));
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}