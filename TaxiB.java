import java.io.PrintWriter;
import java.util.Scanner;

public class TaxiB {

    private static int N;
    //    private static ArrayList<Integer> list;
    private static int numberCars;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        sc.nextLine();
        numberCars = 0;
        int num3s = 0, num2s = 0, num1s = 0;

//        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int curr = sc.nextInt();
            if (curr == 4)
                numberCars++;
            else {
                if (curr == 3)
                    num3s++;
                else if (curr == 2)
                    num2s++;
                else
                    num1s++;
            }
        }

        if (num3s == num1s) {
            numberCars += num3s;
            if (num2s % 2 == 0)
                numberCars += num2s / 2;
            else {
                numberCars += (num2s - 1) / 2;
                num2s = 1;
                numberCars += 1;
            }
        } else if (num3s > num1s) {
            numberCars += num1s;

            if (num2s % 2 == 0) {
                numberCars += num2s / 2;
                numberCars += (num3s - num1s);
            } else {
                numberCars += (num2s - 1) / 2;
                num2s = 1;
                numberCars += (num3s - num1s);
                numberCars += 1;
            }
        } else {
            numberCars += num3s;

            if (num2s % 2 == 0) {
                numberCars += num2s / 2;
                numberCars += num1s - num3s;
            } else {
                numberCars += (num2s - 1) / 2;
                num2s = 1;
                // FIGURE THIS ONE OUT ONCE BACK
                num1s -= num3s;
                if (num1s <= 2)
                    numberCars += 1;
                else {
                    numberCars += 1;
                    num1s -= 2;
                    numberCars += num1s / 4;
                    if (num1s % 4 > 0)
                        numberCars += 1;
                }

            }
        }
        // 1 3, 2 2
        // 1 1 1    1 1  2
        out.println(numberCars);

        out.close();
    }
}
