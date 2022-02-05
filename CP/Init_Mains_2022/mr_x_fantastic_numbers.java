import java.util.*;

class Solution {
    public static String decToBinary(int n) {
        String ans = "";
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                ans += "1";
            else
                ans += "0";
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            int n = obj.nextInt();
            ArrayList<Integer> ans = new ArrayList<>(n);
            int nums[] = new int[n];
            for(int k=0;k<n;k++){
                nums[k] = obj.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int num = nums[i];

                // count no. of 1s in bin of num
                String bin = decToBinary(num);
                int numof1s = 0;
                for (int c = 0; c < bin.length(); c++) {
                    if (bin.charAt(c) == '1') numof1s++;
                }
                if (numof1s % 2 != 0) { // odd number of 1s -> not fantastic
                    continue;
                }

                bin = "0" + bin.substring(0, bin.length() - numof1s);
                int newNum = Integer.parseInt(bin, 2);

                // now have to check whether num is sum of 2 primes or not
                // The prime number(s) can't be 2.
                // Goldbach Conjecture
                // 1. if num is odd then one of the prime must be 2, but 2 is not allowed.
                if(newNum%2!=0 || newNum==4 || newNum==2 || newNum==0) continue;
                // 2. num is even
                else{
                    ans.add(num);
                }
            }
            if(ans.size()>0){
                Collections.sort(ans);
                for( int a: ans){
                    System.out.print(a+" ");
                }
                System.out.println();
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
