import java.util.Scanner;

public class NilaiAkhir {

    static Scanner input = new Scanner(System.in);

    // Variabel Global
    static String[] komponen = {
        "Tugas", "Kuis", "Praktikum",
        "Kolaboratif", "Inovatif",
        "UTS", "UAS"
    };

    static double[] bobot = {
        0.15, 0.05, 0.20,
        0.10, 0.10,
        0.20, 0.20
    };

    static double[] nilai = new double[7];

    static void inputNilai() {
        for(int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai " + komponen[i] + " : ");
            nilai[i] = input.nextDouble();
        }
    }

    static double hitungNilai() {
        double total = 0;

        for(int i = 0; i < nilai.length; i++) {
            total += nilai[i] * bobot[i];
        }

        return total;
    }

    static char nilaiHuruf(double na) {
        if(na >= 85)
            return 'A';
        else if(na >= 70)
            return 'B';
        else if(na >= 60)
            return 'C';
        else if(na >= 50)
            return 'D';
        else
            return 'E';
    }

    public static void main(String[] args) {

        inputNilai();

        double na = hitungNilai();

        System.out.println("------------------------------");
        System.out.println("Nilai Akhir : " + na);
        System.out.println("Nilai Huruf : " + nilaiHuruf(na));
    }
}