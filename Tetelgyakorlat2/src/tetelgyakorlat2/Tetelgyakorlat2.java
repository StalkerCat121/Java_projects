package tetelgyakorlat2;
import java.util.Scanner;

public class Tetelgyakorlat2 {

    public static void main(String[] args) {
    System.out.println("\n\tTETELGYAKORLAS\n");
       
        Scanner bemenet = new Scanner(System.in);
        
        int[] tomb;
        int[] tomb2;
        int elemSz;
        
        System.out.println("Hányszor fusson le? 10 és 20 közötti számok érvényesek");
        elemSz = bemenet.nextInt();
        
        while (!(elemSz <= 20 && elemSz >= 10)) {
            System.out.println("10 és 20 közötti számok érvényesek");
        elemSz = bemenet.nextInt();  
        }
        
        tomb = new int[elemSz];
        tomb2 = new int[elemSz];
        int tombDb = 0;
        int tombOssz = 0;
        
        for (int i = 0; i < elemSz; i++) {
            tombDb++;
        }
        
        
        System.out.println("\nEgymás alá helyezve:\n");

        for (int i = 0; i < elemSz; i++) {
            tomb[i]=(int)(Math.random()*200)-100;
            tomb2[i]=(int)(Math.random()*200)-100;
            tombOssz = tombOssz +tomb2[i];
            
            System.out.println(String.format("%, 5d", tomb[i]));
            System.out.println(String.format("%, 5d", tomb2[i]));
        }
                System.out.println("\nEgymás mellé helyezve:\n");
        for (int i = 0; i < elemSz; i++) {
            System.out.print(String.format("%, 5d", tomb[i]));
            System.out.print(String.format("%, 5d", tomb2[i]));
        }
        

        System.out.println("tömb1: " + tombDb);
        System.out.println("tömb1 összege: " + tombOssz);
        
        System.out.println("\nVéletlenszrű számokkal");
        
        int elemSz2;
        elemSz2=(int)(Math.random()*10)+10;
        int[] tomb11 = new int[elemSz2];
        int[] tomb22 = new int[elemSz2];
        int tombDb2 = 0;
        int tombOssz2 = 0;
                
                System.out.println("\nEgymás alá helyezve:\n");
        
        for (int i = 0; i < elemSz2; i++) {
        tombDb2++;
            }
        
        
        
        for (int i = 0; i < elemSz2; i++) {
            tomb11[i]=(int)(Math.random()*200)-100;
            tomb22[i]=(int)(Math.random()*200)-100;
            
            tombOssz2= tombOssz2+tomb22[i];
            
            System.out.println(String.format("%, 5d", tomb11[i]));
            System.out.println(String.format("%, 5d", tomb22[i]));
        }
                System.out.println("\nEgymás mellé helyezve:\n");
        for (int i = 0; i < elemSz2; i++) {
            System.out.print(String.format("%, 5d", tomb11[i]));
            System.out.print(String.format("%, 5d", tomb22[i]));
        }
        
        System.out.println("\ntömb2: " + tombDb2 );
        System.out.println("Tömb2 összege: " + tombOssz2);
        

        

        
        
    }
    
}