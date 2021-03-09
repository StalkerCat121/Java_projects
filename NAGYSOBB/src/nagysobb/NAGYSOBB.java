package nagysobb;
import java.util.Scanner;


    public class NAGYSOBB {
        static int melyikANagyobb(int szam1, int szam2){
        if (szam1 > szam2) 
            return szam1;
        else if (szam1 < szam2) 
            return szam2;
        else
            return 0;
    }  

    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        
        int valasz;
        
        do {            
            System.out.print("1. szám: majd 2. szám  ");
            melyikANagyobb(bemenet.nextInt(), bemenet.nextInt());
            
            System.out.print(" " + melyikANagyobb(bemenet.nextInt(), bemenet.nextInt()));
            System.out.print("\n úrja ?(0-n 1-y) ");
            valasz = bemenet.nextInt();
        } while (valasz == 1);

    }

}