package ismetles;
import java.util.Scanner;

public class Ismetles {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int valasz;
        System.out.println("Adj egy pozitív egész számot: ");
        valasz = input.nextInt();
        while (valasz <= 0) {
            System.out.println("Pozitív egész szám kell");
            valasz = input.nextInt();
        }
        for (int i = 0; i < valasz; i++) {
            System.out.print(i+1+" ");
            input.close();
        }
        
    }
    
}
