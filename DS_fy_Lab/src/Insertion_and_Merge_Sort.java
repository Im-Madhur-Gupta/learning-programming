import java.util.concurrent.ThreadLocalRandom;
public class Insertion_and_Merge_Sort{

    // INSERTION SORT -
    public static float Insertion_Sort(int case_type) {
        int input[] = new int[100];
        for(int i=0;i<100;i++){
            input[i] = ThreadLocalRandom.current().nextInt(1000, 10000+1);
        }

        int toBeInserted,m;
        // for case_type = 0 numbers are to be left in random order
        if(case_type==1){ // when numbers should be in ascending order prior to sorting
            for(int i=1;i<input.length;i++){
                toBeInserted = input[i];
                // after below while loops completes execution, toBeInserted will contain the index ahead of which we
                // have to insert an element.
                for(m=i-1;m>=0 && input[m]>toBeInserted;m--){
                    input[m+1] = input[m];
                }
                input[m+1] = toBeInserted;
            }
        }
        else if(case_type==2){ // when numbers should be in descending order prior to sorting
            for(int i=1;i<input.length;i++){
                toBeInserted = input[i];
                // after below while loops completes execution, this variable will contain the index ahead of which we
                // have to insert an element.
                for(m=i-1;m>=0 && input[m]<toBeInserted;m--){
                    input[m+1] = input[m];
                }
                input[m+1] = toBeInserted;
            }
        }

        // actual sorting starts
        long start = System.nanoTime();
        for(int i=1;i<input.length;i++){
            toBeInserted = input[i];
            // after below while loops completes execution, toBeInserted will contain the index ahead of which we
            // have to insert an element.
            for(m=i-1;m>=0 && input[m]>toBeInserted;m--){
                input[m+1] = input[m];
            }
            input[m+1] = toBeInserted;
        }
        long end = System.nanoTime();
        return (end-start)/1000000.0f; // converting time to ms and returning it
    }

    // MERGE SORT -
    public static void Merge(int input[],int start,int mid,int end){
        if(input[mid-1]<=input[mid]){
            // In this case we don't have to do anything.
            return;
        }
        int temp_arr[] = new int[end-start];
        int i=start,j=mid,k=0;
        while(i<mid && j<end){
            if(input[i]<=input[j]){
                temp_arr[k++]=input[i++];
            }
            else{
                temp_arr[k++]=input[j++];
            }
        }
        while(i<mid){
            temp_arr[k++]=input[i++];
        }
        while(j<end){
            temp_arr[k++]=input[j++];
        }

        for(k=start;k<end;k++){
            input[k]=temp_arr[k-start];
        }
    }
    public static void Merge_Sort(int input[],int start,int end){
        // NOTE - end is one greater than actual end of array/subarray.
        if(end-start<2){ // break out of recursion when we have logically divided all elements to 1 element subarrays.
            return;
        }
        int mid = (start+end)/2;
        Merge_Sort(input,start,mid);
        Merge_Sort(input,mid,end);
        Merge(input,start,mid,end);
    }

    public static float Merge_Sort_Driver(int case_type){ // This is a Driver function for Merge_Sort function
        int input[] = new int[100];
        for(int i=0;i<100;i++){
            input[i] = ThreadLocalRandom.current().nextInt(1000, 10000+1);
        }

        // for case_type = 0 numbers are to be left in random order
        if(case_type==1){ // when numbers should be in ascending order prior to sorting
            int toBeInserted,m;
            for(int i=1;i<input.length;i++){
                toBeInserted = input[i];
                // after below while loops completes execution, toBeInserted will contain the index ahead of which we
                // have to insert an element.
                for(m=i-1;m>=0 && input[m]>toBeInserted;m--){
                    input[m+1] = input[m];
                }
                input[m+1] = toBeInserted;
            }
        }
        else if(case_type==2){ // when numbers should be in descending order prior to sorting
            int toBeInserted,m;
            for(int i=1;i<input.length;i++){
                toBeInserted = input[i];
                // after below while loops completes execution, this variable will contain the index ahead of which we
                // have to insert an element.
                for(m=i-1;m>=0 && input[m]<toBeInserted;m--){
                    input[m+1] = input[m];
                }
                input[m+1] = toBeInserted;
            }
        }

        // actual sorting starts
        long start = System.nanoTime();
        Merge_Sort(input,0,100); // Calling Merge_Sort function to actually start Merge sort.
        long end = System.nanoTime();
        return (end-start)/1000000.0f; // converting time to ms and returning it
    }

    public static void main(String[] args) {
        // case_type is 0 for sorting when numbers are in random order
        // case_type is 1 for sorting when numbers are in ascending order
        // case_type is 2 for sorting when numbers are in descending order

        // Following variables store the total time for the 3 case_types
        // One set for Insertion sort and other for Merge sort
        // I will divide their final value by 10 to get their average values.
        float time_insertion_random=0.0f,time_insertion_ascending=0.0f,time_insertion_descending=0.0f;
        float time_merge_random=0.0f,time_merge_ascending=0.0f,time_merge_descending=0.0f;

        for(int j=1;j<=10;j++) // loop runs for 10 times
        {
            // For Insertion sort -
            time_insertion_random += Insertion_Sort(0); // when numbers are in random order
            time_insertion_ascending += Insertion_Sort(1); // when numbers are in ascending order
            time_insertion_descending += Insertion_Sort(2); // when numbers are in descending order

            // For Merge sort -
            time_merge_random += Merge_Sort_Driver(0); // when numbers are in random order
            time_merge_ascending += Merge_Sort_Driver(1); // when numbers are in ascending order
            time_merge_descending += Merge_Sort_Driver(2); // when numbers are in descending order
        }

        System.out.println("The average times are as follows -");
        // all the values are divided by 10 to take average and %.3f is used for 3 digit decimal precision
        System.out.printf("Insertion sort -\nFor random order - %.3fms\nFor ascending order - %.3fms\nFor descending order - %.3fms\n", time_insertion_random/10, time_insertion_ascending/10, time_insertion_descending/10);
        System.out.printf("\nMerge sort -\nFor random order - %.3fms\nFor ascending order - %.3fms\nFor descending order - %.3fms\n", time_merge_random/10, time_merge_ascending/10, time_merge_descending/10);
    }
}