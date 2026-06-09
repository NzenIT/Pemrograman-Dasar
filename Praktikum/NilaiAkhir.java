import java.util.Scanner;

public class NilaiAkhir {

    static Scanner in = new Scanner(System.in);

    static void inputNilai(double[] nilai, String[] komponen) {
        for(int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai " + komponen[i] + " : ");
            nilai[i] = in.nextDouble();
        }
    }

    static double hitungNilai(double[] nilai) {
        double[] bobot = {0.15,0.05,0.20,0.10,0.10,0.20,0.20};
        double total = 0;

        for(int i = 0; i < nilai.length; i++)
            total += nilai[i] * bobot[i];

        return total;
    }

    static char nilaiHuruf(double na) {

        if (na >= 85)
            return 'A';
        else if (na >= 70)
            return 'B';
        else if (na >= 60)
            return 'C';
        else if (na >= 50)
            return 'D';
        else
            return 'E';
    }  
    
    public static void main(String[] args) { //Blok main untuk menjalankan program
         String[] komponen = {
            "Tugas", "Kuis", "Praktikum",
            "Kolaboratif", "Inovatif",
            "UTS", "UAS"
        };
        double[] nilai = new double[7]; //karena ada 7 nilai yang akan diinput jadi array nya diisi 7

        inputNilai(nilai,komponen);

        double na = hitungNilai(nilai);
        System.out.println("Nilai Akhir : " + na);
        System.out.println("Nilai Huruf : " + nilaiHuruf(na));
    
    }
}
