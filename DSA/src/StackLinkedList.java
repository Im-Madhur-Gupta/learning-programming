import java.util.EmptyStackException;

public class StackLinkedList {

    private class NodeStack{
        Employee data;
        NodeStack next;
        public NodeStack() {
            this.data = null;
            this.next = null;
        }
    }

    NodeStack top;

    public void push(Employee temp_emp){
        NodeStack temp_node = new NodeStack();
        temp_node.data = temp_emp;
        temp_node.next = top;
        top = temp_node;
    }
    public Employee pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        else{
            Employee rem_node = top.data;
            top = top.next;
            return rem_node;
        }
    }
    public Employee peek(){
        if(top==null){
            throw new EmptyStackException();
        }
        else{
            return top.data;
        }
    }
    public void display(){
        System.out.println("(Top)");
        NodeStack temp_top = top;
        while(temp_top!=null){
            System.out.println(temp_top.data);
            temp_top = temp_top.next;
        }
    }
}

class Application{
    public static void main(String[] args) {
        StackLinkedList stack1 = new StackLinkedList();
        stack1.push(new Employee("Madhur","Gupta",123));
        stack1.push(new Employee("Madhur1","Gupta",1223));
        stack1.push(new Employee("Madhur2","Gupta",1213));
        stack1.display();
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
    }
}
