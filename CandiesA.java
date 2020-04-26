import java.io.PrintWriter;
import java.util.Scanner;

public class CandiesA {

    private static int t;

    public static int compute(int input) {
        int starting = 3;
        if (input % starting == 0)
            return input / starting;
        int count = 0;
        while (input % starting != 0) {
            if (input % starting == 0)
                return input / starting;
            starting += Math.pow(2, 2 + count);
            count++;
            if (input % starting == 0)
                return input / starting;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            int input = sc.nextInt();
            out.println(compute(input));
        }

        out.close();
    }
}
