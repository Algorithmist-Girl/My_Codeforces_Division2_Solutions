import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class watermelonA {

    private static int N;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        if (N % 2 == 0 && N != 2)   // CORNER CASE: N != 2
            out.println("YES");
        else
            out.println("NO");

        out.close();

    }
}
