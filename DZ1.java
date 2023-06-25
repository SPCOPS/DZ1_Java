import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ1 {
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        long sumN = 0;
        long multN = 1;

        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
            multN = multN * i;
        }

        System.out.println("Сумма n натуральных чисел: " + sumN);
        System.out.println("Произведение n натуральных чисел: " + multN);
// 2) Вывести все простые числа от 1 до 1000
        for (int j = 2; j <= 1000; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(j + " ");
            }
        }
// 3) Реализовать простой калькулятор
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while (!str.toLowerCase().equals("нет")) {
            System.out.println("Введите число: ");
            int rez = Integer.parseInt(reader.readLine());
            System.out.println("Введите операцию: ");
            String c = reader.readLine();
            System.out.println("Введите следующее число: ");
            int y = Integer.parseInt(reader.readLine());
            if (c.equals("+")) {
                rez = rez + y;
            }
            else if (c.equals("-")) {
                rez = rez - y;
            }
            else if (c.equals("/")) {
                rez = rez / y;
            }
            else if (c.equals("*")) {
                rez = rez * y;
            }

            System.out.println("Ответ: "+ rez);
            rez = 0;
            break;
        }
    }
}