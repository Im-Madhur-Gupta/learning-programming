import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

//public class QueueJDK {
//    // Queue backed by a doubly linked list
//    Queue<Character> queue1 = new LinkedList<>();
//    // OR
//    Deque<Character> queue4 = new LinkedList<>();
//
//    // Queue backed by array
//    // 1. Fixed sized array (we have to give it a capacity) -
//    Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(100);
//    // 2. Variable array size -
//    Deque<Character> queue3 = new ArrayDeque<>();
//
//    // Methods -
//
//    // 1. Queue interface -
//    // add(enqueue), remove(dequeue) and element(peek).
//    // https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Queue.html
//
//    // 2. Deque interface -
//    // Queue Method	    Equivalent Deque Method
//    // add(e)	        addLast(e)
//    // remove()	        removeFirst()
//    // element()	    getFirst()
//}

class QueueOpsinJDK {
    public static void main(String[] args) {
        // 1. Initialize a queue.
        Queue<Integer> q = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + q.peek());
        // 3. Push new element. Enqueue
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        // 4. Pop an element. Dequeue
        q.poll();
        // 5. Get the first element.
        System.out.println("The first element is: " + q.peek());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + q.size());
    }
}
