import java.util.Scanner;

public class luaspersegipanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Memanggil Fungsi harus di dalam void main
        //Membuat fungsi harus di luar void main
        int panjang,lebar =0;
        System.out.print("Masukkan panjang (cm) : ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar (cm) : ");
        lebar = input.nextInt();

        //memanggil fungsi hitungLuas dengan parameter panjang dan lebar
        System.out.println("Luas Persegi Panjang : "+ hitungLuas(panjang, lebar)); //menampilkan hasil luas yang sudah dihitung dengan fungsi hitungLuas
        input.close();

    }
    //Membuat Fungsi untuk menghitung luas persegi panjang
    static int hitungLuas(int p, int l) {
        int luas = p * l; //hasil dari rumus akan dihitung akan sesuai dengan angka dari user
        return luas;    //hasil luas akan terus dikembalikan nilainya

    }

}
