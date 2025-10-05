import java.util.Scanner;

public class fiboo {
    // Inverse Fibonacci function
    public static int fibonat(int number) {
        if (number == 0 || number == 1)
            return number;
        return fibonat(number - 1) + fibonat(number - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // recive a number from user
        System.out.println("please enter a number :");
        int number = input.nextInt();
        // show the resault
        System.out.println("number " + number + " of fibonacci series is " + fibonat(number));
        input.close();
    }
}
