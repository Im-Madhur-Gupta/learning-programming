public class Linear_Search {
    public static int LinearSearch(int arr[], int num){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return i; // element found and returning its index.
            }
        }
        return -1; // Element not found
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,12,3,0}; // declaring array of ints
        int num = 3; // declaring int variable for the num we would search for
        int index = LinearSearch(arr,num);
        System.out.println("Elements index is: "+index);
    }
}
