import java.util.Scanner;

public class apkkalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        int pilihan;

        System.out.println("=== Kalkulator Java Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        System.out.println("Pilih Operator:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan Operator (1-4): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hasil = penjumlahan(angka1, angka2);
                break;
            case 2:
                hasil = pengurangan(angka1, angka2);
                break;
            case 3:
                hasil = perkalian(angka1, angka2);
                break;
            case 4:
                hasil = pembagian(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

    }

    // Fungsi-fungsi (Methods) Kalkulator
    public static double penjumlahan(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil : " +  a + " + " + b + " = " + hasil);
        return hasil;
    }

    public static double pengurangan(double a, double b) {
        double hasil = a - b;
        System.out.println("Hasil : " + a + " - " + b + " = " + hasil);  
        return hasil;
    }

    public static double perkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil : " + a + " * " + b + " = " + hasil);
        return hasil;
    }

    public static double pembagian(double a, double b) {
        double hasil = a / b;
        System.out.println("Hasil : " + a + " / " + b + " = " + hasil) ;
        return hasil;
    }
}
