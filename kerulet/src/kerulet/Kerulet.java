package kerulet;
import java.util.Scanner;

public class Kerulet {

    public static double teglalapK (double a, double b) {
        return (a + b) * 2;
    }
    
    
    public static double korK (double r) {
        return 2 * r * Math.PI;
    }
    
   
    public static double haromszogK (double a, double b, double c) {
        return a + b + c;
    }
    
    
    public static double otszogK (double a) {
        return 5 * a;
    }
    
    
    public static double hatszogK (double a) {
        return 6 * a;
    }
    
    
    public static void main(String[] args) {
        
        System.out.print("Kerület");
        
        char answer;
        Scanner input = new Scanner(System.in);
        int alakzatValasz;
        double a_Oldal, b_Oldal, c_Oldal;
       
        
        do {
            
            do {

                System.out.println("Melyiket akarja kiszámolni (1-5)\n1 - Téglalap\n2 - Kör\n3 - Háromszög\n4 - Ötszög\n5 - Hatszög\n");
                alakzatValasz = input.nextInt();

            } while(alakzatValasz < 1 || alakzatValasz> 5);
            
            switch (alakzatValasz) {
                
                case 1: 
                    System.out.println("\nTéglalap két oldala: ");
                    a_Oldal = input.nextDouble();
                    b_Oldal = input.nextDouble();
                    System.out.println("A téglalap kerülete: " + teglalapK(a_Oldal, b_Oldal));
                    break;
                
                case 2:     
                    System.out.println("\nKör sugara: ");
                    c_Oldal = input.nextDouble();
                    System.out.println("A kör kerülete: " + korK(c_Oldal));
                    break;
                    
                case 3: 
                    do {
                        System.out.println("\nHáromszög 3 oldala: ");
                        a_Oldal = input.nextDouble();
                        b_Oldal = input.nextDouble();
                        c_Oldal = input.nextDouble();
                    } while((a_Oldal + b_Oldal) < c_Oldal);
                    
                    System.out.println("A háromszög kerülete: " + haromszogK(b_Oldal, b_Oldal, c_Oldal));
                    break;
                    
                case 4:
                    System.out.println("\nÖtszög oldala: ");
                    a_Oldal = input.nextDouble();
                    System.out.println("Az ötszög kerülete: " + otszogK(a_Oldal));
                    break;
                    
                case 5: 
                    System.out.println("\nHatszög oldala: ");
                    a_Oldal = input.nextDouble();
                    System.out.println("Az hatszög kerülete: " + hatszogK(a_Oldal));
                    break;
            }
            
            System.out.print("\nÚjra? (y/n): ");
            answer = input.next().toLowerCase().charAt(0);
            
        } while (answer == 'y');
        
        input.close();
    }
    
}
