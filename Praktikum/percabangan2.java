import java.util.Scanner;

public class percabangan2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nama;
        String buah;

        System.out.println("Buah apa yang disukai farrel?");
        buah = input.nextLine();

        if (buah.equalsIgnoreCase("Apel")) {
            System.out.print("Horeee kamu benar farrel suka Apel");
        } else {
            System.out.println("IAM SORRY I DONT LIKE "+ buah);
        }

        input.close();
    }
}
