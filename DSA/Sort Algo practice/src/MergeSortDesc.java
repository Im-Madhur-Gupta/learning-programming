public class MergeSortDesc {
    public static void MergeSortDesc(int arr[],int start,int end){
        // Note - This implementation makes start and end actual start and end indices of subarray or array.
        if(start==end){ return; }
        int mid = (start+end-1)/2;
        MergeSortDesc(arr,start,mid);
        MergeSortDesc(arr,mid+1,end);
        MergeDesc(arr,start,mid,end);
    }
    public static void MergeDesc(int arr[],int start,int mid,int end){
        if(arr[mid]>=arr[mid+1]){
            return;
        }
        int temp_arr[] = new int[arr.length];
        int i=start,j=mid+1,k=start;
        while(i<=mid && j<=end){
            if(arr[i]>=arr[j]){
                temp_arr[k++] = arr[i++];
            }
            else{
                temp_arr[k++] = arr[j++];
            }
        }
        while(i!=mid+1){
            temp_arr[k++] = arr[i++];
        }
        for(int l=start;l<k;l++){
            arr[l] = temp_arr[l];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,44,3,1,8};
        MergeSortDesc(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
