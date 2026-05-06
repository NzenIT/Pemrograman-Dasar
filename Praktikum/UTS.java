import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //dekalarasi variabel
        String[] namaMahasiswa = new String[0]; 
        int [] jumlahPertemuan = new int[0];
        int totalKehadiran = 0, persentaseKehadiran = 0, menu = 0, totalpertemuan = 0;

        do {
            System.out.println("1. Input Nama Mahasiswa dan Jumlah Pertemuan");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Hitung Total Kehadiran dan Persentase");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    // Input nama mahasiswa dan jumlah pertemuan
                    System.out.println("Masukkan jumlah mahasiswa : ");
                    int jumlahMahasiswa = input.nextInt();
                    input.nextLine();

                    namaMahasiswa = new String[jumlahMahasiswa];
                    jumlahPertemuan = new int[jumlahMahasiswa];

                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + " : ");
                        namaMahasiswa[i] = input.nextLine();
                        System.out.print("Masukkan jumlah pertemuan untuk " + namaMahasiswa[i] + " : ");
                        jumlahPertemuan[i] = input.nextInt();
                        input.nextLine();
                    }   
                    break;
                case 2:
                    // Lihat data mahasiswa
                    System.out.println("Data Mahasiswa : ");
                    for (int i = 0; i < namaMahasiswa.length; i++) {
                        System.out.println("Nama: " + namaMahasiswa[i] + ", Jumlah Pertemuan: " + jumlahPertemuan[i]);
                    }
                    break;
                case 3:
                    // Hitung total kehadiran dan persentase
                    totalKehadiran = 0;
                    totalpertemuan = 0;
                    for (int i = 0; i < jumlahPertemuan.length; i++) {
                        totalKehadiran += jumlahPertemuan[i];
                        totalpertemuan += 16; // pertemuan dalam satu semester adalah 16
                    }
                    if (namaMahasiswa.length > 0) {
                        System.out.println("Nama: " + namaMahasiswa[0]);
                         // Menampilkan nama mahasiswa pertama sebagai contoh
                         System.out.print("Total Pertemuan: " + totalpertemuan);
                        
                        persentaseKehadiran = (totalKehadiran  / totalpertemuan * namaMahasiswa.length) * 100; // menghitung persentase kehadiran
                        System.out.println();
            
                    }
                    System.out.println("Total Kehadiran: " + totalKehadiran);
                    System.out.println("Persentase Kehadiran: " + persentaseKehadiran + "%");
                    break;

                        
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 4);
        input.close();
    }  
}
