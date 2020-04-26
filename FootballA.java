import java.io.PrintWriter;
import java.util.Scanner;

public class FootballA {

    private static String input;

    public static boolean compute() {
        int ct = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                ct++;
                if (ct >= 7)
                    return true;
            } else
                ct = 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        input = sc.next();

        if (input.length() < 7)
            out.println("NO");

        else {
            if (compute())
                out.println("YES");
            else out.println("NO");
        }

        out.close();
    }
}
