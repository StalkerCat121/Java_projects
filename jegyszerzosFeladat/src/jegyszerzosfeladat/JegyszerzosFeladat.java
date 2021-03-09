package jegyszerzosfeladat;

public class JegyszerzosFeladat {

    public static void main(String[] args, int i) {
        
        int[] valami;

        int osszeadas = 10 + 10;
        
        int kivonas = 10 - 10;
        
        int szorzas = 10 * 10;
        
        int osztas = 10 / 10;
        
        int szazalek = 10 % 10;  
        
        int novekves = ++i ;
        
        int csokkenes = --i;
        
        System.out.println(20 == 20); //20 egyenlő a 20-al (true)
        System.out.println(20 != 21); //20 nem egyneló 21-el (true)
        System.out.println(20 < 21);  //20 kisebb mint 21 (true)
        System.out.println(20 > 19);  //20 nagyobb mint 19 (true)
        System.out.println(20 <= 20); //20 vagyobb vagy = a 20-al (true)
        System.out.println(20 >= 20); //20 kisebb vagy = a 20-al (true)
        
        boolean tanulo = true;
        boolean felnott = false;
        System.out.println(tanulo || felnott); //ha egy állítás igaz, az output is igaz
        
    }
    
}
