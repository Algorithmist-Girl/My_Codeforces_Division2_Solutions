import java.io.PrintWriter;
import java.util.Scanner;

public class exercisingWalk {
    private static int t;
    private static int a, b, c, d;
    private static int x, y, x1, x2, y1, y2;

    public static boolean compute() {

        // OR STATEMENT AT END COVERS THE 3RD CASE IN EXAMPLE!!!
        if (x - a + b >= x1 && x - a + b <= x2 && ((x1 < x2) || (a + b == 0))) // IF X1=X2, A+B MUST BE = 0
            if (y - c + d >= y1 && y - c + d <= y2 && ((y1 < y2) || (c + d == 0)))
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            sc.nextLine();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            sc.nextLine();
            x = sc.nextInt();
            y = sc.nextInt();
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            if (compute())
                out.println("Yes");
            else
                out.println("No");
        }

        out.close();
    }
}
