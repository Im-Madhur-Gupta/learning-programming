import java.util.EmptyStackException;

public class StackArray {
    private Employee[] stackArr;
    private int top;

    public StackArray(){
        this.stackArr = new Employee[10];
        this.top=-1;
    }
    public StackArray(int size){
        if(size<=0){
            throw new IllegalArgumentException();
        }
        this.stackArr = new Employee[size];
        this.top=-1;
    }

    public boolean isEmpty(){return top==-1;}
    public int size(){return top+1;}
    public void push(Employee toPush){
        if(top+1==stackArr.length){
            Employee[] temp_array = new Employee[2* stackArr.length];
            System.arraycopy(stackArr,0,temp_array,0,stackArr.length);
            stackArr = temp_array;
        }
        stackArr[++top] = toPush;
    }
    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee poped = stackArr[top];
        stackArr[top--] = null;
        return poped;
    }
    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stackArr[top];
    }
    public void printStack(){
        int temp_top = top;
        System.out.println("(Top)");
        while(temp_top!=-1){
            System.out.println(stackArr[temp_top--]);
        }
    }
}

class Driver{
    public static void main(String[] args) {
        StackArray stack1 = new StackArray(5);
        stack1.push(new Employee("Madhur","Gupta",123));
        stack1.push(new Employee("Madhur1","Gupta",1223));
        stack1.push(new Employee("Madhur2","Gupta",1213));
        stack1.printStack();
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
    }
}