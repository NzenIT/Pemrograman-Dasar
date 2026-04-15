import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        
  /*Membuat prorgram untuk menghitung total sskm berdasarkan kegiatan dan poin sskm dari kegiatan yang diinputkan
  Kegiatan bsa diinput hingga 5 data
  
  output:
  Bimbingan karir - 5 poin
  Seminar AI - 3 poin
  Total = 8 poin
  */
        //input
        Scanner input = new Scanner(System.in);
        
        String namaKegiatan;
        int poinSSKM = 0, total = 0;

        //pengulangan input data 5x
        //Shortcut for >> fori + enter / tab
        
        for (int i = 1; i < 6; i++) {
            //isi input
            System.out.println("Data ke: " + i); //cetak urutan daata
            System.out.print("Nama kegiatan = ");
            namaKegiatan = input.nextLine();
            System.out.print("Poin SSKM : ");
            poinSSKM = input.nextInt();
            System.out.println();
            input.nextLine();

            total += poinSSKM;
            
        }
            // untuk cetak total satu kali harus berada di luar for / setelah logic for
            System.out.print("Total SSKM mu : " + total);
        
        
        
        
        
        
        
        
        
        
        
        input.close();

    }
}
