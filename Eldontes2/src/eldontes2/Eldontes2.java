package eldontes2;
import java.util.Scanner;

public class Eldontes2 {

    public static void main(String[] args) {
        int[] szamok;
        int elemszam = 0;

        Scanner bemenet = new Scanner(System.in);
        System.out.println("Adj meg egy számot 1-20ig");

        elemszam = bemenet.nextInt();
        
        while (!(elemszam >= 1 && elemszam <= 20)) {
            System.out.println("Rosssz számot adtál meg! Adj meg egy számot 1-20ig");
            elemszam = bemenet.nextInt();
            }
        

        szamok = new int[elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            szamok[i]=(int)(Math.random()*200)-100;
            System.out.print(String.format("%, 5d",szamok[i]) );
            if(szamok[i] == 0){
                System.out.println("A " + i +". elem tartalmaz nullát" );
                }
       } 
    } 
}