import java.util.Scanner;

public class Prosedur2 {
    static Scanner input = new Scanner(System.in); //variabel global untuk scanner, agar bisa digunakan di semua blok kode

    static void inputData() {
        System.out.println("Masukkan namaBarang: ");
        String namaBarang = input.nextLine();
        System.out.println("Masukkan jumlahBarang : ");
        int jumlahBarang = input.nextInt();
        System.out.println("Masukkan hargaBarang : ");
        int hargaBarang = input.nextInt();

        hitungTotal(jumlahBarang, hargaBarang);
        outputData(namaBarang, jumlahBarang, hargaBarang);
    }
    
    //function untuk menghitung total pembayaran
    static int hitungTotal(int a, int b) {
        int HT = a * b;
        System.out.println("Total Pembayaran : " + HT);
        return HT;

    }
    
    //procedure untuk menampilkan data barang dan total pembayaran
    static void outputData(String A, int B, int C) {
        System.out.println("--------------------------------------");  
        System.out.println("Nama Barang : " + A);
        System.out.println("Jumlah Barang : " + B);
        System.out.println("Harga Barang : Rp." + C);
        hitungTotal(B,C); //memanggil function
    }
    public static void main(String[] args) {
        /* 
            1. Procedure InputData Penjualan dengan variabel namaBarang, jumlahBarang, hargaBarang
            2. Function hitungTotal dengan parameter harga dan jumlah bertipe int
            3. Procedure outputData untuk menampilkan data barang dan total pembayaran       
        */
        inputData();

        
    }
}
