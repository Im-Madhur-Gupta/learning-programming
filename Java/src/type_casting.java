public class type_casting {
    public static void main(String[] args) {
        char a='0';
        int a_conv = (int)a; // In Java, a_conv will be 48 not 0, as the conversion is according to UNICODE / ASCII.
        System.out.println(a_conv);

        int b=9;
        char b_conv=(char)b; // In Java, b_conv will be [HORIZONTAL TAB] (check ASCII Table) and not '9'.
        System.out.println(b_conv);
    }
}
