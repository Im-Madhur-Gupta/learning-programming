import java.util.*;
class Game{
    private int random;
    private int input;
    private int no_of_guess=0;
    public Game(){
        Random rand = new Random();
        random = rand.nextInt(101); // [0,100] se ek random number generate karke store karwa dega
    }
    public void takeUserInput(){
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter your guess for a number between 0 and 100 (both inclusive) : ");
        input = inpt.nextInt();
        no_of_guess++;
    }
    public void compare(){
        if (random == input){
            System.out.println("Your guess is Correct.");
        }
        else if(random < input){
            System.out.println("Smaller number please.");
        }
        else if(random > input){
            System.out.println("Larger number please.");
        }
    }
    public boolean isCorrect(){
        if (random == input){
            return true;
        }
        else{
            return false;
        }
    }
    public int getGuess(){
        return no_of_guess;
    }
}
public class guess_the_number {
    public static void main(String[] args) {
        Game player1 = new Game();
        while(true)
        {
            player1.takeUserInput();
            player1.compare();

            if(player1.isCorrect()==true)
            {
                break;
            }
        }
        System.out.println("You guessed it in "+player1.getGuess()+" attempts.");
    }
}
