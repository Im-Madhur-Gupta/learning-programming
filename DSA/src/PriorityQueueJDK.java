import java.util.PriorityQueue;
public class PriorityQueueJDK {
    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();
        // This JDK implementation uses Min Heap lower the value Higher its priority.
        priority_queue.add(1);
        priority_queue.add(4);
        priority_queue.add(2);
        priority_queue.add(10);
        priority_queue.add(-123);
        priority_queue.add(100);
        priority_queue.add(-1);
        priority_queue.add(2);

        System.out.println(priority_queue.peek());
        System.out.println(priority_queue.remove());
        System.out.println(priority_queue.peek());

        System.out.println(priority_queue.poll());
        // poll() can only delete the root of the queue/heap whereas remove() can delete any element of the queue/heap
        // and if no arguement is given to remove() it will remove the root.
        System.out.println(priority_queue.peek());

        System.out.println(priority_queue.remove(4)); // will remove 4 and return true
        System.out.println(priority_queue.remove(7)); // as 7 isn't present will return false.
        System.out.println(priority_queue.peek());

        priority_queue.add(-1);
        System.out.println(priority_queue.peek());

        System.out.println();
        Object nums[] = priority_queue.toArray();
        for(Object i:nums){
            System.out.print(i+", ");
        }
    }
}
