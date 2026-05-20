import java.util.Scanner;

public class Menu
{
    private static int pilih = 0;
    private static int[][] orang = new int[2][2];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        do
        {
            Main_Menu();

            switch (pilih)
            {
                case 1:
                    space_atas();
                    Input_Data(orang);
                    space_bawah();
                    break;

                case 2:
                    space_atas();
                    Output_Data(orang);
                    space_bawah();
                    break;

                case 3:
                    System.exit(0);
                    break;
            }

        } while (true);
    }

    // -------- PROCEDURE UNTUK MENU UTAMA --------
    public static void Main_Menu()
    {
        System.out.println("===================================");
        System.out.println("              MENU                 ");
        System.out.println("===================================");
        System.out.println("1. Inputan Data");
        System.out.println("2. output Data");
        System.out.println("3. keluar");
        System.out.println("===================================");
        System.out.print("Silahkan Pilih 1-3 = ");
        pilih = sc.nextInt();
    }

    // -------- PROCEDURE UNTUK GARIS SPACE ATAS --------
    private static void space_atas()
    {
        System.out.println("");
        System.out.println("--------------------------------");
    }

    // -------- PROCEDURE UNTUK GARIS SPACE BAWAH --------
    public static void space_bawah()
    {
        System.out.println("--------------------------------");
        System.out.println("");
    }

    // -------- PROCEDURE UNTUK INPUT DATA --------
    private static void Input_Data(int[][] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            System.out.println("Data " + (i + 1));

            System.out.print("Umur = ");
            data[i][0] = sc.nextInt();

            if (data[i][0] < 17)
            {
                data[i][1] = 0;
            }
            else
            {
                data[i][1] = 1;
            }
        }
    }

    // -------- PROCEDURE UNTUK OUTPUT DATA --------
    private static void Output_Data(int[][] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            System.out.println("Data " + (i + 1));

            System.out.println("Umur = " + data[i][0]);

            if (data[i][1] == 0)
            {
                System.out.println("Belum Cukup Umur");
            }
            else
            {
                System.out.println("Dewasa");
            }

            System.out.println("");
        }
    }
}