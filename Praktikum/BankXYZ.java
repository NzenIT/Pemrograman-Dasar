import java.util.ArrayList;
import java.util.Scanner;

public class BankXYZ {

    static Scanner input = new Scanner(System.in);

    // ArrayList untuk menyimpan data nasabah
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<String> nik = new ArrayList<>();
    static ArrayList<Double> saldo = new ArrayList<>();

    // PROCEDURE Tambah Nasabah
    static void tambahNasabah() {
        System.out.print("Masukkan Nama : ");
        String n = input.nextLine();

        System.out.print("Masukkan NIK  : ");
        String k = input.nextLine();

        System.out.print("Masukkan Saldo Awal : ");
        double s = input.nextDouble();
        input.nextLine();

        nama.add(n);
        nik.add(k);
        saldo.add(s);

        System.out.println("Data nasabah berhasil ditambahkan.");
    }

    // FUNCTION Cari Index Nasabah berdasarkan NIK
    static int cariNasabah(String cariNik) {
        for (int i = 0; i < nik.size(); i++) {
            if (nik.get(i).equals(cariNik)) {
                return i;
            }
        }
        return -1;
    }

    // PROCEDURE Update Saldo
    static void updateSaldo() {
        System.out.print("Masukkan NIK Nasabah : ");
        String cariNik = input.nextLine();

        int index = cariNasabah(cariNik);

        if (index != -1) {
            System.out.print("Masukkan Saldo Baru : ");
            double saldoBaru = input.nextDouble();
            input.nextLine();

            saldo.set(index, saldoBaru);

            System.out.println("Saldo berhasil diperbarui.");
        } else {
            System.out.println("Nasabah tidak ditemukan.");
        }
    }

    // PROCEDURE Blokir Akun
    static void blokirAkun() {
        System.out.print("Masukkan NIK Nasabah : ");
        String cariNik = input.nextLine();

        int index = cariNasabah(cariNik);

        if (index != -1) {
            nama.remove(index);
            nik.remove(index);
            saldo.remove(index);

            System.out.println("Akun berhasil diblokir.");
        } else {
            System.out.println("Nasabah tidak ditemukan.");
        }
    }

    // PROCEDURE Tampilkan Data
    static void tampilData() {
        if (nama.size() == 0) {
            System.out.println("Belum ada data nasabah.");
            return;
        }

        System.out.println("\n===== DATA NASABAH =====");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Nasabah ke-" + (i + 1));
            System.out.println("Nama  : " + nama.get(i));
            System.out.println("NIK   : " + nik.get(i));
            System.out.println("Saldo : Rp " + saldo.get(i));
            System.out.println("---------------------");
        }
    }

    // PROCEDURE Menu
    static void menu() {
        System.out.println("\n===== BANK XYZ =====");
        System.out.println("1. Tambah Nasabah");
        System.out.println("2. Update Saldo Nasabah");
        System.out.println("3. Blokir Akun Nasabah");
        System.out.println("4. Tampilkan Seluruh Data Nasabah");
        System.out.println("5. Keluar");
        System.out.print("Pilih Menu : ");
    }

    public static void main(String[] args) {

        int pilih;

        do {
            menu();
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambahNasabah();
                    break;

                case 2:
                    updateSaldo();
                    break;

                case 3:
                    blokirAkun();
                    break;

                case 4:
                    tampilData();
                    break;

                case 5:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 5);
    }
}