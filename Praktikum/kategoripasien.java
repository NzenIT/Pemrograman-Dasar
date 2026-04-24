import java.util.Scanner;
public class kategoripasien {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        /*Input >> Pasien menginput usia pasien, jika usia pasien kurang dari 18 tahun maka masuk ke dalam kategori anak-anak, 
        jika lebih dari atau sama dengan 18 tahun maka masuk ke dalam kategori dewasa, jika usia pasien sama dengan 0 maka pendaftaran ditutup
       */

        int usia;
        int jumlahPasien = 0;

        do {
            System.out.print("Masukkan usia pasien : "); //pasien menginput usia pasien, untuk memberhentikan proses input pasien, pasien harus menginput usia 0 (nol)
            usia = input.nextInt();
            
            //jika usia tidak sama dengan 0, maka akan masuk ke dalam kategori anak-anak atau dewasa
            if (usia != 0) {
                if (usia <= 18) {
                    System.out.println("Kategori : anak-anak");

                } else {
                    System.out.println("Kategori : Dewasa");
                }
                jumlahPasien++;
            }
        } while (usia != 0);

        //Output total pasien yang sudah terdaftar
        System.out.println(" ");
        System.out.println("--------------Pendaftaran Ditutup--------------");
        System.out.println("Total Pasien yang sudah terdaftar : " + jumlahPasien);

        input.close();
    }
}
