package academy.learnprogramming.stackschallenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        string = string.toLowerCase();
        Deque<Character> stck = new ArrayDeque<Character>();
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                stck.addFirst(string.charAt(i));
            }
        }
        for (int i=0;i<string.length();i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z' && string.charAt(i)!=stck.removeFirst()){
                return false;
            }
        }
        return true;
    }
}
