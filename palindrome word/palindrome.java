import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word to check :");
        // get word from user to check
        String text = input.nextLine();
        boolean ispalindrome = true;
        // check from index 0 to (text.length/2) because if in this form is ok therefor
        // already ok
        for (int i = 0; i < (text.length() / 2); i++) {
            // check not palindrome to break for no palindrome word
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                ispalindrome = false;
                break;
            }
        }
        // show the resault
        String resault = ispalindrome ? text + " is palindrome" : text + " isn't palindrome ";
        System.out.println(resault);
        input.close();
    }
}
