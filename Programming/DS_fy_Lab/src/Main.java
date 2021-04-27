import java.util.Scanner;

public class Main {
    public static String rem_dup(String str)
    {

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = obj.next();
        System.out.println("String with duplicate characters removed is : "+rem_dup(str));
    }
}
