import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write first parameter");
        int parameter1 = input.nextInt();
        System.out.println("choose the operator \" + - * / \" ");
        input.nextLine();
        String operator = input.nextLine();
        System.out.println("enter second parameter :");
        int parameter2 = input.nextInt();
        switch (operator) {
            case "+":
                System.out.println(parameter1 + " + " + parameter2 + " = " + (parameter1 + parameter2));
                break;
            case "-":
                System.out.println(parameter1 + " - " + parameter2 + " = " + (parameter1 - parameter2));
                break;
            case "*":
                System.out.println(parameter1 + " * " + parameter2 + " = " + (parameter1 * parameter2));
                break;
            case "/":
                try {
                    System.out.println(parameter1 + " / " + parameter2 + " = " + (parameter1 / parameter2));
                    break;
                } catch (Exception e) {
                    System.out.println("you have an error !! " + e + " please try again ");
                    break;
                }
            default:
                System.out.println("Undefined operator !!");
                break;
        }
    }
}
