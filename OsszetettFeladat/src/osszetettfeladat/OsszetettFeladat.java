package osszetettfeladat;
import java.util.Scanner;

public class OsszetettFeladat {

    public static void main(String[] args) {
        
     char bekertValasz;
     
    do {            
        
        Scanner bemenet = new Scanner(System.in);
        
        // 1. F "Hozz létre két tömböt: szamok1, szamok2 néven!"
        
        int[] szamok1;
        int[] szamok2;
        int elemszam;
        int[] ujTomb;
        int ujTombElemszam = 0;
        int nullaDb = 0;
        
        // 2. F "A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között."
        
        elemszam=(int) (Math.random()*20)+10;
        
        szamok1 = new int[elemszam];
        szamok2 = new int[elemszam];
        
        
        // 3. F "Az elemek a -50 és +50 értéktartományba essenek."
        
        
        for (int i = 0; i < elemszam; i++) {
            szamok1[i] = (int) (Math.random()*100)-50;
            szamok2[i] = (int) (Math.random()*100)-50;
            if (Math.abs(szamok1[i])%5 == 0 && Math.abs(szamok1[i])%2 == 0) 
                ujTombElemszam++;
            if (Math.abs(szamok2[i])%5 == 0 && Math.abs(szamok2[i])%2 == 0) 
                ujTombElemszam++;
            
            
            // 4. F "Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek"
            
            
            System.out.print(String.format("%, 5d", szamok1[i]));     
        }
        ujTomb = new int[ujTombElemszam+1];
        ujTombElemszam = 0;
        System.out.println("\n");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%, 5d", szamok2[i]));
            
            
            //  5. F "Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe és írasd ki az elemeket"
            
            
            if (Math.abs(szamok1[i])%5 == 0 && Math.abs(szamok1[i])%2 == 0) 
                ujTomb[ujTombElemszam++]=szamok1[i];
            if (Math.abs(szamok2[i])%5 == 0 && Math.abs(szamok2[i])%2 == 0) 
                ujTomb[ujTombElemszam++]=szamok2[i];
            
            
            // 6. F "Írasd ki, hogy 0-át tartalmaz-e az ujTomb?"
            
            
            if (szamok1[i] == 0) 
                nullaDb++;
            if (szamok2[i] == 0) 
                nullaDb++;
        }
        if (ujTombElemszam == 0) 
            System.out.print("\nNincs olyan szám, ami osztahó 5-el, és páros");
        else    {
            System.out.print("\n\nujTomb elemei: ");
        for (int i = 0; i < ujTombElemszam; i++) 
            System.out.print(String.format("%, 5d", ujTomb[i]));
        }
        for (int i = 0; i < nullaDb; i++) 
            System.out.print(0);
        if (nullaDb == 0) 
            System.out.println("\n\nA tömbök nem tartalmaznak nullát");
        
        
        // 7. F "Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá..."
          
        
        System.out.print("\n\nSzeretné-e újrafuttatni programot? (i/n)");
        bekertValasz = bemenet.next().toLowerCase().charAt(0);
    } while (bekertValasz == 'i');
        
    }
    
}