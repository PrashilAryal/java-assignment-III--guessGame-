import java.util.Random;
import java.util.Scanner;

public class GuessGame{
    public static void main(String[] args){
        Random randomObj = new Random();
        int correct_value = randomObj.nextInt(10);

        int count_chance = 5;
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Guess Game");
        System.out.println("Guess a number between 0 and 10!!!");

        while(count_chance > 0){
            System.out.println("Your Guess: ");
            int user_guess = inputObj.nextInt();
            if(user_guess<correct_value){
                System.out.println("Your guess is low, guess higher.");
                count_chance--;
            }else if(user_guess>correct_value){
                System.out.println("Your guess is high, guess lower.");
                count_chance--;
            }else{
                System.out.println("You guessed it correct.");
                count_chance = 0;
            }
        }

    }
}