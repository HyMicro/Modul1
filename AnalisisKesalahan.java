public class AnalisisKesalahan {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        float sum = 0;

        for (int i = 0; i < numbers.length; i++) { // kesalahan ada pada <=, karena proses tidak akan bisa berjalan
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("Rata - rata: " + average);
    }
}
