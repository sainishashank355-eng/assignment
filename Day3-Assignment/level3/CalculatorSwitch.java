import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0)
                    System.out.println("Result: " + (first / second));
                else
                    System.out.println("Division by zero error");
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
