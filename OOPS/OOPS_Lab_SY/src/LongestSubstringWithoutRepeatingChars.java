import java.util.Arrays;
import java.util.Scanner;
class LongestSubstring {
    public static int longestSubstrWithoutRepeatingChar(String s){
        int lastSeen[] = new int[128];
        Arrays.fill(lastSeen,-1);
        int start=0,max_str_len =0;
        for(int i=0;i<s.length();i++){
            start = Math.max(start, lastSeen[s.charAt(i)]+1);
            max_str_len = Math.max(max_str_len,i-start+1);
            lastSeen[s.charAt(i)] = i;
        }
        return max_str_len;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String - ");
        String s = obj.nextLine();
        int ans = longestSubstrWithoutRepeatingChar(s);
        System.out.println("The longest Sub String in the given string with no repeated chars is of length "+ans+".");
    }
}
