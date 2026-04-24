import java.util.Scanner;

public class perulangan3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan ganjil : ");
        int batas = input.nextInt();

        // Baris 1 (atas)
        for (int a = 1; a <= batas; a++) {
            System.out.print(a);
        }

        System.out.println();

        // Hitung posisi tengah
        int tengah = (batas + 1) / 2;

        // Baris 2 (ke bawah & rata tengah)
        for (int a = 1; a <= batas; a++) {

            // spasi biar ke tengah
            for (int i = 1; i < tengah; i++) {
                System.out.print(" ");
            }

            System.out.println(a);
        }

        // Baris 3 (bawah)
        for (int a = 1; a <= batas; a++) {
            System.out.print(a);
        }

        input.close();
    }
}