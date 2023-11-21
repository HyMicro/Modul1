
import java.util.Scanner;

public class ComplexExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan daftar angka yang dipisahkan oleh spasi: ");
        String input = scanner.nextLine();

        try {
            String[] angkaStr = input.split(" ");
            double total = 0.0;
            double jumlahAngka = 0;

            for (String angka : angkaStr) {
                double angkaDouble = Double.parseDouble(angka);
                total += angkaDouble;
                jumlahAngka++;
            }

            if (jumlahAngka == 0) {
                System.out.println("Tidak ada angka yang dimasukkan.");
            } else {
                double rataRata = total / jumlahAngka;
                System.out.println("Rata-rata: " + rataRata);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Harap masukkan angka yang valid.");
        } catch (ArithmeticException e) {
            System.out.println("Pembagian oleh nol terjadi.");
        }

        scanner.close();
    }
}