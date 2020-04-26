import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DreamoonA {

    public static int t, n, a;
    public static boolean[] fill;
    private static ArrayList<Integer> output;


    public static void print() {
        for (int i = 0; i < fill.length; i++)
            System.out.print(i + " " + fill[i] + " ");
    }

    public static int compute() {
//        if (fill[0])
//            print();
        int ct = 0;
        int aCounter = 0;
        while (aCounter != a) {
            if (!fill[ct]) {
                fill[ct] = true;
                aCounter++;
            }
            ct++;
        }
//        System.out.println("CT = " + ct + " " + fill[ct]);

        int starting = ct;
        for (int i = starting; i < fill.length; i++) {
            if (fill[i]) {
                ct++;
            } else
                break;
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();
        output = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            n = sc.nextInt();
//            System.out.println(n);
            a = sc.nextInt();
            sc.nextLine();
            fill = new boolean[202];
            for (int j = 0; j < n; j++) {
                int curr = sc.nextInt();
                fill[curr - 1] = true;
            }
            output.add(compute());
//            System.out.println(i);
        }

        for (int i = 0; i < output.size(); i++)
            out.println(output.get(i));

        out.close();
    }
}
