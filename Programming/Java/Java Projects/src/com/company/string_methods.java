package com.company;

import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        // as strings are immutable objects, the methods we are about to see won't affect the original string unless we
        // want it to, so , the methods will return a new string.

        // 1. str_name.length() - returns the length of the string.
//        String name = "MadHur";
//        int len = name.length();
//        System.out.println(len);

        // 2. str_name.toLowerCase() - returns a new string jisme sare uppercase characters
        // ko lowercase me convert kar diya gaya he.
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

        // 3. str_name.toUpperCase() - returns a new string jisme sare lowercase characters
        // ko uppercase me convert kar diya gaya he.
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);

        // 4. str_name.trim() - returns the original string after removing all trailing and leading
        // spaces. matlab "  madhur  gupta  " --> "madhur  gupta", yani words ke beech ki space will be
        // left as it is.
//        String non_trimmed = "  madhur  gupta  ";
//        String trimmed = non_trimmed.trim();
//        System.out.println(trimmed);

        // 5. str_name.substring(int start,int end)
        // its used for string slicing, start index is included, end index is excluded.
        // agr sirf ye likha - .substring(int index) --> index (included) se last tak string print ho jaegi.
//        String name = "Madhur";
//        System.out.println(name.substring(1,4));
//        System.out.println(name.substring(1));

        // 6. str_name.replace(old word/character,new word/character)
        // used to replace all the occurrences of a word / character.
        // also, if the old word/character isn't found in the string then NOTHING is replaced
        // ie String remains as it is.
        // string can be replaced only by a string
        // char can be replaced only by a char
        // string - "" , char - ''
//        String temp = "madhur Sen Sen";
//        temp = temp.replace("Sen","Gupta");
//        temp = temp.replace('m','M');
//        System.out.println(temp);

        // 7. str_name.startsWith() and str_name.endsWith() -
        // returns a boolean.
        // checks whether a string starts/ends with a char/word or not.
//        String name = "Madhur";
//        boolean start = name.startsWith("ma");
//        System.out.println(start);
//        boolean end = name.endsWith("ur");
//        System.out.println(end);

        // 8. IMPORTANT str_name.charAt(index) - returns the character at the given index
        // if the given index is out of range then error will be thrown.
        // It's basically used to access the characters of string index-wise.
//        String name = "Madhur";
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));

        // 9. str_name.indexOf(string , start index) -
        // checks for the occurrence of the given string inside str_name from LEFT hand side
        // means increasing index, and returns the index corresponding to 1st occurrence.
        // if string is not found inside str_name , it returns -1.
        // the start index argument is optional, default value is 0
        // If start index argument is given then the search will start from that index(included)
        // remember even if start start index is specified the returned index is corresponding
        // to the whole string.
//        String name = "MadhurMahura";
//        System.out.println(name.indexOf("Ma",5));
//        System.out.println(name.indexOf("hur",3));
//        System.out.println(name.indexOf("hur",4));
//        System.out.println(name.indexOf("z"));

        // 10. str_name.lastIndexOf(string , start index) -
        // This method is similar to .indexOf(), but here the search start from RIGHT hand side,
        // meaning decreasing index.
        // If start index is specified then search will start from that index(included)
        // start index is optional , default - (str_name.length() - 1).
        // rest other things are same as .indexOf()
//        String name = "MadhurMahura";
//        System.out.println(name.lastIndexOf("hur"));
//        System.out.println(name.lastIndexOf("hur",5));
//        System.out.println(name.lastIndexOf("x"));
//        System.out.println(name.lastIndexOf("u",3));

        // 11. str_name.equals(string) -
        // checks whether given string is equal to str_name or not, it is case sensitive, ie EXACT comp.
        // ' == ' --> equality operator isn't used for strings in java

        // 12. str_name.equalsIgnoreCase(string) -
        // it also checks whether 2 strings are equal or not, but it IGNORES the case of characters.

        String name = "MAdhur";
        System.out.println(name.equals("Madhur"));
        System.out.println(name.equals("MAdhur"));
        System.out.println(name.equalsIgnoreCase("madhur"));
        System.out.println(name.equalsIgnoreCase("Madhur"));
        System.out.println(name.equalsIgnoreCase("Mdhur"));


        // escape sequence characters -
        //  \n - newline character
        //  \t - tabspace character
        //  \' - single quote
        //  \" - double quote
        //  \\ - single backslash
        // escape sequence characters - jo \ se chalu hote he
        // type karte waqt 1 se zyada characters hote he par string ke andar ek chacrter
        // ko represent karte he.
    }
}