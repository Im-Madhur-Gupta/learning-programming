package com.company;

public class Literals
{
    public static void main(String[] args)
    {
        byte age = 20; // age is identifier, 20 is an integer literal

        char letter = 'M'; // a character is enclosed in '', string in ""
        // name is identifier and 'M' is a character literal
        // literal is a constant value which can be assigned to a variable.

        // default type for a decimal literal is double
        double a = 5.7; // here 5.7 is a double literal
        /*
         if I want to assign a double literal to a float variable I have 2 methods -
         1. float b = 5.7f; f and F both will work, same for double (d and D)
         2. float c = (float) 5.7; --> typecasting, similar to C 's type casting.
        */
        float b = 5.7f;
        float c = (float) 5.7;

        /*
         such as above isn't required for byte, short and int literals
         they automatically get converted
         but agr bohot bada integer he (long size ka) to L or l se batana padega ki long literal he
        */
        long d = 2222222222222222l;
        // make sure size of variable isn't exceeded.

        boolean e = true;
        boolean f = false;

        String name ="Madhur"; // String me S capital he.
    }
}
