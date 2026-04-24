import java.util.Scanner;
public class tiketZoo {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //deklarasi variabel
    String[] kategori = new String[0];
    int[] harga = new int[0];
    int[] jumlahBeli = new int[0];  
    int total = 0, jmltiket=0, menu=0, jumlahData=0;

    do {
        System.out.println("");
        System.out.println("-----Pemesanan Tiket Surabaya Zoo-----");
        System.out.println("1. Silahkan Input Kategori dan harga");
        System.out.println("2. Silahkan Input jumlah beli");
        System.out.println("3. Hitung Total");
        System.out.println("4. Keluar program");
        System.out.print("Pilih menu : ");
        menu = input.nextInt();
        System.out.println("");

        switch (menu) {
            case 1:
                // Menu 1 >> Input Kategori dan harga bebas

                System.out.print("Masukkan jumlah tiket : ");
                jumlahData = input.nextInt();

                input.nextLine();
                
                //deklarasi ulang array 
                kategori = new String[jumlahData];
                harga = new int[jumlahData];

                //input & output array menggunakan loop (for)
                //indeks array dimulai dari 0 termasuk didalam loop

                for (int i = 0; i < kategori.length; i++) {
                    System.out.print("Masukkan kategori : ");
                    kategori[i] = input.nextLine();
                    System.out.print("Masukkan harga : ");
                    harga[i] = input.nextInt();
                    input.nextLine();
                    System.out.println(); 
                }
                /*
                kategori[0] = Zoo only
                kategori[1] = Zoo + Aquarium
                kategori[2] = Zoo + Aquarium + Funland

                harga[0] = 30000
                harga[1] = 50000
                harga[2] = 70000
                 */
                //output 
                for (int i = 0; i < kategori.length; i++) {
                    System.out.println("Kategori ke-" + (i+1) + " : " + kategori[i]); 
                    System.out.println("Harga : " + harga[i]);
            
                }
                break;

            case 2:
                // Menu 2 >> Input jumlah beli untuk setiap kategori yang sudah diinputkan sebelumnya
                
                     if (jumlahData == 0) {
                    System.out.println("Silakan input kategori dan harga terlebih dahulu.");
                    } else {
                    jumlahBeli = new int[jumlahData];

                    for (int i = 0; i < jumlahData; i++) {
                        System.out.print("Jumlah beli untuk " + kategori[i] + " : ");
                        jumlahBeli[i] = input.nextInt();
                    }
                }

                break;

            case 3:
                // Menu 3 >> Hitung total yang harus dibayar dan jumlah tiket yang dibeli

                if (jumlahData == 0 || jumlahBeli.length == 0) {
                    System.out.println("Silakan input kategori, harga, dan jumlah beli terlebih dahulu.");
                } else {
                    total = 0;
                    jmltiket = 0;
                    for (int i = 0; i < jumlahData; i++) {
                        total += harga[i] * jumlahBeli[i];
                        jmltiket += jumlahBeli[i];
                    }
                    System.out.println("Total yang harus dibayar : " + total);
                    System.out.println("Jumlah tiket yang dibeli : " + jmltiket);
                }
                
                
            case 4:
                // Menu 4 >> Untuk keluar program

                System.out.println("---------------------------------------------");
                System.out.println("Terima kasih telah menggunakan layanan kami.");
                System.exit(0);

                //jika user memasukkan menu yang salah maka akan muncul pesan error
            default:
                System.out.println("Mohon maaf, Menu yang anda masukkan tidak valid.");
        }
    } while (true);
 }
    
}