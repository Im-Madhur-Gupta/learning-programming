package com.company;

public class passing_non_primitive_var_to_methd {
    static void change(int arr[])
    {
        arr[0]=7;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; // ye maine ek Arrays class ka object banaya, where arr contains the base address of the array elements
        change(arr);
        System.out.println(arr[0]);
        // matlab kisi bhi NON-PRIMITIVE VARIABLE (Array, custom object) ko agr method ko pass kiya jata he to uska REFERNCE JATA HE
        // MATLAB the original variable can be changed
    }
}
