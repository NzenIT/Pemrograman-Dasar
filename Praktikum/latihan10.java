/*
    Soal Perbankan 
    1. tambah nasabah
    2. update saldo
    3. blokir akun nasabah
    4. tampilkan data nasabah
    5. keluar

    step 1 : deklarasi arraylist dan scanner
    step 2 : buat menu perbankan pakai do while dan swtich case
    step 3 : buat function dan prosedur untuk setiap menu
    step 4 : panggil function dan prosedur di dalam switch case
    
    */


import java.util.*;

public class latihan10 {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<Integer> nik = new ArrayList<>();
    static ArrayList<Integer> saldo = new ArrayList<>();

    public static void tambahNasabah() {
        System.out.print("Masukkan jumlah nasabah : ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama nasabah ke-" + (i+1) + " : ");
            nama.add(input.nextLine());
            
            System.out.print("Masukkan NIK : ");
            nik.add(input.nextInt());
            input.nextLine(); // Consume the newline character

            System.out.print("Masukkan Saldo : ");
            saldo.add(input.nextInt());
            input.nextLine();

        }
            System.out.println("\n----Nasabah telah ditambahkan----");
    }

    public static void tampilkanData() {
        if (nama.isEmpty()) {
            System.out.println("----Belum ada nasabah----");
        }
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("\n|Daftar Nasabah yang terdaftar|");
            System.out.println("Nasabah ke- " + (i + 1));
            System.out.println("Nama    : " + nama.get(i));
            System.out.println("NIK     : " + nik.get(i));
            System.out.println("Saldo   : " + saldo.get(i));
            System.out.println("|=============================|");
            
        }
    }

    public static void updateSaldo() {
        if (nama.isEmpty()) {
            System.out.println("----Belum ada nasabah----");
        }
        tampilkanData();
        System.out.print("Pilih nasabah ke : ");
        int pilih = input.nextInt();

        if (pilih >= 1 && pilih <= nama.size()) {
            System.out.print("Masukkan saldo baru : ");
            int saldoBaru = input.nextInt();
            saldo.set(pilih -1, saldoBaru);
            
        }
    }

    public static void blokir() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada nasabah");
        }
        tampilkanData();
        System.out.print("Pilih nasabah ke berapa yang ingin diblokir : ");
        int pilih = input.nextInt() - 1;
        nama.remove(pilih);
        nik.remove(pilih);
        saldo.remove(pilih);
        System.out.println("Nasabah telah diblokir");

    }

    public static void keluar() {
        System.out.println("Terima kasih telah menggunakan layanan kami");
        System.exit(0);
    }

   public static void main(String[] args) {
        int menu;
    do {
        System.out.println("\nPERBANKAN XYZ");
        System.out.println("=== Pilih Menu ===");
        System.out.println("1. Tambah Nasabah");
        System.out.println("2. Update saldo");
        System.out.println("3. Blokir nasabah");
        System.out.println("4. Tampilkan seluruh data nasabah");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu ke : ");
        menu = input.nextInt();


        switch (menu) {
            case 1: 
                tambahNasabah();
                break;

            case 2:
                updateSaldo();
                break;

            case 3:
                blokir();
                break;

            case 4:
                tampilkanData();  
                break;

            case 5:
                keluar();
                break;

            default:
                System.out.println("Menu Tidak Tersedia");
        }

     } while (true);

   }

}
