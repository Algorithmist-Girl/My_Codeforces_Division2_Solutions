import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// APPROACH: sort bases in inc order of defensive strength. then compute prefix sum of gold.
// FINALLY, for each ship, perform binary search over prefix sum and bases arrays to compute how much gold it would steal

public class DocMeetsVader {

    private static int s, b;
    private static ArrayList<Base> basesDefensivePower;
    private static ArrayList<Integer> shipsAttackingPower;
//    private static ArrayList<Integer> prefixSumGold;


    public static int binarySearchModified(int lower, int upper, int queriedNumber) {
        int mid = lower + (upper - lower) / 2;
        if (lower <= upper) {
            if (basesDefensivePower.get(mid).getPower() == queriedNumber)
                return mid;

            if (basesDefensivePower.get(mid).getPower() > queriedNumber) {
                return binarySearchModified(lower, mid - 1, queriedNumber);
            }

            return binarySearchModified(mid + 1, upper, queriedNumber);
        }
        return upper;
    }


    public static void main(String[] DEEPANSHA_IS_THE_BEST) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        basesDefensivePower = new ArrayList<>();
        shipsAttackingPower = new ArrayList<>();
//        prefixSumGold = new ArrayList<>();

        s = sc.nextInt();
        b = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < s; i++) {
            shipsAttackingPower.add(sc.nextInt());
        }

        for (int i = 0; i < b; i++) {
            sc.nextLine();
            basesDefensivePower.add(new Base(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(basesDefensivePower);

        // prefix sum time!
//        prefixSumGold.add(basesDefensivePower.get(0).getGold());
        for (int i = 1; i < basesDefensivePower.size(); i++) {
//            prefixSumGold.add(basesDefensivePower.get(i).getGold() + prefixSumGold.get(i - 1));
            basesDefensivePower.set(i, new Base(basesDefensivePower.get(i).getPower(), basesDefensivePower.get(i).getGold() + basesDefensivePower.get(i - 1).getGold()));
        }

        // BINARY SEARCH FOR EACH SHIP
        for (int i = 0; i < shipsAttackingPower.size(); i++) {
            int shipIndex = binarySearchModified(0, basesDefensivePower.size() - 1, shipsAttackingPower.get(i));
            int amtGold = basesDefensivePower.get(shipIndex).getGold();

            if (i != shipsAttackingPower.size() - 1)
                out.print(amtGold + " ");
            else
                out.println(amtGold);
        }


        out.close();
    }

}

class Base implements Comparable<Base> {
    int p, g;

    Base(int power, int gold) {
        p = power;
        g = gold;
    }

    public int getPower() {
        return p;
    }

    public int getGold() {
        return g;
    }

    @Override
    public int compareTo(Base o) {
        return getPower() - o.getPower();
    }
}
