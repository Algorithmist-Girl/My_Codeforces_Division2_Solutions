import java.io.PrintWriter;
import java.util.Scanner;

public class LuckyDivisionA {

    private static int N;

    public static boolean isLuckyNumber(int num) {
        String NUMBER = Integer.toString(num);
//        System.out.println(NUMBER);
        for (int i = 0; i < NUMBER.length(); i++) {
//            System.out.println(NUMBER.substring(i, i + 1).equals("4"));
            if (!NUMBER.substring(i, i + 1).equals("4") && !NUMBER.substring(i, i + 1).equals("7"))
                return false;
        }
        return true;
    }

    public static boolean isLuckyDivisble() {
        for (int i = 1; i <= N; i++) {
            if (N % i == 0 && isLuckyNumber(i))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

//        System.out.println(isLuckyNumber(467));
        N = sc.nextInt();
        if (isLuckyDivisble())
            out.println("YES");
        else
            out.println("NO");

        out.close();
    }
}
