import java.util.Scanner;

class SikuKananAtas {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int x, y, z ;
        int tinggi;
        System.out.printf("Tinggi Segitiga : ");
       tinggi = input.nextInt();
       System.out.println("=========================");
       
       for(x=0; x<tinggi; x++){
           for(z=0; z<x; z++){
               System.out.print(" ");
           }
           for(y=0; y<(tinggi-x); y++){
               System.out.print("#");
           }
           System.out.println();
       }
    }
}
