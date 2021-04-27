package com.company;

public class for_each_loop {
    public static void main(String[] args) {

        int marks[] = {1,2,3,4,5,6};

        // For Each loop - its an enhanced version of for loop
        // it can only be used to read the values/elements of an array
        // IT CANNOT BE USED TO POPULATE/WRITE TO AN ARRAY(here, marks), for this we can use our traditional loops.
        // Kisi dusre array ko to populate kara ja sakta he.

        for(int element : marks) // isse ek ek karke element variable me marks array ka element ata rahega
            // pehle marks[0] ayega phir [1] ....
        {
            System.out.println(element);
        }
    }
}
