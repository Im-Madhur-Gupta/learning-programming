package com.company;

public class methods {
    static int sum(int x,int y) {
        return x+y;
        // Note - The this method is a static method, matlab ki ye method apni puri class se associate ho gaya he
        // rather than being associated to an object of it's class.
        // matlab ki mai is method ko class ke andar bina object banae call kar sakta hu .
        // agr static ni hota to sare objects of this class ke liye method alag alag copy ho jata
        // phir agar mujhe is method ko call karna rehta to mujhe obj bana padta class ka, ye batane ke liye that
        // im talking about sum method of this particular object.
    }

    float avg(int a,int b)
    {
        return a+b/2.0f; // by default a decimal literal is a double literal
        // Note - This method is not static, matlab isko call karne ke liye object bana padega.
    }
    public static void main(String[] args) {
        // Method - matlab ek aisa function which is inside a class, it's an OOPS term.
        int a=1,b=2;
        int c = sum(a,b); // this is like call by value, matlab a,b ki value x,y me store ho jaegi
        // yani x,y me change karne se a,b change ni hone wale, this is valid for all primitive datatypes

        methods obj = new methods();
        float d = obj.avg(a,b); // iska matlab obj object ka avg function call karna he.
    }
}
