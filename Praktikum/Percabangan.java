import java.util.InputMismatchException;
import java.util.Scanner;

public class Percabangan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Masukkan input variabel nama, no meja, total, jumlah pesan, jenis pesanan(Dine in/Take away)
       String namaPemesan = "";
       String noMeja = "", jenisPesanan = "";
       int jumlahPesan = 0, total = 0, harga = 0;


       //Teks input , \n untuk fungsi enter
       System.out.print("Nama Pemesan : ");
       namaPemesan = input.nextLine();
       
       //input menu pesanan
       System.out.println("--Menu Mie Wacoan--");
       System.out.println("1. Mie Gacoan");
       System.out.println("2. Mie Hompimpa");
       System.out.println("3. Mie Suit");
       System.out.println("4. Dimsum");
       System.out.println("5. Aneka Minuman");
       System.out.print("Pilih Menu : ");
       int pilih = input.nextInt();
       input.nextLine();
      
       //cek kondisi dgn integer
       if (pilih == 1 || pilih == 2) {
        System.out.print("Pilih level (1-8) : ");
        String level = input.nextLine();
        harga = 13000;
        System.out.print("Jumlah pesan : ");
        jumlahPesan = input.nextInt();
       
       } else {
        System.out.print("Nama pesanan : ");
        String pesanan = input.nextLine();
       }
        


       System.out.println("Jenis Pesanan : \n 1. Dine In \n 2. Take Away");
       System.out.print("Pilih jenis pesanan : ");
       jenisPesanan = input.nextLine();


       //cek string --> equals / equalsIgnoreCase
       //equals = case sensitif memperhatikan besar kecil huruf
       //equalsIgnoreCase = case non sensitif / kebalikan dari equals
       if (jenisPesanan.equalsIgnoreCase("Dine In")) { // input= dine-in
            System.out.print("No meja : ");
            noMeja = input.nextLine();
            total = harga * jumlahPesan;
            System.out.print("Total " + total);

       } else {
            System.out.println("---Take Away---");
            total = (harga * jumlahPesan) + 2000;
            System.out.print("Total " + total);
       }
       
       
    


       
        
        

        
        input.close();
    }
}
