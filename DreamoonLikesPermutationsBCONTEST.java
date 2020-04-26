import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DreamoonLikesPermutationsBCONTEST {

    private static int t, n;
    private static ArrayList<Integer> input;

    public static boolean isPermutation(int splitIndex) {

        int len1 = splitIndex + 1;
        int len2 = input.size() - len1;

        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 0; i < len1; i++) {
            test.add(input.get(i));
        }

        for (int i = 1; i <= len1; i++)
            if (!test.contains(i))
                return false;

        test = new ArrayList<>();
        for (int i = len1; i < input.size(); i++) {
            test.add(input.get(i));
        }

        for (int i = 1; i <= len2; i++)
            if (!test.contains(i))
                return false;
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            n = sc.nextInt();
            input = new ArrayList<>();
            for (int j = 0; j < n; j++)
                input.add(sc.nextInt());

            int ct = 0;
            for (int k = 0; k < input.size(); k++) {
                if (isPermutation(k))
                    ct++;
            }
            out.println(ct);
            for (int k = 0; k < input.size(); k++) {
                if (isPermutation(k))
                    out.println(k + 1 + " " + (input.size() - k - 1));

            }

        }

        out.close();
    }
}
