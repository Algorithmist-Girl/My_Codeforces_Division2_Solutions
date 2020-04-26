import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class sum_of_odd_integers {

    private static int N;

    public static boolean checkPerfectSquare(double x) {

        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args) throws IOException {
        // MATH RULE=HAS TO BE PERFECT SQUARE TO REPRESENT AS SUM OF ODD NUMBERS OR ODD NUMBER ITSELF
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String newString = sc.nextLine();
            int numOne = sc.nextInt();
            int numTwo = sc.nextInt();
            if ((numOne % 2) == 1 && numTwo == 1)
                System.out.println("YES");
            else if (checkPerfectSquare(numOne) && numTwo == Math.sqrt(numOne))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        out.close();

    }
}
