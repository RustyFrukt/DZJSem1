import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        double num1, num2, res;
        char operation;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = in.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = in.nextDouble();
        System.out.print("Введите операцию(+, -, *, /): ");
        operation = in.next().charAt(0);
        switch (operation) {
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '*' -> res = num1 * num2;
            case '/' -> res = num1 / num2;
            default -> {
                System.out.printf("Операция %s не поддерживается", operation);
                return;
            }
        }
        System.out.printf("%s %s %s = %s", num1, operation, num2, res);
    }
}