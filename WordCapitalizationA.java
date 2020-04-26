import java.io.PrintWriter;
import java.util.Scanner;

public class WordCapitalizationA {

    private static String input;
    private static String restOfInput;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        input = sc.next();
        restOfInput = input.substring(1);
        input = input.toUpperCase();
        input = input.charAt(0) + restOfInput;

        out.println(input);
        out.close();
    }
}
