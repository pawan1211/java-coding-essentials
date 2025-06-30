
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

    public static List<Integer> generate(int a) {
        List<Integer> result = new ArrayList<>();
        int count = (a % 2 == 0) ? a - 1 : a;
        int odd = 1;
        for (int i = 0; i < count; i++) {
            result.add(odd);
            odd += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        List<Integer> series = generate(a);
        System.out.println(series);
    }
}
