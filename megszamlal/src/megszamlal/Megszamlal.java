package megszamlal;
import java.util.Scanner;

public class Megszamlal {

   
    public static void main(String[] args) {
        
         System.out.println("\n\tMÉGSZÁMLÁLÁS TÉTELE\n");
        
        System.out.print("Hány eleme legyen a tömbnek: ");
        Scanner input = new Scanner(System.in);
        int elemSzam = input.nextInt();
        
        int[] tomb = new int  [elemSzam];
        for(int i = 0; i < elemSzam; i++)
        {
            tomb[i] = (int) (Math.random() * 999) + 1;  //aktuális tömbelem
        }
        
        System.out.println("A tömb elemei:");
        for(int i = 0; i < elemSzam; i++)
        {
            System.out.print(i + 1 );
            System.out.print(String.format("%, 5d", tomb[i]));
        }
        
        int parosSzamDb = 0;
        for (int i = 0; i < elemSzam; i++) {
            if (tomb[i]%2==0) {
                parosSzamDb++;
            }
        }
        
        System.out.println(elemSzam+"="+tomb.length);
        System.out.println("páros számok darabszáma:" + parosSzamDb);
        }
    }