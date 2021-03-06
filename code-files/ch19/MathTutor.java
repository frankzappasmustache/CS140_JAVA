import java.util.*;
import java.util.function.*;

public class MathTutor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveProblems(console, 3,
                     "+", (x, y) -> x + y);
    }

    public static void giveProblems(Scanner console, int numProblems,
                                    String text, IntBinaryOperator operator) {
        Random r = new Random();
        int numRight = 0;
        for (int i = 1; i <= numProblems; i++) {
            int x = r.nextInt(12) + 1;
            int y = r.nextInt(12) + 1;
            System.out.print(x + " " + text + " " + y + " = ");
            int answer = operator.applyAsInt(x, y);
            int response = console.nextInt();
            if (response == answer) {
                System.out.println("you got it right");
                numRight++;
            } else {
                System.out.println("incorrect...the answer was " + answer);
            }
        }
        System.out.println(numRight + " of " + numProblems + " correct");
        System.out.println();
    }
}