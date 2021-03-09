package sorbarendezes;

public class Sorbarendezes {
   
    public static void main(String[] args) {
        
       int[] tomb1 = tombDefiinialo();
       int[] tomb2 = tombDefiinialo();
       int[] tomb3 = tombDefiinialo();
       
        tombKiiro(tomb1);
        tombKiiro(tomb2);
        tombKiiro(tomb3);
        
        System.out.println();
        
         tomb3 = sorbaRendez(tomb3);
         tombKiiro(tomb3);
    }
    
    public static int[] tombDefiinialo() {
        
        int elemSzam = (int) (Math.random() * 10) + 10;     
        int[] tomb = new int[elemSzam]; 
        for(int i = 0; i < elemSzam; i++) {
            tomb[i] = (int) (Math.random() * 200) - 100;
        }
        return tomb;
        
    }
    
    public static void tombKiiro(int[] tomb) {
        
        System.out.print("\nTömbelemek[" + tomb.length + "]: ");
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%5d", tomb[i]));   
        }
        
    }
    
    public static int [] sorbaRendez(int [] tomb) {
         for(int i = 0; i < tomb.length - 1; i++) {
            for(int j = i+1; j < tomb.length - i - 1; j++) {
                int csere;
                
                if(tomb[i] > tomb[j+1]) {
                    csere = tomb[j];
                    tomb[i] = tomb[j+1];
                    tomb[j+1] = csere;
                }
            }
        }
         return tomb;
    }
    


}