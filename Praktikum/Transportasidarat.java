import java.util.Scanner;
public class Transportasidarat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        //Masukkan nominal uang
        System.out.print("Masukkan penumpang : ");
        int penumpang = input.nextInt();


        //Menghitung bus
        int bus = penumpang / 50;
        int sisa = penumpang % 50;

        //Menghitung minibus
        int minibus = sisa / 15;
        sisa = sisa % 15;

        //Menghitung mobil
        int mobil = sisa / 7;
        sisa = sisa % 7;

        if (sisa != 0) {
            mobil = mobil + 1;
        }


        //Output
        System.out.println("Bus : " + bus);
        System.out.println("Minibus : " + minibus);
        System.out.println("Mobil : "  + mobil);
       
    }
    
}

