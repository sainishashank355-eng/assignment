import java.util.Scanner;
public class TriangleRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double distance = 5000; 
        double rounds = distance / perimeter;
        System.out.println("The athlete must complete " + rounds + " rounds.");
    }
}