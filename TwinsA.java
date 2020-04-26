import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// SORT THE LIST IN DESCENDING ORDER
// DECIDE IF NEED ONE COIN : 1ST ONE OK? 2 COINS ==> 1ST 2 OK?
public class TwinsA {
    private static int N;
    private static ArrayList<Integer> list;
    private static int totalSum;

    public static boolean satisfies(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += list.get(i);
        }
        return (sum > (totalSum - sum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        list = new ArrayList<>();
        sc.nextLine();
        totalSum = 0;
        for (int i = 0; i < N; i++) {
            int curr = sc.nextInt();
            list.add(curr);
            totalSum += curr;
        }

        Collections.sort(list, Collections.reverseOrder());
//        System.out.println(list);
//        Collections.reverseOrder();
        for (int i = 0; i < list.size(); i++) {
            if (satisfies(i)) {
                out.print(i + 1);
                break;
            }
        }

        out.close();
    }
}
