import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        // TODO: Use a do...while loop to read guesses until correct
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
        int rand = new Random().nextInt(100);
        int guess;
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Guessing Game!\nI'm thinking of a number between 1 and 100.\n");
        do {
            System.out.print("\nEnter your guess: ");
            guess = scan.nextInt();

            if(guess > rand) System.out.println("Too high! Try again.");
            if(guess < rand) System.out.println("Too low! Try again.");

        } while(guess != rand);
        System.out.println("You got it!");
    }
}
