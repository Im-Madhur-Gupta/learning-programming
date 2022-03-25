package MCM;

public class PalindromePartitioning_Recur {
    static boolean isSlicePalindrome(String S, int i, int j) {
        while (i < j) {
            if (S.charAt(i) != S.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static int palindromePartitioning_Recur(String S, int i, int j) {
        // Note - i can start from 0 now, kyoki yaha normal MCM jaise dimensions ka koi matlab ni he.

        // base condition for recursion
        if (i >= j) return 0;
        // length = 0,1 wali strings palindrome hongi

        // check whether given slice of string is a palindrome or not
        // if yes then we dont need to partition further
        if (isSlicePalindrome(S, i, j)) {
            return 0;
        }

        // String slice is not a palindrome so we have partition it
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int tempAns = palindromePartitioning_Recur(S, i, k) + palindromePartitioning_Recur(S, k + 1, j) + 1;
            // + 1 is corresponding to the partition we just made at k

            // storing the min. of answers (partitions) corresponding to all the values of k
            ans = Math.min(ans, tempAns);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "nitin";
        // System.out.println(isSlicePalindrome(s,0,s.length()-1));
        System.out.println(palindromePartitioning_Recur(s, 0, s.length() - 1));

        s = "geek";
        System.out.println(palindromePartitioning_Recur(s, 0, s.length() - 1));

        s = "abcde";
        System.out.println(palindromePartitioning_Recur(s, 0, s.length() - 1));

        s = "abbac";
        System.out.println(palindromePartitioning_Recur(s, 0, s.length() - 1));
    }
}
