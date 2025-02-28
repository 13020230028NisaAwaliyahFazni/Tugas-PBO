public class Oprator {
    public static void main(String[] args) {
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        System.out.println("=== Operasi Logika ===");
        Bool1 = true;
        Bool2 = false;
        System.out.println("Bool1 && Bool2 = " + (Bool1 && Bool2));
        System.out.println("Bool1 || Bool2 = " + (Bool1 || Bool2));
        System.out.println("!Bool1 = " + (!Bool1));
        System.out.println("Bool1 ^ Bool2 = " + (Bool1 ^ Bool2));

        System.out.println("\n=== Operasi Aritmatika pada Integer ===");
        i = 5;
        j = 2;
        System.out.println("i + j = " + (i + j));
        System.out.println("i - j = " + (i - j));
        System.out.println("i / j = " + (i / j)); // Integer division
        System.out.println("i * j = " + (i * j));
        System.out.println("i % j = " + (i % j));

        System.out.println("\n=== Operasi Aritmatika pada Float ===");
        x = 5;
        y = 5;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x * y = " + (x * y));

        System.out.println("\n=== Operasi Perbandingan ===");
        System.out.println("i == j = " + (i == j));
        System.out.println("i != j = " + (i != j));
        System.out.println("i < j = " + (i < j));
        System.out.println("i > j = " + (i > j));
        System.out.println("i <= j = " + (i <= j));
        System.out.println("i >= j = " + (i >= j));

        System.out.println("\n=== Operasi Perbandingan Float ===");
        System.out.println("x != y = " + (x != y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x > y = " + (x > y));
        System.out.println("x <= y = " + (x <= y));
        System.out.println("x >= y = " + (x >= y));
    }
}
