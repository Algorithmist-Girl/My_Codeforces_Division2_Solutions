import java.io.PrintWriter;
import java.util.Scanner;

public class KanaAndDragonQuestGameB {
    private static int t;

    public static boolean compute(int starting, int numAbsorptions, int numLightningStrikes) {
        // TRICK: PERFORM ALL OF THE ABSORPTIONS BEFORE THE LIGHTNING STRIKES BECAUSE ABSORPTIONS FIRST,
        //THEN LIGHTINING WILL YIELD A SMALLER VALUE, COMPARED WITH OTHER WAY AROUND

        int orig = starting;
        for (int i = 0; i < numAbsorptions; i++) {
            if (starting <= 0)
                return true;
            if ((starting / 2) + 10 > starting) // > or >=
                break;
            starting /= 2;
            starting += 10;
            if (starting <= 0)
                return true;
        }

        for (int i = 0; i < numLightningStrikes; i++) {
            if (starting <= 0)
                return true;
            starting -= 10;
            if (starting <= 0)
                return true;
        }

        if (starting <= 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        t = sc.nextInt();

        int starting, numAbsorptions, numLightningStrikes;
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            starting = sc.nextInt();
            numAbsorptions = sc.nextInt();
            numLightningStrikes = sc.nextInt();
            if (compute(starting, numAbsorptions, numLightningStrikes)) {
                out.println("YES");
            } else
                out.println("NO");
        }


        out.close();
    }
}
