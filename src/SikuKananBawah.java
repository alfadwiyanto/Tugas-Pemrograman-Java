import java.util.Scanner;

class SikuKananBawah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z ;
        int tinggi;
       System.out.printf("Tinggi Segitiga : ");
       tinggi = input.nextInt();
       System.out.println("=========================");
       
       for(x=0; x<=tinggi; x++){
           for(y=0; y<(tinggi-x); y++){
               System.out.print(" ");
           }
           for(z=0; z<x; z++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
}
