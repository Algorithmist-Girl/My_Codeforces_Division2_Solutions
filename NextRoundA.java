import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NextRoundA {
    private static int N, K;
    private static ArrayList<Integer> list;

    public static void main(String[] ARGS) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        K = sc.nextInt();

        sc.nextLine();
        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int number = list.get(K - 1);
        int ct = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= number && list.get(i) > 0)
                ct++;
        }
        out.println(ct);
        out.close();
    }
}
