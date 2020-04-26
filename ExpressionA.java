import java.io.PrintWriter;
import java.util.Scanner;

public class ExpressionA {

    private static int a, b, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        sc.nextLine();
        c = sc.nextInt();

        int max = Integer.MIN_VALUE;
        max = Math.max(max, (a + b + c));
        max = Math.max(max, (a * b * c));
        max = Math.max(max, ((a * b) + c));
        max = Math.max(max, (a + (b * c)));
        max = Math.max(max, (a * (b + c)));
        max = Math.max(max, ((a + b) * c));
        out.println(max);
        out.close();

    }
}
