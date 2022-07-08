import java.util.LinkedList;
import java.util.Queue;

class MainStQ {
    public static void main(String[] args) {
        StackQ myStack = new StackQ();
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.push(1));
        System.out.println(myStack.push(2));
        System.out.println(myStack.push(3));
        System.out.println(myStack.push(4));
        System.out.println(myStack.push(5));
        System.out.println(myStack.push(6));
        System.out.println(myStack.pop());
        System.out.println(myStack.push(6));
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}

// Integer Stack using Queue
// During push operation of stack -
// 1. enqueue the new element
// 2. dequeue an element and enqueue it
// 3. repeat step 2 for all elements other than the new element
// For circular queue and queue backed by doubly LL, enqueue & dequeue is O(1). So, above push operation becomes O(n).
// LinkedList of JDK is actually a Doubly Linked List. 
public class StackQ {
    Queue<Integer> stackQ;

    // constructor
    public StackQ() {
        this.stackQ = new LinkedList<Integer>();
    }

    public boolean isEmpty() {
        return this.stackQ.size() == 0;
    }

    public boolean push(int newElement) {
        this.stackQ.add(newElement);
        for (int i = 0; i < this.stackQ.size() - 1; i++) {
            this.stackQ.add(this.stackQ.remove());
        }
        return true;
    }

    public int pop() {
        if (this.isEmpty()) {
            // stack is empty
            return Integer.MIN_VALUE;
        }
        return this.stackQ.remove();
    }

    public int peek() {
        if (this.isEmpty()) {
            // stack is empty
            return Integer.MIN_VALUE;
        }
        return this.stackQ.element();
    }
}