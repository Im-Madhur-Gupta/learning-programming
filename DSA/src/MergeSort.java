// Sibling left/right arrays are the ones which we have logically created as a result of spliting and they will get
// merged during the runtime of Algo.
public class MergeSort {
    public static void Merge(int input[],int start,int mid,int end){
        if(input[mid-1]<=input[mid]){
            // OPTIMIZATION 1 - in this case we don't have to do anything.
            return;
        }

        int temp_arr[] = new int[end-start];
        int i=start,j=mid,k=0;
        while(i<mid && j<end){
            if(input[i]<=input[j]){
                // here, <= makes the algo stable, if we use just < then the algo isn't stable.
                temp_arr[k++]=input[i++];
            }
            else{
                temp_arr[k++]=input[j++];
            }
        }
        while(i<mid){
            temp_arr[k++]=input[i++];
        }
        if(j<end){ // OPTIMIZATION 2
            end=j;
        }

        for(k=start;k<end;k++){
            input[k]=temp_arr[k-start];
        }
    }
    public static void Merge_Sort(int input[],int start,int end){
        // end is one greater than actual end.
        if(end-start<2){ // break out of recursion when we have made 1 element arrays.
            return;
        }
        int mid = (start+end)/2;
        Merge_Sort(input,start,mid);
        Merge_Sort(input,mid,end);
        Merge(input,start,mid,end);
    }

    public static void main(String[] args) {
        int temp_arr[] = {2,5,1,-62,0,123,2,3,1,-2,-1};
        Merge_Sort(temp_arr,0,temp_arr.length);
        for(int i:temp_arr){
            System.out.print(i+" ");
        }
    }
}