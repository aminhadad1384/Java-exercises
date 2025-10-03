import java.util.Scanner;

public class calculate_the_areas {
    public static void main(String[] args) {
        System.out.println("select your Desired shape: \n 1:rectangle\n 2:square\n 3:circle");
        Scanner input = new Scanner(System.in);
        // get number of the shape from the user in order
        int Shape_number = input.nextInt();
        switch (Shape_number) {
            case 1:
                // rectangle
                System.out.println("enter Width and length in order :");
                int Width = input.nextInt();
                int length = input.nextInt();
                System.out.println(
                        "Area of a rectangle with length " + length + " and width " + Width + ":" + length * Width);
                break;
            case 2:
                // square
                System.out.println("enter length of square :");
                int length_square = input.nextInt();
                System.out.println(
                        "Area of a square with length " + length_square + " : " + Math.pow(length_square, 2));
                break;
            case 3:
                // circle
                System.out.println("enter the radious of the circle :");
                int radius = input.nextInt();
                System.out
                        .println("Area of a circle with radius " + radius + " : " + (Math.pow(radius, 2) * Math.PI));
                break;
            default:
                // unknown value
                System.out.println("unknown shape number !!!");
                break;
        }
        System.out.println("have a good time");
        input.close();
    }
}
