package com.company;
import java.util.Scanner;

public class string_input
{
    public static void main(String[] args)
    {
        Scanner obj2 = new Scanner(System.in);

        // Taking string input -
        // (1) .next() reads only 1 word string, ie. space milne ke bad read karna stop kar deta he.
//        String str1 = obj2.next();
//        System.out.println(str1);

        // (2) .nextLine can read multi-word string
        String str2 = obj2.nextLine();
        System.out.println(str2);
    }
}
