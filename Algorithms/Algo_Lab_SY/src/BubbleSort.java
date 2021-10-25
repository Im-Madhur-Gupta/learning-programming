import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {
    public static double bubble_sort(int case_type) {
        int num[] = new int[100000];
        int swaps;
        for (int i = 0; i < 100000; i++) {
            num[i] = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        }
        // for case_type = 0 numbers are to be left in random order
        if (case_type == 1) // when numbers should be in ascending order prior to sorting
        {
            int lastIndex = num.length-1;
            do{
                swaps = 0;
                for(int i=0;i!=lastIndex;i++){
                    if(num[i]>num[i+1]){
                        swap(num,i,1);
                        swaps++;
                    }
                }
                lastIndex--;
            }while(swaps!=0);
        } else if (case_type == 2) // when numbers should be in descending order prior to sorting
        {
            int lastIndex = num.length-1;
            do{
                swaps = 0;
                for(int i=0;i!=lastIndex;i++){
                    if(num[i]<num[i+1]){
                        swap(num,i,1);
                        swaps++;
                    }
                }
                lastIndex--;
            }while(swaps!=0);
        }

        // actual sorting starts
        long start = System.nanoTime();
        int lastIndex = num.length-1;
        do{
            swaps = 0;
            for(int i=0;i!=lastIndex;i++){
                if(num[i]>num[i+1]){
                    swap(num,i,1);
                    swaps++;
                }
            }
            lastIndex--;
        }while(swaps!=0);
        long end = System.nanoTime();
        return (end - start) / 1000.0; // converting time to microsec and returning it
    }
    public static void swap(int arr[],int i,int jump){
        arr[i] = arr[i] + arr[i+jump];
        arr[i+jump] = arr[i] - arr[i+jump];
        arr[i] = arr[i] - arr[i+jump];
    }

    public static void main(String[] args) {

        // for sorting question -
        // case_type is 0 for sorting when numbers are in random order
        // case_type is 1 for sorting when numbers are in ascending order
        // case_type is 2 for sorting when numbers are in descending order

        double time_bubble_random = 0.0, time_bubble_ascending = 0.0, time_bubble_descending = 0.0;
        time_bubble_random = bubble_sort(0); // when numbers are in random order
        time_bubble_ascending = bubble_sort(1); // when numbers are in ascending order
        time_bubble_descending = bubble_sort(2); // when numbers are in descending order
        System.out.printf("Bubble sort -\nFor random order - %.3f\nFor ascending order - %.3f\nFor descending order - %.3f\n", time_bubble_random, time_bubble_ascending, time_bubble_descending);
    }
}
