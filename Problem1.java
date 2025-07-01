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
            System.out.println( result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}







