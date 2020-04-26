import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMathsA {

    private static ArrayList<Integer> list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        list = new ArrayList<>();
        String line = sc.next();
//        System.out.println/(line);
        for (int i = 0; i < line.length(); i++) {
            char currChar = line.charAt(i);
            if (currChar == '1')
                list.add(1);
            else if (currChar == '2')
                list.add(2);
            else if (currChar == '3')
                list.add(3);
            else if (currChar == '4')
                list.add(4);
            else if (currChar == '5')
                list.add(5);
            else if (currChar == '6')
                list.add(6);
            else if (currChar == '7')
                list.add(7);
            else if (currChar == '8')
                list.add(8);
            else if (currChar == '9')
                list.add(9);
            else if (currChar == '0')
                list.add(0);
        }
        Collections.sort(list);

        if (list.size() == 1)
            out.println(list.get(0));
        else {
            String print = "";
            for (int i = 0; i < list.size(); i++) {
                print += list.get(i) + "";
                if (i != list.size() - 1)
                    print += "+";
            }
            out.println(print);

        }

        out.close();

    }
}
