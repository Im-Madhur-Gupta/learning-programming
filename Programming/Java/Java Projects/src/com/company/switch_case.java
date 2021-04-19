package com.company;

public class switch_case {
    public static void main(String[] args) {

        int age = 18;
        switch(age)
        {
            case 18:
                System.out.println("18");

            case 20:
                System.out.println("20");
                break;
            case 23:
                System.out.println("23");
                break;

            default:

        }

        // default case is optional, default ke andar ka break is also optional as uske bad koi case ni ata
        // agar kisi case me break ni lagaya aur uske corresponding value match hogai to tab tak cases execute
        // honge jabtak yato break mil jaye yato switch hi khatam ho jae.

        // switch variable can be int, char or String.

        char alpha = 'd';
        switch(alpha)
        {
            case 'b':
                System.out.println("b");
                break;
            case 'a':
                System.out.println("a");
                break;
            case 'c':
                System.out.println("c");
                break;
            default:
                System.out.println("invalid character entered");
        }

        String color = "blue";
        switch(color)
        {
            case "red":
                System.out.println("red color");
                break;
            case "blue":
                System.out.println("blue color");
                break;
            case "black":
                System.out.println("black color");
                break;
            default:
                System.out.println("invalid color");
        }

        // an example of Enhanced Switch -
        String color1 = "blue";
        switch(color1)
        {
            case "red" -> {
                System.out.println("red color");
                System.out.println("red color");
            }
            case "blue" ->
                System.out.println("blue color");
            case "black"->
                System.out.println("black color");
            default -> {
                System.out.println("invalid color");
                System.out.println("invalid color");
            }
        }

//        enhanced switch doesn't need a break statement , ':' is replaced by '->'
//        for multiple statements inside a case we use parenthesis {} .

    }
}
