import java.io.PrintWriter;
import java.util.Scanner;

public class DominoPilingA {

    private static int M, N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        M = sc.nextInt();
        N = sc.nextInt();

        if ((M * N) % 2 == 0)
            out.println((M * N) / 2);
        else {
            out.println(((M * N) - 1) / 2);
        }
        out.close();
    }
}
