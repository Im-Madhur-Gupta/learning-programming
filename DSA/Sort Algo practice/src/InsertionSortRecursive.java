public class InsertionSortRecursive {
    public static void insertionSortRecursiveDriver(int input[]){
        insertionSortRecursive(input,input.length-1);
    }
    public static void insertionSortRecursive(int input[],int i){
        if(i==0){
            return;
        }
            insertionSortRecursive(input,i-1);
            int toBeInserted = input[i];
            compare(input,i,toBeInserted,i-1);
    }
    public static void compare(int input[],int i,int toBeInserted,int m){
        if(m>=0 && input[m]>toBeInserted){
            input[m+1] = input[m];
            compare(input,i,toBeInserted,m-1);
        }
        else{
            input[m+1] = toBeInserted;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,1,-22,0,-222,31,2,3};
        insertionSortRecursiveDriver(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
