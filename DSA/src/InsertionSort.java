public class InsertionSort {
    public static void insertion_sort_me(int input[]){
        int toBeInserted,m;
        for(int i=1;i<input.length;i++){
            toBeInserted = input[i];
            // after below while loops completes execution, this variable will contain the index ahead of which we
            // have to insert an element.
            for(m=i-1;m>=0 && input[m]>toBeInserted;m--){
                input[m+1] = input[m];
            }
            input[m+1] = toBeInserted;
        }
    }

    public static int knuth(int length){
        // Knuth value calculation (initial gap length calc.) -
        int jump=1;
        while(jump<=(length/3)){
            jump=3*jump+1;
        }
        return jump;
    }
    public static void shell_sort_me(int arr[],int jump)
    {
        // jump/gap jo lena he wo lelo.
        // jump - kitni jumps aage wale element se compare karna he.
        int toBeInsterted,j;
        while(jump>=1)
        {
            for(int i=jump;i<arr.length;i++)
            {
                toBeInsterted = arr[i];
                for(j=i-jump;j>=0 && arr[j]>toBeInsterted;j-=jump)
                {
                    arr[j+jump] = arr[j];
                }
                arr[j+jump] = toBeInsterted;
            }
            jump/=3;
        }
    }

    public static void main(String[] args) {
        int temp_arr[] = {2,5,1,-62,0,123,2,3,1,-2,-1};
        int temp_arr1[] = {2,5,1,-62,0,123,2,3,1,-2,-1};
        long tinsert=0, tshell=0,start,end;
        int jump = knuth(temp_arr1.length);;
        for(int i=0;i<10;i++){
            start = System.nanoTime();
            insertion_sort_me(temp_arr);
            end = System.nanoTime();
            tinsert += (end-start);

            start = System.nanoTime();
            shell_sort_me(temp_arr1,jump);
            end = System.nanoTime();
            tshell += (end-start);
        }

        System.out.printf("Insertion - %.4f\n",tinsert/10000000.0);
        System.out.printf("Shell - %.4f",tshell/10000000.0f);

//        for(int i:temp_arr){
//            System.out.print(i+" ");
//        }
//        System.out.println("\n");
//        for(int i:temp_arr1){
//            System.out.print(i+" ");
//        }
    }
}