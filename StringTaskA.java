import java.io.PrintWriter;
import java.util.Scanner;

public class StringTaskA {

    private static String input;

    private static boolean isVowel(char a) {
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'y');
    }

    public static String modify() {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (!isVowel(input.charAt(i))) {
                output += ".";
                output += input.charAt(i) + "";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        input = sc.next();
        input = input.toLowerCase();

        out.println(modify());
        out.close();
    }
}
