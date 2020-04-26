import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WayTooLongWordsA {

    private static int N;
    private static ArrayList<String> list;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            sc.nextLine();
            String nextString = sc.next();
            list.add(nextString);
        }

        for (int i = 0; i < list.size(); i++) {
            String nextString = list.get(i);
            if (nextString.length() > 10) {
                out.println(nextString.charAt(0) + "" + (nextString.length() - 2) + "" + nextString.charAt(nextString.length() - 1));
            } else
                out.println(nextString);
        }
        out.close();

    }
}
