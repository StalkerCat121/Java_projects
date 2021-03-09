package kivalasztastetele;

public class KivalasztasTetele {

    public static void main(String[] args) {
        int elemSzam = (int) (Math.random() * 5) + 5;//változók deklarálása, inicializálása
        int[] szamTomb1 = new int[elemSzam];
        int[] szamTomb2 = new int[elemSzam];
        int[] szamTomb3 = new int[elemSzam];

        for (int i = 0; i < elemSzam; i++) {//Értéket adunk a tömböknek

            szamTomb1[i] = (int) (Math.random() * 200) - 100;
            szamTomb2[i] = (int) (Math.random() * 200) - 100;
            szamTomb3[i] = (int) (Math.random() * 200) - 100;

        }

        System.out.print("Az első tömb elemei:     ");//Tömbök értékeinek kiíratása
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%, 5d", szamTomb1[i]));
        }
            System.out.print("\n A második tömb elemei:   ");
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%, 5d", szamTomb2[i]));
        }
            System.out.print("\n A harmadik tömb elemei:  ");
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%, 5d", szamTomb3[i]));
        }
    }
}