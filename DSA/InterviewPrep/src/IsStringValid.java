public class IsStringValid {
    public static void main(String[] args) {
        String str = "_madhurG@123";
        System.out.println(isStringValid(str));
    }

    static boolean isStringValid(String str) {
        // trivial case
        if(str==null || str.length()==0) return false;

        // special check for the first char
        char firstChar = str.charAt(0);
        if(firstChar!='_' && !isCharInRange(firstChar, 'a', 'z') && !isCharInRange(firstChar, 'A', 'Z')) return false;

        for(int i=1;i<str.length();i++){
            char currChar = str.charAt(i);
            if(!isCharInRange(currChar, 'a', 'z') && !isCharInRange(currChar, 'A', 'Z') && !isCharInRange(currChar, '0', '9')){
                return false; // invalid char found, hence, str is invalid
            }
        }

        return true; // str is valid
    }

    static boolean isCharInRange(char input, char lower, char upper) {
        // If we want to check whether a character lies in a range or not
        // we can simply use the the comparision operators to do the job
        // comparision operators basically char ko UNICODE mai convert karke hi comapre karenge
        // to mujhe UNICODE mai convert karne ki zaroorat ni he
        return (lower <= input && input <= upper);
    }
}
