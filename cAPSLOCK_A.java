import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class cAPSLOCK_A {

    private static String input;
    private static ArrayList<Character> lowercase;
    private static ArrayList<Character> uppercase;

    public static boolean check() {
        for (int i = 1; i < input.length(); i++) {
            if (!uppercase.contains(input.charAt(i)))
                return false;
        }
        return true;
    }


    public static void changeProcessing() {
        if (input.length() == 1) {
            if (lowercase.contains(input.charAt(0)))
                input = input.toUpperCase();
        } else {
            if (check()) {
                String uppercase = input.toUpperCase();
                String lowercase = input.toLowerCase();
                input = uppercase.charAt(0) + lowercase.substring(1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        input = sc.next();
        lowercase = new ArrayList<>(Arrays.asList(
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        ));


        uppercase = new ArrayList<>(Arrays.asList(
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        ));

        changeProcessing();
        out.println(input);
        out.close();

    }
}
