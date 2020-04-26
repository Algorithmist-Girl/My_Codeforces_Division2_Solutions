import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class wrong_subtraction {

    private static int startingNum, K;

    public static boolean endsInZero(int num) {
        return (num % 10 == 0);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        startingNum = sc.nextInt();
        K = sc.nextInt();

        int currNum = startingNum;
        for (int i = 0; i < K; i++) {
            if (endsInZero(currNum))
                currNum = currNum / 10;
            else
                currNum -= 1;
        }

        out.println(currNum);

        out.close();

    }
}
