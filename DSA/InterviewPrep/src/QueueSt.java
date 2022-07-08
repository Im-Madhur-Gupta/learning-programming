import java.util.Stack;

class MainQueueSt{
    public static void main(String args[]){
        QueueSt myQueue = new QueueSt();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.enqueue(1));
        System.out.println(myQueue.enqueue(2));
        System.out.println(myQueue.enqueue(3));
        System.out.println(myQueue.enqueue(4));
        System.out.println(myQueue.enqueue(5));
        System.out.println(myQueue.enqueue(6));
        System.out.println(myQueue.getFront());
        System.out.println(myQueue.getRear());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.enqueue(7));
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}

// Integer Queue using 2 Stacks
// We will use 2 stacks - enqueueStack, dequeueStack.
// enqueue -> simply, push the element to the enqueueStack. -> O(1)
// dequeue -> is dequeueStack is not empty then return its pop its top element and return it
//            otherwise, pop all elements from enqueue stack 1 by 1 and push to dequeue stack,
//            now the top element of dequeue stack is the element that has to be dequeued. -> O(n)
public class QueueSt{
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public QueueSt(){
        this.enqueueStack = new Stack<Integer>();
        this.dequeueStack = new Stack<Integer>();
    }

    public boolean isEmpty(){
        return (this.enqueueStack.size()+this.dequeueStack.size())==0;
    }

    // O(1)
    public boolean enqueue(int newElement){
        this.enqueueStack.push(newElement);
        return true;
    }

    // O(n)
    public int dequeue(){
        if(this.isEmpty()) return Integer.MIN_VALUE;

        if(this.dequeueStack.size()>0) return this.dequeueStack.pop();

        while(this.enqueueStack.size()>1){
            this.dequeueStack.push(this.enqueueStack.pop());
        }
        return this.enqueueStack.pop();
    }

    public int getFront(){
        if(this.isEmpty()) return Integer.MIN_VALUE;

        if(this.dequeueStack.size()>0) return this.dequeueStack.pop();

        while(this.enqueueStack.size()>0){
            this.dequeueStack.push(this.enqueueStack.pop());
        }
        return this.dequeueStack.peek();
    }

    public int getRear(){
        if(this.isEmpty()) return Integer.MIN_VALUE;
        if(this.enqueueStack.size()>0) return this.enqueueStack.peek();

        while(this.dequeueStack.size()>0){
            this.enqueueStack.push(this.dequeueStack.pop());
        }
        return this.enqueueStack.peek();
    }
}