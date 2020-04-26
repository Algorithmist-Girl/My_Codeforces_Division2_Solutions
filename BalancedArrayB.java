import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BalancedArrayB {

    private static int t;

    public static ArrayList<Integer> compute(int totalLen) {
        int halfLen = totalLen / 2;
        ArrayList<Integer> print = new ArrayList<>();
        for (int i = 1; i <= halfLen; i++) {
            print.add(2 * i);
        }
        int start = 1;
        for (int i = 0; i < halfLen; i++) {
            if (i != halfLen - 1)
                print.add(start + (2 * i));
            else
                print.add((start + (2 * i)) + halfLen);
        }
        return print;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            int num = sc.nextInt();
            if ((num / 2) % 2 == 1)
                out.println("NO");
            else {
                out.println("YES");
                ArrayList<Integer> print = compute(num);
                for (int x = 0; x < print.size(); x++)
                    out.print(print.get(x) + " ");
                if (i != t - 1)
                    out.println();
            }
        }
        out.close();
    }
}
