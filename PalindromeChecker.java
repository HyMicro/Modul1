import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau kalimat: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Ini adalah palindrome.");
        } else {
            System.out.println("Ini bukan palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Menghapus spasi, mengubah ke huruf kecil, dan menghapus tanda baca
        str = str.replaceAll("\\s+", "").toLowerCase().replaceAll("[^a-zA-Z]", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}