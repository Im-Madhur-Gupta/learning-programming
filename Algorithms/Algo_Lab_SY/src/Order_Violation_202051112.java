import java.util.Scanner;

public class Order_Violation_202051112 {
    static int num_of_violations = 0;
    public static void countViolations(int arr[],int i){
        if(i==arr.length-1){
            return;
        }
        for (int j=i+1;j<arr.length;j++) {
            if (arr[i] > arr[j]) {
                num_of_violations++;
            }
        }
        countViolations(arr,i+1);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of integers in the sequence - ");
        int n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the sequence of space separated integers -");
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        countViolations(arr,0);
        System.out.println("The number of violations in the given sequence are - "+num_of_violations);
    }
}
