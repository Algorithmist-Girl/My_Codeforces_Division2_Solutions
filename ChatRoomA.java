import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatRoomA {

    private static String input;
    private static ArrayList<Integer> hIndices, eIndices, lIndices, oIndices;

    public static int isValidCharacter(ArrayList<Integer> one, ArrayList<Integer> two) {
        int ct = 0;
        boolean flag;
        for (int i = 0; i < two.size(); i++) {
            int greaterOne = two.get(i);
            flag = false;
            for (int j = 0; j < one.size(); j++) {
                if (greaterOne > one.get(j))
                    flag = true;
            }
            if (flag)
                ct++;
        }
        return ct;
    }

    public static int isValidCharacter2(ArrayList<Integer> one, ArrayList<Integer> two) {
        int ct = 0;
        for (int i = 0; i < two.size(); i++) {
            int greaterOne = two.get(i);
            for (int j = 0; j < one.size(); j++) {
                if (greaterOne > one.get(j))
                    ct++;
            }
        }
        return ct;
    }

    public static boolean compute() {
        if (hIndices.size() == 0 || eIndices.size() == 0 || lIndices.size() <= 1 || oIndices.size() == 0)
            return false;

        if (isValidCharacter(hIndices, eIndices) >= 1) {
            if (isValidCharacter(eIndices, lIndices) >= 2) {
                if (isValidCharacter2(lIndices, oIndices) >= 2)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        input = sc.next();
//        System.out.println(input);
        hIndices = new ArrayList<>();
        eIndices = new ArrayList<>();
        lIndices = new ArrayList<>();
        oIndices = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals("h"))
                hIndices.add(i);
            else if (input.substring(i, i + 1).equals("e"))
                eIndices.add(i);
            else if (input.substring(i, i + 1).equals("l"))
                lIndices.add(i);
            else if (input.substring(i, i + 1).equals("o"))
                oIndices.add(i);
        }
//        System.out.println(input.indexOf("hello"));
//        System.out.println(hIndices);
        if (compute())
            System.out.println("YES");
        else
            System.out.println("NO");
        out.close();
    }
}
