import java.io.PrintWriter;
import java.util.Scanner;

public class TramA {

    private static int N;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        int currNumberInTrain = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            sc.nextLine();
            int numLeaving = sc.nextInt();
            int numComing = sc.nextInt();
            currNumberInTrain -= numLeaving;
            currNumberInTrain += numComing;
            max = Math.max(currNumberInTrain, max);
        }

        out.println(max);
        out.close();
    }
}
