import java.util.concurrent.ThreadLocalRandom;

public class LinearSearch {
    public static double linear_search(int case_type,int n) {
        int num[] = new int[n];
        int swaps;
        for (int i = 0; i < n; i++) {
            num[i] = i;
        }
        int search;
        if (case_type == 0){
            search = num[ThreadLocalRandom.current().nextInt(0, n)];
        }
        else if (case_type == 1){
            search = num[0];
        }
        else{
            search = num[num.length-1];
        }

        // actual sorting starts
        long start = System.nanoTime();
        for(int k=0;k<num.length;k++){
            if(num[k]==search){
                break; // element found so we can return
            }
        }
        // if we would have returned when element was found then if control reaches here means element wasn't found
        long end = System.nanoTime();
        return (end - start) / 1000.0; // converting time to microsec and returning it
    }

    public static void main(String[] args) {
        double time_avg = 0.0, time_best = 0.0, time_worst = 0.0;
        int n=10000000;
        time_avg = linear_search(0,n);
        time_best = linear_search(1,n);
        time_worst = linear_search(2,n);
        System.out.printf("\nLinear Search -\nFor Avg case - %.3f\nFor Best case - %.3f\nFor Worst case - %.3f\n", time_avg, time_best, time_worst);
    }
}
