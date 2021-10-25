import java.util.concurrent.ThreadLocalRandom;

public class BinarySearch {
    public static double binary_search(int case_type) {
        int n=10000000;
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i;
        }
        int search;
        if (case_type == 0) {
            search = num[ThreadLocalRandom.current().nextInt(0,n)];
        }
        else if (case_type == 1) {
            search = num[(num.length - 1) / 2];
        }
        else {
            search = num[num.length-1];
        }

        // actual sorting starts
        long start = System.nanoTime();
        int first = 0, last = num.length - 1, midpoint;
        while (first <= last) {
            midpoint = (last + first) / 2;
            if (num[midpoint] == search) {
                break; // element found so we can return
            }
            if (num[midpoint] > search) {
                last = midpoint - 1;
            }
            else {
                first = midpoint + 1;
            }
        }
        // if we would have returned when element was found then if control reaches here means element wasn't found
        long end = System.nanoTime();
        return (end - start) / 1000.0; // converting time to microsec and returning it
    }

    public static void main(String[] args) {
        double time_avg = 0.0, time_best = 0.0, time_worst = 0.0;
        time_avg = binary_search(0);
        time_best = binary_search(1);
        time_worst = binary_search(2);
        System.out.printf("\nBinary Search -\nFor Avg case - %.3f\nFor Best case - %.3f\nFor Worst case - %.3f\n", time_avg, time_best, time_worst);
    }
}
