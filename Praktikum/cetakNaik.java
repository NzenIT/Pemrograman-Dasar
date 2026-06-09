public class cetakNaik {

    public static void cetakNaik(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Rekursif
        cetakNaik(n - 1);
         System.out.println(n);
    }

    public static void main(String[] args) {
        cetakNaik(5);
    }
}
