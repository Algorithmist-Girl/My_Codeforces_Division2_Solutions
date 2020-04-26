import java.util.ArrayList;
import java.util.Arrays;

public class GetLargestIntegerSmallerThanQueriedBS {

    private static ArrayList<Integer> list;

    public static int binarySearchModified(int lower, int upper, int queriedNumber) {
        int mid = lower + (upper - lower) / 2;
        if (lower <= upper) {
            if (list.get(mid) == queriedNumber)
                return mid;

            if (list.get(mid) > queriedNumber) {
                return binarySearchModified(lower, mid - 1, queriedNumber);
            }

            return binarySearchModified(mid + 1, upper, queriedNumber);
        }
        return upper;
    }


    public static void main(String[] args) {

        list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9));
        System.out.println(list.get(binarySearchModified(0, list.size() - 1, 6)));

    }
}
