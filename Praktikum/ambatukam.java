public class ambatukam {

    public static void main(String[] args) {
        
        String nama = "UniversitasDinamika";

        //naik
        for (int i = 1; i <= nama.length(); i++) {
            System.out.println(nama.substring(0, i));
        }
        //turun
        for (int i = nama.length() - 1; i >= 0; i--) {
            System.out.println(nama.substring(0, i));
        }
    }     
}