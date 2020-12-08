package tombmuveletek1;
import java.util.Scanner;


public class Tombmuveletek1 {

    
    public static void main(String[] args) { 
          System.out.println("\n\tTömbműveletek\n");
         Scanner bemenet = new Scanner(System.in);
        
        System.out.println("Adja meg, hány legyen a tömb elemszáma: "); 
        int a = bemenet.nextInt();
        int[] tomb1 = new int[a];
        int[] tomb2 = new int[a];
        
        System.out.println("Hány elemet tartalmaznak a tömbök: " + tomb1.length);
        
        System.out.println("A tömb elemei:");
        
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 999) + 1;
            tomb2[i] = (int) (Math.random() * 999) + 1;
            System.out.println(i + ".: " + tomb1[i] + " " + tomb2[i]);
        }



        
       
    }
    
}