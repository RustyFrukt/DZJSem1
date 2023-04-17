import java.util.ArrayList;
import java.util.List;

public class t2 {
    public static void main(String[] args) {
        boolean flag;
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(i);
            }
        }
        System.out.printf("Список простых чисел от 1 до 1000: %s", result);
    }
}