import java.util.Scanner;
public class soallatihanfungsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Buatlah fungsi isGanjil() yang menerima satau parameter bertipe int
        Fungsi mengembalikan nilai boolean: true jika bilangan ganjil, false jika genap
        Uji dengan beberapa angka, Hint: gunakan operator % (modulus) 
        Clue: 
        - tipe fungsi int
        - return value = boolean
        */

       int a = 0;
       System.out.println("Masukkan angka: ");
       a = input.nextInt();
    
       isGanjil(a);
        input.close();
    }
    static boolean isGanjil(int angka) {
        if (angka % 2 != 0){
            System.out.println(angka + " adalah bilangan ganjil");
            return true; //angka ganjil
        } else {
            System.out.println(angka + " adalah bilangan genap");
            return false; //angka genap
        }

         
        }
    }

    

