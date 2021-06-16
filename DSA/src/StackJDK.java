import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackJDK {
    public static void main(String[] args) {
        // For stack in jdk we use the Deque interface, rather than using the legacy Stack class itself.
        // stack backed by array -
        Deque<Character> stackarr = new ArrayDeque<Character>();
        // stack backed by linked list
        Deque<Character> stackll = new LinkedList<Character>();

//    Stack Method      Equivalent Deque Method
//    push(e)	        addFirst(e)
//    pop()	            removeFirst()
//    peek()	        getFirst()

        stackarr.addFirst('s');
        stackarr.addFirst('a');

        stackll.addFirst('x');
        stackll.addFirst('z');

        System.out.println(stackarr.removeFirst());
        System.out.println(stackll.removeFirst());

        System.out.println(stackarr.getFirst());
        System.out.println(stackll.getFirst());
    }
}
