public class cetakBintang {

    public cetakBintang(int n) {
        if (n == 0) { // Base case: jika n kurang dari atau sama dengan 0, berhenti
            return;
        }
        System.out.println("*"); // Cetak satu bintang pada satu baris
        cetakBintang(n - 1); // Rekursif: panggil fungsi dengan n-1 untuk mencetak bintang berikutnya
    }

    static void cetakBintang(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cetakBintang'");
    }

    public static void main(String[] args) {
        int n = 5; // Jumlah baris bintang yang ingin dicetak
        cetakBintang(n);

        
    }
   
}