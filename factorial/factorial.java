import java.util.*;

public class factorial {
    // factoral metod
    public static int factorial_calculating(int number) {
        int resault = 1;
        for (int i = 1; i <= number; i++) {
            resault *= i;
        }
        return resault;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get number from user
        System.out.println("enter the number you want to claculate that factorial :");
        int number = input.nextInt();
        System.out.println(number + "! = " + factorial_calculating(number));
        input.close();
    }
}