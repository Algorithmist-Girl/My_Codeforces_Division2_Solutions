import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingSubsequenceC {

    private static int t;
    private static ArrayList<ArrayList<Integer>> subsequences;

    public static void printAllSubSequences(int[] arrInput) {
        int[] temp = new int[arrInput.length];
        int index = 0;
        solve(arrInput, index, temp);
    }

    private static void solve(int[] arrInput, int index, int[] temp) {
        if (index == arrInput.length) {
            ArrayList<Integer> hi = new ArrayList<>();
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] == 1)
                    hi.add(arrInput[i]);
            }
            subsequences.add(hi);

            return;
        }
        temp[index] = 1;
        solve(arrInput, index + 1, temp);
        temp[index] = 0;
        solve(arrInput, index + 1, temp);
    }

    public static boolean checkAlternating(ArrayList<Integer> input) {
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) > 0 && input.get(i - 1) > 0) return false;
            else if (input.get(i) < 0 && input.get(i - 1) < 0) return false;

        }
        return true;
    }

    public static long sum(int index) {
        long sum = 0;
        ArrayList<Integer> curr = subsequences.get(index);
        for (int i = 0; i < curr.size(); i++)
            sum += curr.get(i);
        return sum;
    }

    public static long compute(int[] input) {
        printAllSubSequences(input);
        int maxSize = Integer.MIN_VALUE;
        int maxIndex = -1;
        long maxSum = Long.MIN_VALUE;
//        System.out.println("SIZE = " + subsequences.size());
        for (int i = 0; i < subsequences.size(); i++) {
            ArrayList<Integer> currSeq = subsequences.get(i);
//            System.out.println(currSeq + " " + checkAlternating(currSeq));

            if (checkAlternating(currSeq)) {
                if (maxSize <= currSeq.size()) {
//                    System.out.println(currSeq);
                    maxSize = currSeq.size();
                    maxIndex = i;
                    if (maxSum <= sum(i))
                        maxSum = sum(i);
//                    System.out.println("SUM = " + sum(0));
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();
//        subsequences = new ArrayList<>();

//        int[] arrInput = {1, 2, 3, -1, -2};
//        printAllSubSequences(arrInput);
//        System.out.println(subsequences);
//        int[] input = new int[5];
//        input[0] = 1;
//        input[1] = 2;
//        input[2] = 3;
//        input[3] = -1;
//        input[4] = -2;
//        printAllSubSequences(input);
//        System.out.println(subsequences);

        for (int i = 0; i < t; i++) {
            subsequences = new ArrayList<>();

            sc.nextLine();
            int size = sc.nextInt();
            sc.nextLine();

            int[] input = new int[size];
            for (int x = 0; x < size; x++) {
                input[x] = sc.nextInt();
            }
            out.println(compute(input));
        }

        out.close();
    }
}
