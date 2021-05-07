import java.util.Scanner;

public class IntegerReader {
    public static void main(String[] args) {
        int b = 0;
        readInt(b);
    }

    public static void readInt(int s) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        s = input.nextInt();
        System.out.println();
        System.out.println("Your number multiplied by two is: " + s * 2);
    }
}