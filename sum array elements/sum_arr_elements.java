import java.util.Scanner;

public class sum_arr_elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length of the array : ");
        int arr_length = input.nextInt();
        int sum = 0;
        int[] numbers = new int[arr_length];
        for (int i = 0; i < arr_length; i++) {
            System.out.println("element number " + (i + 1) + " : ");
            try {
                numbers[i] = input.nextInt();
            } catch (Exception e) {
                System.out.println("error : " + e);
            }
            sum += numbers[i];
        }
        System.out.println("sumation of elements of array : " + sum);
        input.close();
    }
}