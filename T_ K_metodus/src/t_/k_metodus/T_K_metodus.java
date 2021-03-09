package t_.k_metodus;
import java.util.Scanner;

public class T_K_metodus {

    public static double szamitKer(double a, double b, double c) {
        return a + b + c;
    }
    
    public static double szamitTer1 (double a, double m) {
        return (a * m) / 2.0;
    }
    
    public static double szamitTer2(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    
    public static void main(String[] args) {
        System.out.println("\nHáromszög terület, kerület számító program\n");
        Scanner input = new Scanner(System.in);
        double befogo1, befogo2, atfogo;
        char valasz;
        
        do {
            
            do {
                
                System.out.println("\nAdd meg a háromszög 3 oldalát: ");
                befogo1 = input.nextDouble();
                befogo2 = input.nextDouble();
                atfogo = input.nextDouble();
                
            } while((befogo1 + befogo2) < atfogo);

              System.out.println("\nA háromszög kerülete: " + szamitKer(befogo1, befogo2, atfogo));
              System.out.println("\nA háromszög területe: " + szamitTer2(befogo1, befogo2, atfogo));
              System.out.println("\n\nSzeretnél új számokat megadni? (i/n): ");
              valasz = input.next().toLowerCase().charAt(0);
              
        } while (valasz == 'i');
        
        input.close();
    }
    
}