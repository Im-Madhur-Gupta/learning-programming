package academy.learnprogramming.queueschallenge;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

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
        // pushing into stack
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                stck.addFirst(string.charAt(i));
            }
        }
        // enqueing to queue
        Deque<Character> queue = new ArrayDeque<Character>();
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                queue.addLast(string.charAt(i));
            }
        }

        while(!queue.isEmpty()){
            // yaha pe characters return honge (primitive) to we can use == and !=, par agr koi object hota like String etc to .equals.
            if(stck.removeFirst()!=queue.removeFirst()){
                return false;
            }
        }
        return true;
    }
}
