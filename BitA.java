import java.io.PrintWriter;
import java.util.Scanner;

public class BitA {

    private static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();

        int x = 0;
        for (int i = 0; i < N; i++) {
            sc.nextLine();
            String next = sc.next();
//            out.println(next);

            if (next.contains("++"))
                x += 1;
            else if (next.contains("--"))
                x -= 1;
        }
        out.println(x);
        out.close();

    }
}
