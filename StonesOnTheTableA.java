import java.io.PrintWriter;
import java.util.Scanner;

public class StonesOnTheTableA {

    private static int N;
    private static String input;

    public static int compute() {
        // get length of each run
        int ct = 0;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                ct++;
            }
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        input = sc.next();

        out.println(compute());
        out.close();
    }
}
