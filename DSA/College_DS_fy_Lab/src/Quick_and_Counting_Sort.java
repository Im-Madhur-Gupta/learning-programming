import java.util.concurrent.ThreadLocalRandom;
public class Quick_and_Counting_Sort{
    // COUNTING SORT -
    public static float Counting_Sort(int case_type) {
        int input[] = new int[100];
        for(int i=0;i<100;i++){
            input[i] = ThreadLocalRandom.current().nextInt(0, 150+1);
        }

        int toBeInserted,m;
        // for case_type = 0 numbers are to be left in random order
        if(case_type==1){ // when numbers should be in ascending order prior to sorting
            // Initial sorting is done using insertion sort.
            for(int i=1;i<input.length;i++){
                toBeInserted = input[i];
                for(m=i-1;m>=0 && input[m]>toBeInserted;m--){
                    input[m+1] = input[m];
                }
                input[m+1] = toBeInserted;
            }
        }
        else if(case_type==2){ // when numbers should be in descending order prior to sorting
            // Initial sorting is done using insertion sort.
            for(int i=1;i<input.length;i++){
                toBeInserted = input[i];
                for(m=i-1;m>=0 && input[m]<toBeInserted;m--){
                    input[m+1] = input[m];
                }
                input[m+1] = toBeInserted;
            }
        }

        // actual sorting starts
        long start = System.nanoTime();
        int countingArr[] = new int[150+1];
        for(int i=0;i<input.length;i++){
            countingArr[input[i]]++;
        }
        for(int j=1;j<countingArr.length;j++){
            countingArr[j] += countingArr[j-1];
        }
        int outarr[] = new int[input.length];
        for(int k=input.length-1;k>=0;k--){
            outarr[countingArr[input[k]]-1] = input[k];
            countingArr[input[k]]--;
        }
        for(int l=0;l<input.length;l++){
            input[l]=outarr[l];
        }
        long end = System.nanoTime();
        return (end-start)/1000000.0f; // converting time to ms and returning it
    }

    // QUICK SORT -
    public static float Quick_Sort_Driver(int case_type,boolean Randomised_Pivot){ // This is a Driver function for Quick_Sort function
        // if Randomised_Pivot is true then pivot will be a random element of array, otherwise a fixed element (lowest index)
        int arr[] = new int[100];
        for(int i=0;i<100;i++){
            arr[i] = ThreadLocalRandom.current().nextInt(1000, 10000+1);
        }
        // for case_type = 0 numbers are to be left in random order
        if(case_type==1){ // when numbers should be in ascending order prior to sorting
            int toBeInserted,m;
            for(int i=1;i<arr.length;i++){
                toBeInserted = arr[i];
                for(m=i-1;m>=0 && arr[m]>toBeInserted;m--){
                    arr[m+1] = arr[m];
                }
                arr[m+1] = toBeInserted;
            }
        }
        else if(case_type==2){ // when numbers should be in descending order prior to sorting
            int toBeInserted,m;
            for(int i=1;i<arr.length;i++){
                toBeInserted = arr[i];
                for(m=i-1;m>=0 && arr[m]<toBeInserted;m--){
                    arr[m+1] = arr[m];
                }
                arr[m+1] = toBeInserted;
            }
        }
        // actual sorting starts
        long start = System.nanoTime();
        Quick_Sort(arr,0,arr.length-1,Randomised_Pivot);
        long end = System.nanoTime();
        return (end-start)/1000000.0f; // converting time to ms and returning it
    }
    public static void Quick_Sort(int arr[],int lower,int upper,boolean Randomised_Pivot) {
        // lower - lowest index, upper - highest index
        if (lower < upper) {
                int pivotIndex = partition_quick_sort(arr, lower, upper,Randomised_Pivot);
                Quick_Sort(arr, lower, pivotIndex-1,Randomised_Pivot);
                Quick_Sort(arr, pivotIndex + 1, upper,Randomised_Pivot);
        }
    }
    public static int partition_quick_sort(int arr[],int lower,int upper,boolean Randomised_Pivot){
        if(Randomised_Pivot){
            int randonIndex=ThreadLocalRandom.current().nextInt(lower,upper+1);
            swap(arr,lower,randonIndex);
        }
        int i=lower,j=lower+1;
        while(j<=upper){
            if(arr[j]<arr[lower]){
                swap(arr,++i,j);
            }
            j++;
        }
        swap(arr,i,lower);
        return i;
    }
    public static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        // case_type is 0 for sorting when numbers are in random order
        // case_type is 1 for sorting when numbers are in ascending order
        // case_type is 2 for sorting when numbers are in descending order

        // Following variables store the total time for the 3 case_types
        // One set for Counting Sort, one for Quick Sort and last for Randomised Quick sort
        // I will divide their final value by 10 to get their average values.
        float time_counting_random=0.0f,time_counting_ascending=0.0f,time_counting_descending=0.0f;
        float time_quick_random=0.0f,time_quick_ascending=0.0f,time_quick_descending=0.0f;
        float time_rquick_random=0.0f,time_rquick_ascending=0.0f,time_rquick_descending=0.0f;

        for(int j=1;j<=10;j++) // loop runs for 10 times
        {
            // For Counting sort -
            time_counting_random += Counting_Sort(0); // when numbers are in random order
            time_counting_ascending += Counting_Sort(1); // when numbers are in ascending order
            time_counting_descending += Counting_Sort(2); // when numbers are in descending order

            // For Quick sort -
            time_quick_random += Quick_Sort_Driver(0,false); // when numbers are in random order
            time_quick_ascending += Quick_Sort_Driver(1,false); // when numbers are in ascending order
            time_quick_descending += Quick_Sort_Driver(2,false); // when numbers are in descending order

            // For Randomised Quick sort -
            time_rquick_random += Quick_Sort_Driver(0,true); // when numbers are in random order
            time_rquick_ascending += Quick_Sort_Driver(1,true); // when numbers are in ascending order
            time_rquick_descending += Quick_Sort_Driver(2,true); // when numbers are in descending order
        }

        System.out.println("The average times are as follows -");
        // all the values are divided by 10 to take average and %.3f is used for 3 digit decimal precision
        System.out.printf("Counting sort -\nFor random order - %.3fms\nFor ascending order - %.3fms\nFor descending order - %.3fms\n", time_counting_random/10, time_counting_ascending/10, time_counting_descending/10);
        System.out.printf("\nQuick sort -\nFor random order - %.3fms\nFor ascending order - %.3fms\nFor descending order - %.3fms\n", time_quick_random/10, time_quick_ascending/10, time_quick_descending/10);
        System.out.printf("\nRandomised Quick sort -\nFor random order - %.3fms\nFor ascending order - %.3fms\nFor descending order - %.3fms\n", time_rquick_random/10, time_rquick_ascending/10, time_rquick_descending/10);
    }
}