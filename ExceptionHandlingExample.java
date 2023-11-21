import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        System.out.println("Masukkan sebuah angka :");
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println("Anda memasukkan angka: " + number);

            scanner.close();
        } catch (Exception e) // Excaption e buat global
        {
            System.out.println("Input bukan angka!");
        }

    }
}