
import java.util.*;

public class latihan11 {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<Integer> noKamar = new ArrayList<>();
    static ArrayList<Integer> lama = new ArrayList<>();
    
    public static void tambahTamu() {
        System.out.print("Masukkan jumlah tamu : ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nTamu ke- " + (i+1));

            System.out.print("Nama : ");
            nama.add(input.nextLine());

            System.out.print("Nomor kamar : ");
            noKamar.add(input.nextInt());

            System.out.print("Lama menginap : ");
            lama.add(input.nextInt());
            input.nextLine();
            
        }
        System.out.println("Tamu telah ditambahkan");
    }
    
    public static void showData() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada tamu yang terdaftar");
            input.nextLine();
        }

        System.out.println("\n---DAFTAR NAMA TAMU---");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Tamu ke- " + (i+1));
            System.out.println("Nama        : " + nama.get(i));
            System.out.println("No Kamar    : " + noKamar.get(i));
            System.out.println("Lama inap   : " + lama.get(i) + " Hari");
            System.out.println("--------------------------");
        }
    }

    public static void updateLama() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada tamu yang terdaftar");
            input.nextLine();
        }
        showData();
    
        System.out.print("Pilih tamu ke berapa : ");
        int pilih = input.nextInt() -1 ;

        if(pilih >= 0 && pilih < nama.size()) {
            System.out.print("Masukkan tambahan waktu inap : ") ;
            int tambah = input.nextInt();
            lama.set(pilih, lama.get(pilih) + tambah);
        }
        System.out.println("Lama waktu inap telah ditambahkan");
    }

    public static void checkOut() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada tamu yang terdaftar");
            input.nextLine();
        }
        showData();
        
        System.out.print("Pilih tamu ke berapa : ");
        int pilih = input.nextInt() -1;

        if(pilih >= 0 && pilih < nama.size()) {
            nama.remove(pilih);
            noKamar.remove(pilih);
            lama.remove(pilih);
            
        }
        System.out.println("Tamu telah CheckOut");
    }

    public static void keluar() {
        System.out.println("Terima kasih sudah menggunakan layanan kami");
        System.exit(0);
    }

    public static void main(String[] args) {
        int menu;
        
        do {
            System.out.println("\n---Menu Reservasi Hotel---");
            System.out.println("1. Tambah tamu");
            System.out.println("2. Update lama menginap");
            System.out.println("3. Checkout Tamu");
            System.out.println("4. Tampilkan data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5) : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    tambahTamu();
                    break;
                
                case 2:
                    updateLama();
                    break;

                case 3:
                    checkOut();
                    break;
                case 4: 
                    showData();
                    break;
                
                case 5: 
                    keluar();
                    break;
            default:
                System.out.println("Menu tidak ada");

            }

        }while (true);
    }
}
