package tombosito;

public class Tombosito {
    
     public static void main(String[] args) {  
        int[] tomb1 = tombdefinialo();
        int[] tomb2 = tombdefinialo();
        int[] tomb3 = tombdefinialo();
        
        tombkiiro(tomb1);
        tombkiiro(tomb2);
        tombkiiro(tomb3);
    }
    
    public static int[] tombdefinialo()
    {
        int elemszam = (int) (Math.random() *10) +10;
        int[] tomb = new int[elemszam];
        
        for (int i = 0; i < elemszam; i++) 
            tomb[i] = (int) (Math.random() *200) -100;
        
        return tomb;
    }
    
    public static void tombkiiro(int[] tomb)
    {
        System.out.print("\nTombelemek[" + tomb.length + "]: ");
        for (int i = 0; i < tomb.length; i++) 
            System.out.print(String.format("%, 5d", tomb[i]));
    }
    
}