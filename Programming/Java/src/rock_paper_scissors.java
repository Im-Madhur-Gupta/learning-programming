package com.company;
import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating an object of Random class
        Random obj = new Random();

        // the Random class allows us to generate random number within a given range and also of a particular datatype
        // like int , float , double , boolean and long.

        boolean play = true;
        int random;
        String str_random="",temp_user="";
        // 0 - rock , 1 - paper and 2 - scissor

        do
        {
            random = obj.nextInt(3); // jo () ke andar he wo bilkul python ke range function jaisa he
            // ie (3) means random number will be generated from 0 to (3-1) = 2.

            System.out.print("Enter Rock / Paper / Scissor : ");
            temp_user = input.next();

            if(random==0)
            {
                str_random = "Rock";
            }
            else if(random==1)
            {
                str_random = "Paper";
            }
            else if(random==2)
            {
                str_random = "Scissor";
            }


            if(temp_user.equalsIgnoreCase(str_random))
            {
                System.out.printf("You - %s , Computer - %s\nTie!",temp_user,str_random);
            }

            else if(temp_user.equalsIgnoreCase("rock") && str_random.equals("Paper"))
            {
                System.out.printf("You - %s , Computer - %s\nComputer wins!",temp_user,str_random);
            }
            else if(temp_user.equalsIgnoreCase("rock") && str_random.equals("Scissor"))
            {
                System.out.printf("You - %s , Computer - %s\nUser wins!",temp_user,str_random);
            }

            else if(temp_user.equalsIgnoreCase("paper") && str_random.equals("Scissor"))
            {
                System.out.printf("You - %s , Computer - %s\nComputer wins!",temp_user,str_random);
            }
            else if(temp_user.equalsIgnoreCase("paper") && str_random.equals("Rock"))
            {
                System.out.printf("You - %s , Computer - %s\nUser wins!",temp_user,str_random);
            }

            else if(temp_user.equalsIgnoreCase("scissor") && str_random.equals("Paper"))
            {
                System.out.printf("You - %s , Computer - %s\nUser wins!",temp_user,str_random);
            }
            else if(temp_user.equalsIgnoreCase("scissor") && str_random.equals("Rock"))
            {
                System.out.printf("You - %s , Computer - %s\nComputer wins!",temp_user,str_random);
            }

            System.out.printf("\nWould you like to play again, enter yes or no : ");
            temp_user = input.next();

            if(temp_user.equalsIgnoreCase("yes"))
            {

            }
            else
                play = false;


        }while(play);



    }
}
