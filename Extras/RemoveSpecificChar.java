import java.util.Scanner;
public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char rem = sc.next().charAt(0);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != rem) result += str.charAt(i);
        }
        System.out.println("Modified String: " + result);
    }
}