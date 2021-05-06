package com.company;

public class variable_arguments {
    // Variable Arguments - Varargs
    static int sum(int ...arr)
    // matlab sum method kitne bhi int type ke arguments accept karega aur unhe ek arr name
    // ke array me store kar dega, this arr can be used as a local variable inside the method method.
    // similarly for float - (float ...arr)
    {
        int sum=0;
        for(int i:arr)
        {
            sum += i;
        }
        return sum;
    }

//    static void sum(int x,int ...arr) // for atleast one parameter,
//    {
//    }
//
//    static void sum(int x,int y,int ...arr) // for atleast two parameter,
//    {
//    }

    public static void main(String[] args)
    {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum()); // variable number of arguments to 0 arguents bhi ho skate he na
    }
}
