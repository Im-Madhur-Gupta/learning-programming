import java.util.Scanner;

public class Main {
    public static void inverted_pyrmd(int row)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++) {
                System.out.print("  ");
            }
            for(int k=0;k<(2*(row-i)-1);k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of rows to be printed : ");
        int row = obj.nextInt();
        inverted_pyrmd(row);
    }
}