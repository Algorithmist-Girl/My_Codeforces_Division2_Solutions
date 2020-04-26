import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class YoungPhysicistA {

    private static int N;
    private static int X, Y, Z;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            sc.nextLine();
            X += sc.nextInt();
            Y += sc.nextInt();
            Z += sc.nextInt();
        }
        if (X == 0 && Y == 0 && Z == 0)
            out.println("YES");
        else out.println("NO");

        out.close();
    }
}
