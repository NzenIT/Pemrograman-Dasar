import java.util.*;

public class BankXYZ {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<Integer> nik = new ArrayList<>();
    static ArrayList<Integer> saldo = new ArrayList<>();

    public static void main(String[] args) {
        int opsi;

        do {
            System.out.println("\n=== PERBANKAN XYZ ===");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Update Saldo");
            System.out.println("3. Blokir Nasabah");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            opsi = sc.nextInt();

            switch (opsi) {
                case 1:
                    inputNasabah();
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
                    out();
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (true);
    }

    public static void inputNasabah() {
        System.out.print("Jumlah nasabah : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nNasabah ke-" + (i + 1));

            System.out.print("Nama  : ");
            nama.add(sc.nextLine());

            System.out.print("NIK   : ");
            nik.add(sc.nextInt());

            System.out.print("Saldo : ");
            saldo.add(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("Nasabah berhasil ditambahkan.");
    }

    public static void updateSaldo() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada data nasabah.");
            return;
        }

        tampilkanData();

        System.out.print("Pilih nomor nasabah : ");
        int pilih = sc.nextInt() - 1;

        if (pilih >= 0 && pilih < nama.size()) {
            System.out.print("Saldo baru : ");
            saldo.set(pilih, sc.nextInt());
            System.out.println("Saldo berhasil diperbarui.");
        } else {
            System.out.println("Nomor nasabah tidak valid.");
        }
    }

    public static void blokir() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada data nasabah.");
            return;
        }

        tampilkanData();

        System.out.print("Pilih nomor nasabah : ");
        int pilih = sc.nextInt() - 1;

        if (pilih >= 0 && pilih < nama.size()) {
            System.out.println("Nasabah " + nama.get(pilih) + " berhasil diblokir.");

            nama.remove(pilih);
            nik.remove(pilih);
            saldo.remove(pilih);
        } else {
            System.out.println("Nomor nasabah tidak valid.");
        }
    }

    public static void tampilkanData() {
        if (nama.isEmpty()) {
            System.out.println("Data nasabah kosong.");
            return;
        }

        System.out.println("\n=== DAFTAR NASABAH ===");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println((i + 1) + ". " + nama.get(i)
                    + " | " + nik.get(i)
                    + " | " + saldo.get(i));
        }
    }

    public static void out() {
        System.out.println("Terima kasih telah menggunakan Bank XYZ.");
    }
}