import java.util.Scanner;

public class Rekursif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        System.out.println("Hasil Faktorial dari " + angka + " = " + faktorial(angka));

        
    }
    public static int faktorial(int n) {
        if (n == 1) { // kondisi berhenti base case
            return 1; 
        } else {
            return n * faktorial(n - 1); // Rekursif: n! = n * (n-1)!
        }
    }
}