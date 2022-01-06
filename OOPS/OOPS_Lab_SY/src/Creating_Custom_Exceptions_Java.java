
import java.util.Scanner;

class CustomException1 extends Exception{
    public CustomException1(String message){
        super(message);
        System.out.println("Exception's Stack Trace - "+this.getStackTrace());
    }
}
public class Creating_Custom_Exceptions_Java {
    public static void main(String[] args) throws CustomException1 {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=obj.nextInt();
        if(a<0){
            throw new CustomException1("This is a message which will be shown once my custom exception is thrown, when value is negative.");
        }
        else{
            System.out.println("Program executed successfully without any exception.");
        }
    }
}
