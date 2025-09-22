import java.util.Scanner;
public class AnagramCheck {
    public static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) return false;
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < text1.length(); i++) freq1[text1.charAt(i)]++;
        for (int i = 0; i < text2.length(); i++) freq2[text2.charAt(i)]++;
        for (int i = 0; i < 256; i++) if (freq1[i] != freq2[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        System.out.println(isAnagram(text1, text2));
    }
}