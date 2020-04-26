import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedAdjacentDifferencesB {

    private static int t;
    private static ArrayList<Integer> list;
    private static int n;

    public static void compute(ArrayList<Integer> temp) {
        Collections.sort(temp);

        ArrayList<Integer> print = new ArrayList<>();
        if (temp.size() % 2 == 1) {
            print.add(temp.get(temp.size() / 2));
            int lower = temp.size() / 2 - 1;
            int upper = temp.size() / 2 + 1;
            while (print.size() != temp.size()) {
                print.add(temp.get(lower));
                print.add(temp.get(upper));
                lower--;
                upper++;
            }

        } else {
            int lower = temp.size() / 2 - 1;
            int upper = temp.size() / 2;
            while (print.size() != temp.size()) {
                print.add(temp.get(lower));
                print.add(temp.get(upper));
                lower -= 1;
                upper += 1;
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            temp.set(i, print.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            n = sc.nextInt();
            list = new ArrayList<>();
            sc.nextLine();

            for (int x = 0; x < n; x++) {
                list.add(sc.nextInt());
            }
            compute(list);
            for (int a = 0; a < list.size(); a++)
                out.print(list.get(a) + " ");
            out.println();
        }
        out.close();
    }
}
