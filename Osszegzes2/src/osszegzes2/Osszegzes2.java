package osszegzes2;


public class Osszegzes2 {

    
    public static void main(String[] args) {
        System.out.println("\n\tÖSSZEGZES TETELE\n");
        
        System.out.println("Első tömb elemei: ");
        
        int tomb1[] = new int[5];
        
        int osszeg = 0;
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 99) + 1;
            osszeg = osszeg + tomb1[i]; // osszeg += tomb[i]
            if(i != tomb1.length - 1)
                System.out.print(tomb1[i] + ", ");
            else
                System.out.println(tomb1[i]);

        }
        System.out.println("\nAz első tömb osszege: " + osszeg);
        System.out.println("AZ EÉSŐ TÖMB átlaga: " + 
(double) osszeg / tomb1.length);
        {
        System.out.println("\n\n\nMásodik tömb elemei: ");
        
        int tomb2[] = new int[5];
        
        int osszeg2 = 0;
        for(int i = 0; i < tomb2.length; i++)
        {
            tomb2[i] = (int) (Math.random() * 99) + 1;
            osszeg = osszeg + tomb2[i]; // osszeg += tomb[i]
            if(i != tomb2.length - 1)
                System.out.print(tomb2[i] + ", ");
            else
                System.out.println(tomb2[i]);

        }
        System.out.println("\nA MÁSODIK TÖMB osszege: " + osszeg);
        System.out.println("A MÁSODIK TÖMB átlaga: " + 
(double) osszeg / tomb2.length);
        }
        
    }
    
}