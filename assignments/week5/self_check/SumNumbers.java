import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int low = 0;
        int high = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your low value: ");
        low = input.nextInt();

        System.out.println("Please enter your high value: ");
        high = input.nextInt();
        
        for(int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}