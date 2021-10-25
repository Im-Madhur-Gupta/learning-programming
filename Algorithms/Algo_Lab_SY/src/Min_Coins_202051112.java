import java.util.Scanner;

public class Min_Coins_202051112 {
    static int minCoinsFinder(int coins_arr[], int m, int v) {
        if (v == 0) return 0;
        int result = Integer.MAX_VALUE;

        for (int j = 0; j < m; j++) {
            if (coins_arr[j] <= v) {
                int sub_result = minCoinsFinder(coins_arr, m, v - coins_arr[j]);

                // Checking whether result can be minimized or not
                if (sub_result != Integer.MAX_VALUE && sub_result + 1 < result)
                    result = sub_result + 1;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of distinct coins - ");
        int n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the sequence of space separated integers representing the value of coins -");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter the amount to be paid - ");
        int v = obj.nextInt();
        System.out.println("Minimum number of coins required to pay the amount is " + minCoinsFinder(arr, n, v));
    }
}
