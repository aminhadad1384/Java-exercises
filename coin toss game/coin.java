import java.util.Random;
import java.util.Scanner;

public class coin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand_coin = new Random();
        // select choices of the game
        String[] tossses = { "heads", "tails" };
        // select an item by computer
        String coin_toss = tossses[rand_coin.nextInt(tossses.length)];
        System.out.println("let's play :\"heads\"or \"tails\" ");
        // user guess
        String guess_by_user = input.nextLine();
        // try and catch for invalid items
        try {
            // right guess
            if (guess_by_user.equals(coin_toss))
                System.out.println("you won the coin : " + coin_toss);
            // wrong guess
            else if (!guess_by_user.equals(coin_toss) && (guess_by_user.equals("heads")
                    || guess_by_user.equals("tails")))
                System.out.println("you lose the coin : " + coin_toss);
            else
                // invalid string guess
                System.out.println("invalid guess !!");
        } catch (Exception e) {
            System.out.println("invalid guess");
        }
    }
}
