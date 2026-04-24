public class bintang {
    
    //MEMBUAT DIAMOND DENGAN BINTANG
    public static void main(String[] args) {
        int tinggi = 10;
        
        //bagian atas (Piramida)
        for (int i = 1; i <= tinggi; i++) {
            //cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            //cetak bintang
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //bagian bawah (Piramida terbalik)
        for (int i = tinggi - 1; i >= 1; i--) {
            //cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            //cetak bintang
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}