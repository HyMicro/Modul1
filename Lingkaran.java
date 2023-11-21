public class Lingkaran {

    private static final double PI = 3.14;

    public static double hitungLuas(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius harus bernilai positif");
        }
        return PI * radius * radius;
    }

    public void testLuasDenganRadiusPositif() {
        double radius = 5;
        double expectedLuas = 78.5; // PI * radius * radius
        double actualLuas = Lingkaran.hitungLuas(radius);
        System.out.println("Expected Luas: " + expectedLuas);
        System.out.println("Actual Luas: " + actualLuas);
        if (actualLuas >= expectedLuas - 0.01 && actualLuas <= expectedLuas + 0.01) {
            System.out.println("Test Passed: Luas berada di range");
        } else {
            System.out.println("Test Failed: Luas tidak berada di range");
        }
    }

    public void testLuasDenganRadiusNegatif() {
        double radius = -3;
        try {
            Lingkaran.hitungLuas(radius); // Harus melempar IllegalArgumentException
            System.out.println("Test Failed: No exception thrown for negative radius.");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Passed: Exception thrown for negative radius.");
        }
    }

    public void testLuasDenganRadiusNol() {
        double radius = 0;
        try {
            Lingkaran.hitungLuas(radius); // Harus melempar IllegalArgumentException
            System.out.println("Test Failed: No exception thrown for zero radius.");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Passed: Exception thrown for zero radius.");
        }
    }

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Testing Lingkaran class methods:");
        System.out.println("Test 1:");
        lingkaran.testLuasDenganRadiusPositif();
        System.out.println("Test 2:");
        lingkaran.testLuasDenganRadiusNegatif();
        System.out.println("Test 3:");
        lingkaran.testLuasDenganRadiusNol();
    }
}