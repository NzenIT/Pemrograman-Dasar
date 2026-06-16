/*public class stringbuffer {
    
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(100);
        StringBuffer sb3 = new StringBuffer("Halo");

        System.out.println("sb1 -> length: " + sb1.length()
                + ", capacity: " + sb1.capacity());

        System.out.println("sb2 -> length: " + sb2.length()
                + ", capacity: " + sb2.capacity());

        System.out.println((sb3) + " -> length: " + sb3.length()
                + ", capacity: " + sb3.capacity());
    }
}

public class stringbuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 5; i++) {
            sb.append("abc ");
        }

        System.out.println(sb);
    }
}

public class stringbuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Halo");
        System.out.println("Length : " + sb.length());
        System.out.println("Capacity : " + sb.capacity());
    }
}
*/

public class stringbuffer {
    public static void main(String[] args) {

        String teksAwal = "Pemrograman Java";

        StringBuffer sb = new StringBuffer(teksAwal);

        String teksAkhir = sb.toString();

        System.out.println("String Awal  : " + teksAwal);
        System.out.println("String Akhir : " + teksAkhir);

        System.out.println("Sama? " + teksAwal.equals(teksAkhir));
    }
}

