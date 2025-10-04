import java.util.Scanner;

public class revert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HI!  enter the word you like to revert it : ");
        // get the word from the user
        String text = input.nextLine();
        // initial a reverted resault with String bulider its faster than make a string
        StringBuilder reverted_text = new StringBuilder();
        for (int index = text.length() - 1; index >= 0; index--) {
            // make reverrted text with index of text from back
            // (its faster than being String reverted text and say reverted text+=index in
            // fundamental od data)
            reverted_text.append(text.charAt(index));
        }
        // show reverted text
        System.out.println("rverted of \"" + text + "\" : " + "\"" + reverted_text + "\"");
        input.close();
    }
}
