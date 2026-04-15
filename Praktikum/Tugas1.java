import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        //Masukkan nominal uang
        System.out.print("Masukkan nominal uang : ");
        int nominal = input.nextInt();
        System.out.println("-----------------------");


        //Menghitung 20000
        int duaPuluhRibu = nominal / 20000;
        int sisa = nominal % 20000;

        //Menghitung 10000
        int sepuluhRibu = sisa / 10000;
        sisa = sisa % 10000;

        //Menghitung 2000
        int duaRibu = sisa / 2000;
        sisa = sisa % 2000;

        //Menghitung 1000
        int seribu = sisa / 1000;
        sisa = sisa % 1000;

        //Menghitung 500
        int limaRatus = sisa / 500;
        sisa = sisa % 500;

        //Menghitung 200
        int duaRatus = sisa / 200;
        sisa = sisa % 200;

        //Menghitung 100
        int seratus = sisa / 100;
        sisa = sisa % 100;

        //Output
        System.out.println("Dua puluh ribu : " + duaPuluhRibu);
        System.out.println("Sepuluh Ribu : " + sepuluhRibu);
        System.out.println("Dua ribu: "  + duaRibu);
        System.out.println("Seribu : " + seribu);
        System.out.println("Dua ratus : " + duaRatus);
        System.out.println("Seratus : " + seratus);
    }
    
}
