import java.util.Scanner;

public class SINAU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Hitung luas persegi");
            System.out.println("2. Hitung luas lingkaran");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi persegi: ");
                    double sisi = input.nextDouble();
                    double luasPersegi = sisi * sisi;
                    System.out.println("Luas persegi: " + luasPersegi);
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double r = input.nextDouble();
                    double luasLingkaran = Math.PI * r * r;
                    System.out.println("Luas lingkaran: " + luasLingkaran);
                    break;
                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);
        input.close();
    }
}
