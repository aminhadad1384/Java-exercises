import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HI enter the year number that you wanna know is leap year or no ");
        // get number of year
        int year = input.nextInt();
        // leap year condition
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
            System.out.println(year + " is leap year ");
        else
            System.out.println(year + " isn't leap year ");
    }
}
