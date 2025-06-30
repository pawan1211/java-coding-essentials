import java.util.*;

public class Problem1 {

    public static double calculate(double a, double b, String op) {
        switch (op) {
            case "+":
            case "add": return a + b;
            case "-":
            case "sub": return a - b;
            case "*":
            case "mul": return a * b;
            case "/":
            case "div":
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default: throw new IllegalArgumentException("Unsupported operation: " + op);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();
        sc.close();

        try {
            double result = calculate(a, b, op);
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}




import java.util.*

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



import java.util.*;

public class Problem4 {
    public static Map<Integer, Integer> count(List<Integer> nums) {
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) counts.put(i, 0);
        for (int num : nums) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) counts.put(i, counts.get(i) + 1);
            }
        }
        return counts;
    }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	  
	  int n=sc.nextInt();
	  
        List<Integer> nums = new ArrayList<>();
		
        for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			nums.add(a);
		}
        System.out.println(count(nums));
    }
}