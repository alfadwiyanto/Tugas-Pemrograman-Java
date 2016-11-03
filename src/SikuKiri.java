import java.util.Scanner;

class SikuKiri {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int x, y;
      int tinggi;
       System.out.printf("Tinggi Segitiga : ");
       tinggi = input.nextInt();
       System.out.println("=========================");
        
       for (x=0; x<=tinggi; x++){
           for (y=0; y<x; y++){
               System.out.print("^");
           }
           System.out.println("");
       }
    
    }
}
