import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PuzzlesA {

    private static ArrayList<Integer> input;
    private static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();
        input = new ArrayList<>();
        for (int i = 0; i < m; i++)
            input.add(sc.nextInt());

        Collections.sort(input);
//        System.out.println(input);
        if ((m - n) % 2 == 0) {
            int distRemove = (m - n) / 2;
            out.println(input.get(input.size() - 1 - distRemove) - input.get(distRemove));
        } else {

            int totalDiff = (m - n - 1) / 2;
            int diff1 = input.get(input.size() - 1) - input.get(totalDiff + 1);
            int diff2 = input.get(input.size() - 1 - totalDiff - 1) - input.get(totalDiff);
            if (diff1 < diff2)
                out.println(diff1);
            else
                out.println(diff2);
        }

        out.close();

    }
}
