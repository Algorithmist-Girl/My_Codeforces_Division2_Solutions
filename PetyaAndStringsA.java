import java.io.PrintWriter;
import java.util.Scanner;

public class PetyaAndStringsA {
    private static String A, B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        A = sc.next();
        sc.nextLine();
        B = sc.next();

        A = A.toLowerCase();
        B = B.toLowerCase();

        if (A.compareTo(B) == 0)
            out.println(0);
        else if (A.compareTo(B) > 0)
            out.println(1);
        else
            out.println(-1);
//        out.println(A.compareTo(B));
        out.close();
    }
}
