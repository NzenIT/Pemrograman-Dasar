import java.util.Scanner;
public class Fungsiarray {
 

    // MEmbuat Fungsi mencari nilai terbesar 
    static int getNilaiMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input jumlah array
        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];

        // input isi array
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // memanggil fungsi
        int hasil = getNilaiMax(nilai);

        System.out.println("Nilai terbesar adalah: " + hasil);

        sc.close();
    }
}

