public class ChapterThreeTest {
    public static void main(String[] args) {
        String a = "Apple";
        int b = 20;

        printStrings(a, b);
    }

    public static void printStrings(String c, int d) {
        for(int i = 0; i <= d; i++) {
            System.out.print(c + "\n");
        }
    }
}