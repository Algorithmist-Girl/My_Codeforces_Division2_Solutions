import java.io.PrintWriter;
import java.util.Scanner;

public class CalculatingFunctionA {

    private static int N;

    public static int compute() {
        int answer = 0;
//        for (int i = 1; i <= N; i++) {
//            if (i % 2 == 1) {
//                answer -= i;
//            } else {
//                answer += i;
//            }
//        }

        if (N == 1)
            answer = -1;
        else if (N == 2)
            answer = 1;
        else {

            int add = 2 + ((N - 3) / 2);
            if (N % 2 == 0)
                answer = add;
            else
                answer = add * -1;

        }

        return answer;
    }

    public static void main(String[] ARGS) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();

        out.println(compute());
        out.close();

    }
}
