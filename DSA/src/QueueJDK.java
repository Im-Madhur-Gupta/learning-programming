import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueJDK {
    // Queue backed by a doubly linked list
    Queue<Character> queue1 = new LinkedList<>();
    // OR
    Deque<Character> queue4 = new LinkedList<>();

    // Queue backed by array
    // 1. Fixed sized array (we have to give it a capacity) -
    Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(100);
    // 2. Variable array size -
    Deque<Character> queue3 = new ArrayDeque<>();

    // Methods -

    // 1. Queue interface -
    // add(enqueue), remove(dequeue) and element(peek).
    // https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Queue.html

    // 2. Deque interface -
    // Queue Method	    Equivalent Deque Method
    // add(e)	        addLast(e)
    // remove()	        removeFirst()
    // element()	    getFirst()
}
