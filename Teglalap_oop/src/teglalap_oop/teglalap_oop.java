package teglalap_oop;
import java.util.Scanner;

public class teglalap_oop {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        teglalap tegla = new teglalap(a, b);
        
        System.out.println(tegla.kerulet());
        System.out.println(tegla.terulet());
    }
}
