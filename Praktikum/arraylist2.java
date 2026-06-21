/* Minta input jumlah buku yang dipinjam. 
Untuk tiap buku, masukkan jumlah hari keterlambatan ke ArrayList. Hitung total denda.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> buku = new ArrayList<>();

    //Procedure input
    /*
       1. Kerangka input + deklarasi scanner & arraylist
    2. loop input arraylist
    */
    static void inputData() {
        System.out.print("Masukkan jumlah buku yang dipinjam : ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan jumlah hari keterlambatan buku ke-" + (i+1) + " : ");
            buku.add(input.nextInt());
        }
    }        
        
    //Func hitung total denda 
    static int hitungDenda() {
        int totalDenda = 0;
        for (int hariTelat : buku) {
            totalDenda += hariTelat * 1000; //denda per hari = Rp. 1000

        }
        return totalDenda;
    }
    

    //Proc output --> data hari telat dan total denda --> 
    static void outputData() {
        
        for (int i = 0; i < buku.size(); i++) {
            System.out.println("Hari keterlambatan buku ke-" + (i+1) + " : " + buku.get(i) + " hari");
        }
        System.out.println("-------------------------------");
        System.out.println("Jumlah buku: " + buku.size());
        System.out.println("Telat : " + buku + " " + "hari");
        System.out.println("Total denda : Rp. " + hitungDenda());
    }

    public static void main(String[] args) {
        inputData();
        outputData();
    }
}
