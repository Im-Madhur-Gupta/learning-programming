import java.util.Scanner;
public class Main {
    public static int ones_in_binary(String binary)
    {

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        String binary = obj.next();
        System.out.printf("%s has %d '1' bits in it.",binary,ones_in_binary(binary));
    }
}