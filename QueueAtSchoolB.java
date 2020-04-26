import java.io.PrintWriter;
import java.util.Scanner;

public class QueueAtSchoolB {

    private static int n, t;
    private static String[] arr;

    public static int getNextGIndex(int index) {
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i].equals("G"))
                return i;
        }
        return -1;
    }

    public static void compute() {

        for (int x = 1; x <= t; x++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("B") && i != arr.length - 1) {
                    if (arr[i + 1].equals("G")) {
                        arr[i] = "G";
                        arr[i + 1] = "B";
                        i++;
                    }
                }
            }
        }

//        int ct = 0;
//        int index = 0;
//        while (ct <= t) {
//            while (ct <= t + 1) {
//                if (arr[index].equals("B")) {
//                    ct++;
//                    if (index == arr.length - 1)
//                        break;
//                    else {
//                        if (arr[index + 1].equals("G")) {
//                            arr[index] = "G";
//                            arr[index + 1] = "B";
//                        }
//                    }
//                    ct++;
//                }
//                index++;
//            }
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();
        t = sc.nextInt();
        arr = new String[n];

        String next = sc.next();
        for (int i = 0; i < next.length(); i++) {
            arr[i] = next.substring(i, i + 1);
        }


        sc.nextLine();

        compute();
        for (int i = 0; i < arr.length; i++)
            out.print(arr[i]);

        out.close();
    }

}
