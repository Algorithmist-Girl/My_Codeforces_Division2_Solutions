import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirlA {

    private static HashSet<Character> uniqueChar;
    private static String input;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        input = sc.next();
        uniqueChar = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            uniqueChar.add(input.charAt(i));
        }

        if (uniqueChar.size() % 2 == 0)
            out.println("CHAT WITH HER!");
        else
            out.println("IGNORE HIM!");

        out.close();
    }
}
