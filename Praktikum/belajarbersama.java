import java.util.ArrayList;
import java.util.Scanner;

public class belajarbersama {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Nasabah> nasabahList = new ArrayList<>();

    static class Nasabah {
        String nama;
        String nik;
        int saldo;
        boolean aktif;

        Nasabah(String nama, String nik, int saldo, boolean aktif) {
            this.nama = nama;
            this.nik = nik;
            this.saldo = saldo;
            this.aktif = aktif;
        }
    }

    static void tambahNasabah() {
        System.out.println("\n=== Tambah Nasabah ===");
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIK: ");
        String nik = input.nextLine();

        System.out.print("Saldo awal: ");
        int saldo = input.nextInt();
        input.nextLine();

        nasabahList.add(new Nasabah(nama, nik, saldo, true));
        System.out.println("Data nasabah berhasil ditambahkan.\n");
    }

    static void updateSaldoNasabah() {
        System.out.println("\n=== Update Saldo Nasabah ===");
        if (nasabahList.isEmpty()) {
            System.out.println("Belum ada data nasabah.\n");
            return;
        }

        System.out.print("Masukkan NIK nasabah: ");
        String nik = input.nextLine();
        int index = cariIndexNasabah(nik);

        if (index == -1) {
            System.out.println("Nasabah dengan NIK tersebut tidak ditemukan.\n");
            return;
        }

        System.out.print("Masukkan saldo baru: ");
        int saldoBaru = input.nextInt();
        input.nextLine();

        Nasabah data = nasabahList.get(index);
        data.saldo = saldoBaru;
        nasabahList.set(index, data);
        System.out.println("Saldo nasabah berhasil diperbarui.\n");
    }

    static void blokirAkunNasabah() {
        System.out.println("\n=== Blokir Akun Nasabah ===");
        if (nasabahList.isEmpty()) {
            System.out.println("Belum ada data nasabah.\n");
            return;
        }

        System.out.print("Masukkan NIK nasabah: ");
        String nik = input.nextLine();
        int index = cariIndexNasabah(nik);

        if (index == -1) {
            System.out.println("Nasabah dengan NIK tersebut tidak ditemukan.\n");
            return;
        }

        nasabahList.remove(index);
        System.out.println("Akun nasabah berhasil diblokir dan dihapus dari daftar.\n");
    }

    static void tampilkanSeluruhDataNasabah() {
        System.out.println("\n=== Data Seluruh Nasabah ===");
        if (nasabahList.isEmpty()) {
            System.out.println("Belum ada data nasabah.\n");
            return;
        }

        for (int i = 0; i < nasabahList.size(); i++) {
            Nasabah data = nasabahList.get(i);
            System.out.println("Nasabah " + (i + 1));
            System.out.println("Nama : " + data.nama);
            System.out.println("NIK  : " + data.nik);
            System.out.println("Saldo: " + data.saldo);
            System.out.println("Status: " + (data.aktif ? "Aktif" : "Diblokir"));
            System.out.println();
        }
    }

    static int cariIndexNasabah(String nik) {
        for (int i = 0; i < nasabahList.size(); i++) {
            if (nasabahList.get(i).nik.equalsIgnoreCase(nik)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String pilihan;

        do {
            System.out.println("\n=== Program Perbankan ===");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Update Saldo Nasabah");
            System.out.println("3. Blokir Akun Nasabah");
            System.out.println("4. Tampilkan Seluruh Data Nasabah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    tambahNasabah();
                    break;
                case "2":
                    updateSaldoNasabah();
                    break;
                case "3":
                    blokirAkunNasabah();
                    break;
                case "4":
                    tampilkanSeluruhDataNasabah();
                    break;
                case "5":
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.\n");
            }
        } while (!pilihan.equals("5"));
    }
}
