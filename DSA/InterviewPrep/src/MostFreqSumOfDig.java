import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        // dp array to store sum of digits of numbers
        // dp[i] stores the sum of digits of number i
        int dp[] = new int[b + 1];

        int numDigB = (int)Math.log10(b)+1;
        int sumCountMap[] = new int[numDigB*9]; // init with all 0s

        // init the dp array
        dp[0] = 0;

        // I want the maximum count of a sum and that sum.
        int maxCount=0, maxCountSum=0;
        for (int i = 1; i <= b; i++) {
            int currSum = i % 10 + dp[i / 10]; // IMP Step
            dp[i] = currSum;

            if (i >= a) {
                int currCount = ++sumCountMap[currSum];
                if(maxCount<currCount){
                    maxCount = currCount;
                    maxCountSum = currSum;
                }
            }
        }

        System.out.println("maxCount "+maxCount);
        System.out.println("maxCountSum "+maxCountSum);
    }
}
