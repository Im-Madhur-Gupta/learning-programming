class MainStAr
{
    public static void main(String[] args) {
        StackArray myStack = new StackArray(5);
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

// Integer Stack using Array
// Advantage - Uses less memory as pointers aren't involved.
// Disadvantages - Not dynamic, resizing is O(n) operation.
public class StackArray{
    private int stackArr[];
    int top; // index of the top most element of the stack

    // constructor
    public StackArray(int capacity){
        this.stackArr = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty(){
        return this.stackArr.length == 0;
    }

    public boolean push(int newElement){
        if(this.top==this.stackArr.length-1){
            // stack is already full
            return false;
        }
        this.stackArr[++this.top] = newElement;
        return true;
    }

    public int pop(){
        if(this.top==-1){
            // stack is empty
            return Integer.MIN_VALUE;
        }
        return this.stackArr[this.top--];
    }

    public int peek(){
        if(this.top==-1){
            // stack is empty
            return Integer.MIN_VALUE;
        }
        return this.stackArr[this.top];
    }
}