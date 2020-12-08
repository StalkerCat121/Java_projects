package eldontes;
import java.util.Scanner;

public class Eldontes {

    
    public static void main(String[] args) {
           int[] szamok;
        int elemSz = 0;

        Scanner bemenet = new Scanner(System.in);
        System.out.println("Hányszor fusson le (1-20)");

        elemSz = bemenet.nextInt();
        
        while (!(elemSz >= 1 && elemSz <= 20)) {
            System.out.println("1 és 20 közötti szám fogadható el");
            elemSz = bemenet.nextInt();
            }
        

        szamok = new int[elemSz];
        
        for (int i = 0; i < elemSz; i++) {
            szamok[i]=(int)(Math.random()*200)-100;
            System.out.print(String.format("%, 5d",szamok[i]) );
        }
    }
    
}
