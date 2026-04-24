import java.util.Scanner;

public class coba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usia;
        int jumlahPasien = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan usia pasien : ");
            usia = input.nextInt();
        
            if (usia <= 18) {
                System.out.println("Kategori : anak-anak");
            } else {
                System.out.println("Kategori : Dewasa");
            }
            jumlahPasien++;
        } 
        System.out.println("");
        System.out.println("----- Pendaftaran Ditutup -----");
        System.out.println("Total Pasien yang sudah terdaftar : " + jumlahPasien);

        input.close();
    }
}
