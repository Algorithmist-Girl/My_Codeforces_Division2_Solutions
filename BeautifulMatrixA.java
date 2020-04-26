import java.io.PrintWriter;
import java.util.Scanner;

public class BeautifulMatrixA {

    private static int currX;
    private static int currY;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                String currCharacter = sc.next();
                if (currCharacter.equals("1")) {
                    currX = j;
                    currY = i;
                    break;
                }
            }
            sc.nextLine();
        }

        out.print(Math.abs(2 - currX) + Math.abs(2 - currY));

        out.close();
    }
}
