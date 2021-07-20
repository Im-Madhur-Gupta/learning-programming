public class Heap{
    protected int arr[];
    protected int size; // contains number of elements in the heap. Remember this implementation has its root at index = 1.
    protected Heap(){
        arr = new int[10];
        size=0;
    }
    protected void checkSize(){
        if(size+1== arr.length){
            int temparr[] = new int[arr.length*2];
            System.arraycopy(arr,0,temparr,0,arr.length);
            arr = temparr;
        }
    }
    public void display(){
        for(int i=1;i<size+1;i++){
            System.out.print(arr[i]+", ");
        }
    }
    public void isEmpty(){
        if(size==0){
            throw new IllegalArgumentException("Heap is Empty.");
        }
    }
    public int peek(){
        isEmpty();
        return arr[1];
    }
}
// This implementation works for similar as well as dissimilar data acc. to definition of Max and Min Heaps.
class MaxHeap extends Heap{
    public void insert(int value){
        checkSize();
        int possibleIndex = size+1, parentIndex = (size+1) / 2;
        while (possibleIndex != 1 && value > arr[parentIndex]) {
            arr[possibleIndex] = arr[parentIndex];
            possibleIndex = parentIndex;
            parentIndex /= 2;
        }
        arr[possibleIndex] = value;
        size++;
    }
    public int delete(){
        isEmpty();
        int toBeReturned = arr[1],lastElement = arr[size--],tempIndex=1;
        while(true){
            if(2*tempIndex<size && arr[2*tempIndex+1]>arr[2*tempIndex] && arr[2*tempIndex+1]>lastElement){
                // L,R defined and R>L and R>value
                arr[tempIndex]=arr[2*tempIndex+1];
                tempIndex = 2*tempIndex+1;
            }
//            else if(2*tempIndex<size && arr[2*tempIndex]>arr[2*tempIndex+1] && arr[2*tempIndex]>lastElement){
//            // This else if isn't req.
//                arr[tempIndex]=arr[2*tempIndex];
//                tempIndex *= 2;
//            }
            else if(2*tempIndex<=size && arr[2*tempIndex]>lastElement) {
                // For (L,R defined and L>R and L>value) OR (only L defined and L>value)
                arr[tempIndex] = arr[2 * tempIndex];
                tempIndex *= 2;
            }
            else{ // For rest of the possibilities we just have to place value at tempIndex.
                arr[tempIndex]=lastElement;
                return toBeReturned;
            }
        }
    }
}
class MinHeap extends Heap{
    public void insert(int value){
        checkSize();
        int possibleIndex = size+1, parentIndex = (size+1) / 2;
        while (possibleIndex != 1 && value < arr[parentIndex]) {
            arr[possibleIndex] = arr[parentIndex];
            possibleIndex = parentIndex;
            parentIndex /= 2;
        }
        arr[possibleIndex] = value;
        size++;
    }
    public int delete(){
        isEmpty();
        int toBeReturned = arr[1],lastElement = arr[size--],tempIndex=1;
        while(true){
            if(2*tempIndex<size && arr[2*tempIndex+1]<arr[2*tempIndex] && arr[2*tempIndex+1]<lastElement){
                // L,R defined and R<L and R<value
                arr[tempIndex]=arr[2*tempIndex+1];
                tempIndex = 2*tempIndex+1;
            }
//            else if(2*tempIndex<size && arr[2*tempIndex]<arr[2*tempIndex+1] && arr[2*tempIndex]<lastElement){
//            // This else if isn't required
//                arr[tempIndex]=arr[2*tempIndex];
//                tempIndex *= 2;
//            }
            else if(2*tempIndex<=size && arr[2*tempIndex]<lastElement) {
                // This is for ( (L,R defined and L<R and L<value) OR (only L defined and L<value) )
                arr[tempIndex] = arr[2 * tempIndex];
                tempIndex *= 2;
            }
            else{ // In rest of the possibilities we just have to place value at tempIndex.
                arr[tempIndex]=lastElement;
                return toBeReturned;
            }
        }
    }
}

class Apply{
    public static void main(String[] args) {
        MaxHeap heap1 = new MaxHeap();
        heap1.insert(1);
        heap1.insert(1);
        heap1.insert(4);
        heap1.insert(2);
        heap1.insert(2);
        heap1.insert(3);
        heap1.insert(9);
        heap1.insert(9);
        heap1.display();
        System.out.println();
        System.out.println(heap1.peek());

        heap1.delete();
        heap1.display();
        System.out.println();
        System.out.println(heap1.peek());

        heap1.delete();
        heap1.display();
        System.out.println();
        System.out.println(heap1.peek());

        heap1.delete();
        heap1.display();
        System.out.println();

        heap1.delete();
        heap1.display();
        System.out.println();

        heap1.delete();
        heap1.display();
        System.out.println();

        heap1.delete();
        heap1.display();
        System.out.println();


        System.out.println();
        MinHeap heap2 = new MinHeap();
        heap2.insert(1);
        heap2.insert(1);
        heap2.insert(4);
        heap2.insert(2);
        heap2.insert(2);
        heap2.insert(3);
        heap2.insert(9);
        heap2.insert(9);
        heap2.display();
        System.out.println();

        heap2.delete();
        heap2.display();
        System.out.println();

        heap2.delete();
        heap2.display();
        System.out.println();

        heap2.delete();
        heap2.display();
        System.out.println();

        heap2.delete();
        heap2.display();
        System.out.println();

        heap2.delete();
        heap2.display();
        System.out.println();

        heap2.delete();
        heap2.display();
        System.out.println();

        heap2.delete();
        heap2.display();
        System.out.println();
    }
}
