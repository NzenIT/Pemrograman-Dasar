import java.util.Scanner;
public class perulangan2 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    int batas = 0;
    System.out.print("Masukkan batasan bilangan : ");
    batas = input.nextInt();

    for (int a = 1; a <= batas; a++)
    {
      
        System.out.print(a);
        
    }
      
    System.out.println();
     for (int a = 1; a <= batas; a++) {
    
        System.out.print(" " + a);
        System.out.println(" ");
         
     } 
      for (int a = 1; a <= batas; a++)
    {
      
        System.out.print(a);
        
        
    }
     input.close();
        }
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

