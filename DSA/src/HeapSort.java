public class HeapSort { // Heap's Root is at index 0.
    public static void heapSort(int arr[]){
        // Step 1 - convert arr to max Heap
        int size = arr.length;
        for(int i=(size/2)-1;i>=0;i--){
            heapifyNode(arr,size,i);
        }

        // Step 2 - Swap Root ie index=0 with last index and decreae size by 1
        // then apply heapify at index=0 with size (already decremented) till size==1
        while(size!=1){
            swapElements(arr,0,size-1);
            size--;
            heapifyNode(arr,size,0);
        }
    }
    public static void heapifyNode(int arr[],int size,int tempRoot){
        // Is function se mai TempRoot ke subTree ko (size-1) index tak heap me convert kardunga
        // tempRoot ko pehle uske direct children se coompare karunga phir next level (if req) pe recursively jaunga.
        int leftChild = 2*tempRoot+1, rightChild = 2*tempRoot+2;
        if(leftChild<size && arr[leftChild]>arr[tempRoot]){
            swapElements(arr,tempRoot,leftChild);
            heapifyNode(arr,size,leftChild);
        }
        if(rightChild<size && arr[rightChild]>arr[tempRoot]){
            swapElements(arr,tempRoot,rightChild);
            heapifyNode(arr,size,rightChild);
        }
    }
    public static void swapElements(int arr[],int index1,int index2){
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }

    public static void main(String[] args) {
        int arr[] = {5,2,9,21,-6,100,-82,0,9,21};
        heapSort(arr);
        for(int i:arr){
            System.out.print(i+", ");
        }
    }
}