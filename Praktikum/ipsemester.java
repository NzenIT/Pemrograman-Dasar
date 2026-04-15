import java.util.Scanner;
public class ipsemester {
   
 public static void main(String[] args) {

    //input nilai setiap matkul
    //menghitung berapa SKS 
    //menghitung IP semester dari nilai matkul dan jumlah SKS
    Scanner input = new Scanner(System.in);

         double Bindo, DAM, SIM, MB, BD, PDA, SISDM, PDI;
         double sksBINDO = 2, sksDAM = 3, sksSIM = 2, sksMB = 3, sksBD = 3, sksPDA = 3, sksSISDM = 2, sksPDI = 2;
         int totalSks;
         

    System.out.println("Menghitung IP Semester");

    System.out.print("Nilai Mata Kuliah BINDO : ");
    Bindo = input.nextInt();

    System.out.print("Nilai Mata Kuliah DAM : ");
    DAM = input.nextInt();

    System.out.print("Nilai Mata Kuliah SIM : ");
    SIM = input.nextInt();
    
    System.out.print("Nilai Mata Kuliah MB : ");
    MB = input.nextInt();

    System.out.print("Nilai Mata Kuliah BD : ");
    BD = input.nextInt();

    System.out.print("Nilai Mata Kuliah PDA: ");
    PDA = input.nextInt();

    System.out.print("Nilai Mata Kuliah SISDM : ");
    SISDM = input.nextInt();

    System.out.print("Nilai Mata Kuliah PDI : ");
    PDI = input.nextInt();

    totalSks = 2 + 2 + 3 + 3 + 3 + 3 + 2 + 2;
    

    if (Bindo >= 85) {
            Bindo = 4.00;
        } else if (Bindo >= 80) {
            Bindo = 3.50;
        } else if (Bindo >= 75) {
            Bindo = 3.00;
        } else if (Bindo >= 70) {
            Bindo = 2.50;
        } else if (Bindo >= 65) {
            Bindo = 2.00;
        } else if (Bindo >= 60) {
            Bindo = 1.50;
        } else if (Bindo >= 55) {
            Bindo = 1.00;
        } else {
            Bindo = 0.00;
        }


        if (DAM >= 85) {
            DAM = 4.00;
        } else if (DAM >= 80) {
            DAM = 3.50;
        } else if (DAM >= 75) {
            DAM = 3.00;
        } else if (DAM >= 70) {
            DAM = 2.50;
        } else if (DAM >= 65) {
            DAM = 2.00;
        } else if (DAM >= 60) {
            DAM = 1.50;
        } else if (DAM >= 55) {
            DAM = 1.00;
        } else {
            DAM = 0.00;
        }
        
           if (SIM >= 85) {
            SIM = 4.00;
        } else if (SIM >= 80) {
            SIM = 3.50;
        } else if (SIM >= 75) {
            SIM = 3.00;
        } else if (SIM >= 70) {
            SIM = 2.50;
        } else if (SIM >= 65) {
            SIM = 2.00;
        } else if (SIM >= 60) {
            SIM = 1.50;
        } else if (SIM >= 55) {
            SIM = 1.00;
        } else {
            SIM = 0.00;
        }


           if (MB >= 85) {
            MB = 4.00;
        } else if (MB >= 80) {
            MB = 3.50;
        } else if (MB >= 75) {
            MB = 3.00;
        } else if (MB >= 70) {
            MB = 2.50;
        } else if (MB >= 65) {
            MB = 2.00;
        } else if (MB >= 60) {
            MB = 1.50;
        } else if (MB >= 55) {
            MB = 1.00;
        } else {
            MB = 0.00;
        }

           if (BD >= 85) {
            BD = 4.00;
        } else if (BD >= 80) {
            BD = 3.50;
        } else if (BD >= 75) {
            BD = 3.00;
        } else if (BD >= 70) {
            BD = 2.50;
        } else if (BD >= 65) {
            BD = 2.00;
        } else if (BD >= 60) {
            BD = 1.50;
        } else if (BD >= 55) {
            BD = 1.00;
        } else {
            BD = 0.00;
        }


           if (PDA >= 85) {
            PDA = 4.00;
        } else if (PDA >= 80) {
            PDA = 3.50;
        } else if (PDA >= 75) {
            PDA = 3.00;
        } else if (PDA >= 70) {
            PDA = 2.50;
        } else if (PDA >= 65) {
            PDA = 2.00;
        } else if (PDA >= 60) {
            PDA = 1.50;
        } else if (PDA >= 55) {
            PDA = 1.00;
        } else {
            PDA = 0.00;
        }


           if (SISDM >= 85) {
            SISDM = 4.00;
        } else if (SISDM >= 80) {
            SISDM = 3.50;
        } else if (SISDM >= 75) {
            SISDM = 3.0;
        } else if (SISDM >= 70) {
            SISDM = 2.50;
        } else if (SISDM >= 65) {
            SISDM = 2.00;
        } else if (SISDM >= 60) {
            SISDM = 1.50;
        } else if (SISDM >= 55) {
            SISDM = 1.00;
        } else {
            SISDM = 0.00;
        }


           if (PDI >= 85) {
            PDI = 4.00;
        } else if (PDI >= 80) {
            PDI = 3.50;
        } else if (PDI >= 75) {
            PDI = 3.00;
        } else if (PDI >= 70) {
            PDI = 2.50;
        } else if (PDI >= 65) {
            PDI = 2.00;
        } else if (PDI >= 60) {
            PDI = 1.50;
        } else 
            if (PDI >= 55) {
            PDI = 1.00;
        } else {
            PDI = 0.00;
        }

        

        double nilaiBindo = Bindo * sksBINDO;
        double nilaiDAM = DAM * sksDAM; 
        double nilaiSIM = SIM * sksSIM; 
        double nilaiMB = MB * sksMB;
        double nilaiBD = BD * sksBD;
        double nilaiPDA = PDA * sksPDA; 
        double nilaiSISDM = SISDM * sksSISDM; 
        double nilaiPDI = PDI * sksPDI;

        double IPsemester = (nilaiBindo + nilaiDAM + nilaiSIM + nilaiMB + nilaiBD + nilaiPDA + nilaiSISDM + nilaiPDI) / 20;
        System.out.println("Berdasarkan nilai anda maka IP Semesetar anda adalah : " + IPsemester);


        input.close();
    }
        // Output
       

       
 }

    