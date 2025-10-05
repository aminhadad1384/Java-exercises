import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String exit = " ";
        // doing game until user dont say y(yes to exit)
        while (!exit.equals("y")) {
            // generate Random number
            Random rand_number = new Random();
            int random_number = rand_number.nextInt(100);
            // Creating a variable to count attempts(start with 1 to if user guess in first
            // time)
            int attempts = 1;
            System.out.println("guess a number between 0 to 100:");
            // recive number from user
            int guessed_by_user = input.nextInt();
            // doing game until user guess right !!
            while (guessed_by_user != random_number) {
                // The guessed number is larger.
                if (guessed_by_user > random_number)
                    System.out.println("you entered a larger number try again to say currect");
                // The guessed number is smaller.
                else
                    System.out.println("you entered a smaller number try again to say currect");
                // increase attempts and recive a number from user again
                attempts++;
                guessed_by_user = input.nextInt();
            }
            // user guess right
            System.out.println("Well done, you found the right number in " + attempts
                    + " attemps \n if you wanna exit please enter y in keyboard \n");
            // User comments about the end of the game
            exit = input.next();
        }
        input.close();
    }
}
