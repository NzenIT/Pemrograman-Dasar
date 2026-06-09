import java.util.Scanner;

public class NilaiAkhir {
    //Pakai variabel global agar bisa dipakai di semua method
    static Scanner input = new Scanner(System.in);
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

    
    //Procedure untuk input nilai
    static void inputNilai() {
        for(int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai " + komponen[i] + " : ");
            nilai[i] = input.nextDouble();
        }
    }

    //Function untuk menghitung nilai akhir
    static double hitungNilai() {
        double total = 0;

        for(int i = 0; i < nilai.length; i++) {
            total += nilai[i] * bobot[i];
        }

        return total;
    }

    //Function untuk menghitung nilai huruf
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

        inputNilai(); // Memanggil procedure untuk input nilai

        double na = hitungNilai(); // Memanggil function untuk menghitung nilai akhir

        System.out.println("------------------------------");
        System.out.println("Nilai Akhir : " + na);
        System.out.println("Nilai Huruf : " + nilaiHuruf(na)); // Memanggil function untuk menghitung nilai huruf
    }
}