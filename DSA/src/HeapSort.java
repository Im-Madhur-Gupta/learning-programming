public class HeapSort {
    public static void heapSortMe(int arr[]){
        MinHeap tempheap = new MinHeap();
        for(int i:arr){
            tempheap.insert(i);
        }
        int i=0;
        while(tempheap.size!=0){
            arr[i++] = tempheap.delete();
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,9,21,-1,2,5,0,-6};
        heapSortMe(arr);
        for(int i:arr){
            System.out.print(i+", ");
        }
    }
}
