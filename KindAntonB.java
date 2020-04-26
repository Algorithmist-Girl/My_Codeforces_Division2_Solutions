import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class KindAntonB {

    private static int t;

//    public static boolean containsSmallerBefore(ArrayList<Integer> a, int index) {
//        for (int i = 0; i < index; i++) {
//            if (a.get(i) == -1)
//                return true;
//        }
//        return false;
//    }
//
//    public static boolean containsLargerBefore(ArrayList<Integer> a, int index) {
//        for (int i = 0; i < index; i++) {
//            if (a.get(i) == 1)
//                return true;
//        }
//        return false;
//    }

    public static boolean compute(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashSet<Integer> storeNums = new HashSet<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > B.get(i)) {
                if (!storeNums.contains(-1)) {
                    return false;
                }
            } else if (A.get(i) < B.get(i)) {
                if (!storeNums.contains(1))
                    return false;
            }
            storeNums.add(A.get(i));
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            int size = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int x = 0; x < size; x++) {
                a.add(sc.nextInt());
            }
            sc.nextLine();
            for (int x = 0; x < size; x++) {
                b.add(sc.nextInt());
            }

            if (compute(a, b))
                out.println("YES");
            else out.println("NO");
        }
        out.close();
    }
}
