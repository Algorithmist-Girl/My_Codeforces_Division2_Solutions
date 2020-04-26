import java.io.PrintWriter;
import java.util.Scanner;

public class theatreSquareA {

    private static double n, m, a;

    public static int compute() {

        return (int) (Math.ceil(m / a) * Math.ceil(n / a));
//        int numSquaresHori = n / a;
//        int numSquaresVert = m / a;
//        int totalNumSquares = numSquaresHori * numSquaresVert;
//
//        if (n % a != 0 && m % a != 0) {
//            totalNumSquares += numSquaresHori + numSquaresVert + 1;
//        } else if (n % a != 0) {
//            totalNumSquares += numSquaresVert;
//        } else if (m % a != 0)
//            totalNumSquares += numSquaresHori;
//
//        return totalNumSquares;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextDouble();
        m = sc.nextDouble();
        a = sc.nextDouble();
        out.println(compute());
//X
        out.close();

    }
}
