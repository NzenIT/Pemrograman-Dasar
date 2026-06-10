import java.util.Scanner;

public class Praktikum3{

    // Variabel Global
    static Scanner input = new Scanner(System.in);
    static int batasRandom, r;
    static double luasLingkaran;

    // Prosedur input
    static void inputData() {
        System.out.print("Masukkan Batas Random = ");
        batasRandom = input.nextInt();
    }

    // Fungsi generate random
    static int randomR() {
        return (int)(Math.random() * batasRandom) + 1;
    }

    // Fungsi hitung luas lingkaran
    static double hitungLuas(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    // Prosedur output
    static void tampilHasil() {
        System.out.println("------------------------");
        System.out.println();
        System.out.println("r = " + r);
        System.out.println("Luas Lingkaran = " + luasLingkaran);
    }

    public static void main(String[] args) {

        inputData();

        r = randomR();

        luasLingkaran = hitungLuas(r);

        tampilHasil();
    }
}