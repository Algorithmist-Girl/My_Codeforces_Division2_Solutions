import java.io.PrintWriter;
import java.util.Scanner;

public class SoldierAndBananasA {

    private static int N, K, W;

    public static int compute() {
        int numNeeded = 0;
        for (int i = 1; i <= W; i++) {
            numNeeded += (i * N);
        }
        return numNeeded - K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        K = sc.nextInt();
        W = sc.nextInt();
        int answer = compute();
        if (answer < 0)
            out.println(0);
        else
            out.println(answer);
        out.close();
    }
}
