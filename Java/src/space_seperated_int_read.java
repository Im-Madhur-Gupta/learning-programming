import java.util.Scanner;
public class space_seperated_int_read {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strArr[]= scan.nextLine().split(" ");
        int arr[] = new int[strArr.length];
        for(int i =0 ;i < strArr.length;i++){
            arr[i]= Integer.parseInt(strArr[i]);
        }
        for(int j:arr){
            System.out.println(j);
        }
    }
}