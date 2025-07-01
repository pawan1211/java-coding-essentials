
import java.util.*;

public class Problem2 {
    public static List<Integer> oddSeries(int a) {
        List<Integer> result = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < a; i++) {
            result.add(num);
            num += 2;
        }
        return result;
    }

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	  int a=sc.nextInt();
        System.out.println(oddSeries(a));
    }
}
