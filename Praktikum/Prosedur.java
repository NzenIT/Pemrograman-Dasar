
import java.util.Scanner; 
public class Prosedur {
    //blok class
    //disini bisa mmebuat procedure / function, serta variabel class-level / variabel global
    //variabel class level itu menggunakan "static"
    //Parameter adalah tempat untuk menampung nilai yang akan digunakan di Procedure/ function.

    //contoh procedure kalau cetak garis aja pake sout aja
    //kalau procedure nya untuk menginput harus memakai scanner.

    static Scanner input = new Scanner(System.in); //variabel global untuk scanner, agar bisa digunakan di semua blok kode

    //kalau procedure >> ada memakai scanner. >> static void
    static void inputdata(){
        //nilai tugas, nilai uts, nilai uas
        System.out.println("Masukkan nilai tugas : ");
        int nTugas = input.nextInt();
        System.out.println("Masukkan nilai UTS : ");
        int nUTS = input.nextInt();
        System.out.println("Masukkan nilai UAS : ");
        int nUAS = input.nextInt();

        //Panggil function
        nilaiAkhir(nTugas, nUTS, nUAS);
    }
    //jika tidak ada parameter maka akan menggunakan variabel global untuk menyimpan nilai yang diinput oleh user
    //jika ada parameter maka nilai yang diinput oleh user akan disimpan di parameter tersebut, sehingga tidak perlu menggunakan variabel global untuk menyimpan nilai yang diinput oleh user
    
    //function >> static lalu tipe data
    static int nilaiAkhir(int tg, int uts, int uas) {
        //NA (30%*tugas) + (30%*uts) + (40%*uas)
        int NA = (tg*30/100) + (uts*30/100) + (uas*40/100);
        System.out.println("Nilai Akhir : " + NA);
        return NA;
    }   
    public static void main(String[] args) {
        /*perbedaan paling signifikan pada prosedur dengan function
       1. Procedure: void, function: Tipe data & return
       2. procedure tidak return value, Function return value */
       /*Procedure bisa memanggil function, function bisa memanggil function lain, procedure bisa memanggil procedure lain, function bisa memanggil procedure */


        //memanggil procedure
        inputdata(); //memanggil procedure inputdata untuk menginput nilai tugas, uts, uas

        
        
    }
}
