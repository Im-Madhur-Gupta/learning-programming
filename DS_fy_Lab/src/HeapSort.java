import java.util.Scanner;
// Madhur Gupta (202051112)
public class HeapSort {
    public static void heapSort(int arr[]){
        int size = arr.length;
        for(int i=(size/2)-1;i>=0;i--){
            heapifyNode(arr,size,i);
        }
        while(size!=1){
            swapElements(arr,0,size-1);
            size--;
            heapifyNode(arr,size,0);
        }
    }
    public static void heapifyNode(int arr[],int size,int tempRoot){
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter space-seperated integer sequence to be sorted -");
        String strArr[]= scan.nextLine().split(" ");
        int arr[] = new int[strArr.length];
        for(int i =0 ;i < strArr.length;i++){
            arr[i]= Integer.parseInt(strArr[i]);
        }
        heapSort(arr);
        for(int i:arr){
            System.out.print(i+", ");
        }
    }
}