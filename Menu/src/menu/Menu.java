package menu;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Menü");
        Scanner input = new Scanner(System.in);
        //1. Hozz létre egy tömböt: szamok néven!
        //2. A tömb elemszáma 20 legyen.
        //3. Az elemek a -50 és +50 értéktartománSyba essenek.
        //4. Írasd ki a tömb elemeit egy sorban.
        //5. Ekkor kérdezd meg a felhasználót, mit szeretne tenni az adatokkal:
            //1 - összeget számoltatni: tömbök összegét kiíratni
            //2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni
            //3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?
            //4 - 5-tel osztható páros számok db-száma: mennyi?
            //5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.
     
            int[] szamok = new int[20];

        for(int i = 0; i < 20; i++) {
            szamok[i] = (int) (Math.random()*100)-50;
        }
        System.out.println("Tömb elemei: ");
            for (int i = 0; i < 20; i++) {
                System.out.print(szamok[i]+ ", ");
        }
        Scanner bemenet = new Scanner(System.in);
            System.out.println("Menü");
            System.out.println("1 - összeget számoltatni");
            System.out.println("2 - szélsőértékeket kiíratni");
            System.out.println("3 - van-e benne 40-50");
            System.out.println("4 - 5-tel osztható páros számok db-száma");
            System.out.println("5 - adott számot tartalmazza-e");
            System.out.print("\nVálasszon a menüpontok közül(1-5)! ");
        int valasz = bemenet.nextInt();
    }
}
        