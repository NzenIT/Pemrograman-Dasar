public class MATH {

    public static void main(String[] args) {
        /* 
        Hitung luas lingakaran dengan rumus L = π * r^2
        dengan jari-jari lingkaran (r) = 7 cm dan hasilnya hingga 2 angka di belakang koma 
        */

        double r = 7;
        double L = Math.PI * Math.pow(r, 2); 
        System.out.printf("Luas lingkaran dengan jari-jari %.2f cm adalah %.2f cm^2", r, L);
    }
    
}