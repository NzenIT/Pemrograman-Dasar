import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Double> nilai = new ArrayList<>();

    //Procedure input
    static void inputNilai() {
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
    //Pakai For Loop
    for (int i = 0; i < jumlah; i++) {
        System.out.print("Input nilai mahasiswa ke-" + (i+1) + " : ");
        //Menambahan nilai ke dalam ArrayList --> add()
        nilai.add(input.nextDouble());
        
     }
    }

    //Fungsi 1 : Hitung total nilai
    static double hitungTotal() {
        //Hitung total nilai mahasiswa
        double total = 0.0;

        //For each dipakai mengulang data dari array.list, disimpan dalam variable
        //bisa digunakan untuk mengambil semua data arraylist
        for (double nilaimhs : nilai) { 
            total += nilaimhs; //total = total + nilaimhs1 dst
           
        }
        return total;
    }
    //Fungsi 2 : Hitung rata-rata nilai > total / jumlah data
    static double hitungRatanilai() {
        double rata = hitungTotal() / nilai.size(); //size() untuk menghitung jumlah data di arraylist
        return rata;
        
    }
    //Procedure output
    static void outputNilai() { 
        //Ada 2 Metode untuk menampilkan output ada Horizontal dan vertikal
        //kalau mau cetak array nya horizntal -> 80,90,70 dst
        System.out.println("-------------------------------");
        //System.out.println("Daftar nilai mahasiswa : " + nilai);
        //System.out.println("Rata-rata nilai : " + hitungRatanilai());
        
        //kalau mau cetak vertikal -> pakai bisa for each / fori
        for (int i = 0; i < nilai.size(); i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " : " + nilai.get(i));
        }
        System.out.println("Rata-rata nilai : " + hitungRatanilai());
    }
        


    public static void main(String[] args) {
        
        inputNilai();
        outputNilai();
    }
}
