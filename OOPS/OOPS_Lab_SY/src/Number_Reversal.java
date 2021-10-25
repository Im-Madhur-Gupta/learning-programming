import java.util.Scanner;

public class Number_Reversal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); // Declaring and Instantiating Scanner Object
        System.out.print("Enter the number that you want to reverse: ");
        int num = obj.nextInt(); // taking input
        // Iterative Approach -
//        int rev_num_iter = 0; // variable to store reversed number
//        while(num!=0){
//            rev_num_iter = 10*rev_num_iter + (num%10);
//            num /= 10;
//        }
//        System.out.println("Reversed Number is: ");
//        System.out.println("Iterative Approach: "+rev_num_iter);

        // Recursive Approach
        Number_Reversal revNum = new Number_Reversal();
        revNum.reverseNum(num);
        System.out.println("Recursive Approach: "+revNum.rev_num_recur);
    }
    int rev_num_recur=0;
    public void reverseNum(int num){
        if(num==0){
            return;
        }
        rev_num_recur = rev_num_recur*10 + (num%10);
        num /= 10;
        reverseNum(num);
    }
}
