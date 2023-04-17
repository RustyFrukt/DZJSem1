import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        int n, sum = 0, multi = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
            multi *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d %n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d %n", n, multi);
        in.close();
    }
}