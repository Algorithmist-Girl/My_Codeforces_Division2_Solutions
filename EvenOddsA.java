import java.io.PrintWriter;
import java.util.Scanner;

public class EvenOddsA {

    private static int n, k;

    public static int compute() {
        int startingOdd = 1;
        int ct = 1;

        if (n % 2 == 1) {
            while (startingOdd <= n) {
                if (ct == k)
                    return startingOdd;
                if (startingOdd + 2 <= n) {
                    startingOdd += 2;
                    ct++;
                    if (ct == k)
                        return startingOdd;
                } else
                    break;

//                System.out.println(startingOdd);
            }
        } else {
            while (startingOdd < n) {
                if (ct == k)
                    return startingOdd;
                if (startingOdd + 2 < n) {
                    startingOdd += 2;
                    ct++;
                    if (ct == k)
                        return startingOdd;
                } else
                    break;
            }
        }


        int remaining = k - ct;
        return (2 * remaining);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();
        k = sc.nextInt();

        out.println(compute());
        out.close();
    }
}
