import java.io.PrintWriter;
import java.util.Scanner;

public class TeamA {
    private static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        int ct = 0;
        for (int i = 0; i < N; i++) {
            sc.nextLine();
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            if (p == 1 && v == 1 && t == 1)
                ct++;
            else if (p == 1 && v == 1)
                ct++;
            else if (p == 1 && t == 1)
                ct++;
            else if (v == 1 & t == 1)
                ct++;
        }

        out.println(ct);
        out.close();

    }
}
