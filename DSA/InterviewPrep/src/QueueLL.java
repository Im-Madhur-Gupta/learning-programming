class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// Integer Queue Using LL
// Yaha pe bhi 3 implementations ho sakti he -
// 1. Modified Singly LL -> should have pointers for head and tail.
// 2. Doubly LL
// 3. Circular Singly LL (not required, 1. is better & easier)

// Note -
// 1. All of the above 3 implementations will give O(1) TC for enqueue and dequeue operations.
// 2. As the queue is backed by LL, size is dynamic, resizing is O(1).
// 3. Circular Singly LL implementation is not required here as space is not getting wasted,
//    Its required only when backed by array.
// 4. Backing by LL will need more space as pointers are involved.

// Following is the implementation using a modified singly linked list
public class QueueLL {
    private Node front; // head of LL
    private Node rear; // tail of LL
    int size;

    public QueueLL() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean enqueue(int newElement) {
        Node newNode = new Node(newElement);

        if (this.isEmpty()) { // IMPORTANT
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }

        this.size++;
        return true;
    }

    public int dequeue() {
        if (this.isEmpty()) return Integer.MIN_VALUE;

        int frontVal = this.front.val;

        if (this.size == 1) { // IMPORTANT
            this.front = this.rear = null;
        } else {
            this.front = this.front.next;
        }

        this.size--;
        return frontVal;
    }

    public int getFront() {
        if (this.isEmpty()) return Integer.MIN_VALUE;
        return this.front.val;
    }

    public int getRear() {
        if (this.isEmpty()) return Integer.MIN_VALUE;
        return this.rear.val;
    }
}

class MainQueueLL {
    public static void main(String args[]) {
        QueueLL myQueue = new QueueLL();
        System.out.println(myQueue.isEmpty());
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
        System.out.println(myQueue.dequeue());
    }
}
