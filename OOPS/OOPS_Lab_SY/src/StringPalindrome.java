public class StringPalindrome {
    //creating a method to check whether a string is palindrome or not
    public static boolean isPalindrome(String str) {
        //converting the string to lower case in order to avoid case mismatch
        str = str.toLowerCase();
        // using a loop to compare the ith element to (n-i-1)th element of the string
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false; // different characters found
            }
        }
        return true; // string is a palindrome as complete loop was executed.
    }
    public static void main(String[] args) {
        System.out.println("ABBa is a Palindrome: "+isPalindrome("ABBa"));
        System.out.println("Aba is a Palindrome: "+isPalindrome("Aba"));
        System.out.println("abcd is a Palindrome: "+isPalindrome("abcd"));
    }
}
