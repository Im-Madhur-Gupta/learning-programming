import java.util.LinkedList;

class MainStLL
{
    public static void main(String[] args) {
        StackLL myStack = new StackLL();
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
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}

// Integer Stack using Linked List
// Advantage - Dynamic in size, resizing is an O(1) operation
// Disadvantages - Uses more memory as pointers arent involved.
public class StackLL{
    LinkedList<Integer> stackLL;
    // Remember - Inserting, removing at head on LL is O(1) operation.

    // constructor
    public StackLL(){
        this.stackLL = new LinkedList<Integer>();
    }

    public boolean isEmpty(){
        return this.stackLL.size() == 0;
    }

    public boolean push(int newElement){
        this.stackLL.add(0, newElement);
        return true;
    }

    public int pop(){
        if(this.isEmpty()){
            // stack is empty
            return Integer.MIN_VALUE;
        }
        return this.stackLL.remove(0);
    }

    public int peek(){
        if(this.isEmpty()){
            // stack is empty
            return Integer.MIN_VALUE;
        }
        return this.stackLL.get(0);
    }
}