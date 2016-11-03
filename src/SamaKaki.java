import java.util.Scanner;

class SamaKaki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int tinggi;
        System.out.printf("Tinggi Segitiga : ");
       tinggi = input.nextInt();
       System.out.println("=========================");
       
       for(a=0; a<=tinggi; a++){
           for(int d=1; d<=tinggi-a; d++){
               System.out.print(" ");
           }
           for(int d=1; d<2*a; d++){
           System.out.print("*");
       }
           System.out.println(" ");
    }
   
}
}
