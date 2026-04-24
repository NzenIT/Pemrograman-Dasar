import java.util.Scanner;
public class kelipatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int batas, kelipatan;
        System.out.print("Masukkan batas : ");
        batas = input.nextInt();

        System.out.print("Masukkan kelipatan : ");
        kelipatan = input.nextInt();

        System.out.println("Kelipatan " + kelipatan + " sampai dengan " + batas + " :");
        for (int i = 1; i <= batas; i = i + kelipatan) {
            System.out.print(i + " ");

        input.close();
        }


    
    }
    }
