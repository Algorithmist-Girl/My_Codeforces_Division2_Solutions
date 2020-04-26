import java.io.PrintWriter;
import java.util.Scanner;

public class TranslationA {

    private static String input, reverse;

    public static boolean check() {
        for (int i = 0; i < input.length(); i++) {
            if (reverse.charAt((reverse.length() - 1) - i) != input.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        input = sc.next();
        sc.nextLine();
        reverse = sc.next();

        if (check())
            out.println("YES");
        else out.println("NO");

        out.close();
    }
}
