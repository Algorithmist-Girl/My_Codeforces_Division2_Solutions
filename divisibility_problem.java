import java.io.PrintWriter;
import java.util.Scanner;

public class divisibility_problem {

    private static int N;

    public static int compute(int one, int two) {
        int ct = 0;
        while (one % two != 0) {
            one++;
            ct++;
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            int numOne = sc.nextInt();
            int numTwo = sc.nextInt();
//            out.println(compute(numOne, numTwo));
            if (numOne % numTwo != 0)
                out.println(numTwo - (numOne % numTwo));
            else
                out.println(0);
        }


        out.close();
    }
}
