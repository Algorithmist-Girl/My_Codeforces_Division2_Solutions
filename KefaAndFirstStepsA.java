import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class KefaAndFirstStepsA {

    private static int n;
    private static ArrayList<Integer> input;

    public static int longestNonDecreasing() {
        int lengthLongest = 1;
        int absoluteLongest = 1;
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i + 1) >= input.get(i)) {
                lengthLongest++;
            } else {
                absoluteLongest = Math.max(lengthLongest, absoluteLongest);
                lengthLongest = 1;
            }
        }
        absoluteLongest = Math.max(absoluteLongest, lengthLongest);
        return absoluteLongest;
    }

//    public static int lengthLongestNonDecreasing(int startIndex) {
//        int ct = 1;
//        for (int i = startIndex + 1; i < input.size(); i++) {
//            if (input.get(i) < input.get(i - 1))
//                break;
//            else
//                ct++;
//        }
//        return ct;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();
        sc.nextLine();
        input = new ArrayList<>();
        for (int i = 0; i < n; i++)
            input.add(sc.nextInt());

//        int max = 1;
//        for (int i = 0; i < input.size(); i++) {
//            max = Math.max(max, lengthLongestNonDecreasing(i));
////            System.out.println(i + " " + lengthLongestNonDecreasing(i));
//        }; i < input.size(); i++) {
//            max = Math.max(max, lengthLongestNonDecreasing(i));
////            System.out.println(i + " " + lengthLongestNonDecreasing(i));
//        }
        out.println(longestNonDecreasing());
        out.close();
    }
}
