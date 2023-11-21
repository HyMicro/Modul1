public class LogicErrorExample {
    public static void main(String[] args) {

        System.out.println(factorial(5)); // Seharusnya menghasilkan 120
    }

    public static int factorial(int n) {

        int result = n;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }
}
