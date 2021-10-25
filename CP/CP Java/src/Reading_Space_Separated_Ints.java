import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reading_Space_Separated_Ints {
    public static void main(String[] args) throws IOException {
        // Works on CodeChef
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int i;
        for (i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // FASTER METHOD but doesn't work on CodeChef
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int num[] = new int[n];
        String[] strNums;
        strNums = bi.readLine().split(" ");
        for (i = 0; i < n; i++) {
            num[i] = Integer.parseInt(strNums[i]);
        }

        System.out.println("printing stored numbers ");
        for (i = 0; i < strNums.length; i++) {
            System.out.println(num[i]);
        }
    }
}
