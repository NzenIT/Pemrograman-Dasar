import java.util.Scanner;

public class Praktikum3 {

    static Scanner in = new Scanner(System.in);
    static int batas, r;

    static double luas() {
        r = (int)(Math.random() * batas) + 1;
        return Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args) {

        System.out.print("Masukkan Batas Random = ");
        batas = in.nextInt();

        double luas = luas();

        System.out.println("------------------------");
        System.out.println("\nr = " + r);
        System.out.println("Luas Lingkaran = " + luas);
    }
}