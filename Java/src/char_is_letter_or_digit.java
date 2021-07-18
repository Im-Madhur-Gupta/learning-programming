public class char_is_letter_or_digit {
    public static void main(String[] args) {
        char a='a',b='1',c='+',d=' ';
        if(Character.isLetterOrDigit(a)){
            System.out.println(true);
        }
        if(Character.isLetterOrDigit(b)){
            System.out.println(true);
        }
        if(Character.isLetterOrDigit(c)){
            System.out.println(true);
        }
        if(Character.isLetterOrDigit(d)){
            System.out.println(true);
        }
    }
}