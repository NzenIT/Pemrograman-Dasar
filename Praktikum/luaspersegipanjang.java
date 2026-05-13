import java.util.Scanner;

public class luaspersegipanjang {
    //variabel class-level >> variabel yang bisa dibaca/digunakan di semua blok kode
    //keyword static >> variabel yang bisa digunakan tanpa harus membuat objek dari class tersebut
    static int pj, lb;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Memanggil Fungsi harus di dalam void main
        //Membuat fungsi harus di luar void main
        
        int panjang,lebar =0;
        System.out.print("Masukkan panjang (cm) : ");
        pj = input.nextInt();
        System.out.print("Masukkan lebar (cm) : ");
        lb = input.nextInt();

        //memanggil fungsi hitungLuas dengan parameter panjang dan lebar
        System.out.println("Luas Persegi Panjang : "+ hitungLuas()); //menampilkan hasil luas yang sudah dihitung dengan fungsi hitungLuas
        input.close();

    }
    //Membuat Fungsi untuk menghitung luas persegi panjang
    static int hitungLuas(int p, int l) {
        int luas = p * l; //hasil dari rumus akan dihitung akan sesuai dengan angka dari user
        return luas;    //hasil luas akan terus dikembalikan nilainya

    }
    //overloading functon : = pembuatan fungsi dengan nama yang sama tetapi dengan parameter yang berbeda
    //fungsi hitung luas tanpa parameter
    static int hitungLuas() {
        int luas = pj * lb; //hasil dari rumus akan dihitung akan sesuai dengan angka dari variabel global pj dan lb 
        return luas; //fungsi ini tidak memiliki parameter, sehingga akan mengembalikan nilai luas

        //fungsi hitung luas tanpa parameter
    }
    }
