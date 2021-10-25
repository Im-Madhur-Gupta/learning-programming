import java.util.concurrent.ThreadLocalRandom;

public class SelectionSort {
    public static double selection_sort(int case_type) {
        int num[] = new int[100000];
        int swaps;
        for (int i = 0; i < 100000; i++) {
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
        } else if (case_type == 2) // when numbers should be in descending prior to sorting
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

        int minIndex, temp;
        // actual sorting starts
        long start = System.nanoTime();
        for (int i = 0; i < num.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[minIndex] > num[j]) {
                    minIndex = j;
                }
            }
            if(minIndex==i){continue;}
            else{
                num[i] = num[i] + num[minIndex];
                num[minIndex] = num[i] - num[minIndex];
                num[i] = num[i] - num[minIndex];
            }
        }
        long end = System.nanoTime();
        return (end - start) / 1000.0; // converting time to microsec and returning it
    }

    public static void main(String[] args) {

        // for sorting question -
        // case_type is 0 for sorting when numbers are in random order
        // case_type is 1 for sorting when numbers are in ascending order
        // case_type is 2 for sorting when numbers are in descending order

        double time_selection_random = 0.0, time_selection_ascending = 0.0, time_selection_descending = 0.0;
        time_selection_random = selection_sort(0); // when numbers are in random order
        time_selection_ascending = selection_sort(1); // when numbers are in ascending order
        time_selection_descending = selection_sort(2); // when numbers are in descending order

        System.out.println("The running times are as follows -");
        System.out.printf("\nSelection sort -\nFor random order - %.3f\nFor ascending order - %.3f\nFor descending order - %.3f\n", time_selection_random, time_selection_ascending, time_selection_descending);
    }
}
