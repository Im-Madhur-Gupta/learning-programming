import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort {
    public static double insertion_sort(int case_type) {
        int n=10000000;
        int num[] = new int[n];
        int swaps;
        for (int i = 0; i < n; i++) {
            num[i] = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        }
        // for case_type = 0 numbers are to be left in random order
        if (case_type == 1) // when numbers should be in ascending order prior to sorting
        {
            while (true) {
                swaps = 0;
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i] > num[i + 1]) {
                        num[i] = num[i] + num[i + 1];
                        num[i + 1] = num[i] - num[i + 1];
                        num[i] = num[i] - num[i + 1];
                        swaps++;
                    }
                }
                if (swaps == 0) {
                    break;
                }
            }
        } else if (case_type == 2) // when numbers should be in descending order prior to sorting
        {
            while (true) {
                swaps = 0;
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i] < num[i + 1]) {
                        num[i] = num[i] + num[i + 1];
                        num[i + 1] = num[i] - num[i + 1];
                        num[i] = num[i] - num[i + 1];
                        swaps++;
                    }
                }
                if (swaps == 0) {
                    break;
                }
            }
        }

        // actual sorting starts
        long start = System.nanoTime();
        int toBeInserted,m;
        for(int i=1;i<num.length;i++){
            toBeInserted = num[i];
            for(m=i-1;m>=0 && num[m]>toBeInserted;m--){
                num[m+1] = num[m];
            }
            num[m+1] = toBeInserted;
        }
        long end = System.nanoTime();
        return (end - start) / 1000.0; // converting time to microsec and returning it
    }

    public static void main(String[] args) {

        // for sorting question -
        // case_type is 0 for sorting when numbers are in random order
        // case_type is 1 for sorting when numbers are in ascending order
        // case_type is 2 for sorting when numbers are in descending order

        double time_random = 0.0, time_ascending = 0.0, time_descending = 0.0;
        time_random = insertion_sort(0); // when numbers are in random order
        time_ascending = insertion_sort(1); // when numbers are in ascending order
        time_descending = insertion_sort(2); // when numbers are in descending order
        System.out.printf("Insertion sort -\nFor random order - %.3f\nFor ascending order - %.3f\nFor descending order - %.3f\n", time_random, time_ascending, time_descending);
    }
}
