package Striver;

// t - O(n), s - O(1)
public class Fibonacci_Tab_Opti {
    public static void main(String[] args) {
        int n = 5;

        int secondLastElement = 0;
        int lastElement = 1;

        int curr = -1;
        if (n == 0)
            curr = 0;
        if (n == 1)
            curr = 1;

        for (int i = 2; i < n + 1; i++) {
            curr = lastElement + secondLastElement;

            secondLastElement = lastElement;
            lastElement = curr;
        }

        System.out.println(curr);
    }
}
