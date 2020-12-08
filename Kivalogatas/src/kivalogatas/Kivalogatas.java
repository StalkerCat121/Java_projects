package kivalogatas;

import java.util.Scanner;

public class Kivalogatas {

    public static void main(String[] args) {
        int[] erdemJegy;
        int[] masolat;
        int kettesekDb=0;
        erdemJegy = new int[5];
        masolat=new int[5];

        Scanner bemenet = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Adj meg egy szamot 1 és 5 között");
            erdemJegy[i] = bemenet.nextInt();

            while (!(erdemJegy[i]<= 5 && erdemJegy[i]>= 1)) {
            System.out.println("Rossz számot adtál meg! Adj meg egy szamot 1 és 5 között");
            erdemJegy[i] = bemenet.nextInt();

            }

        }
            for (int i = 0; i < 5; i++) {
            System.out.print(i+1+" .jegy "+String.format("%,2d", erdemJegy[i]));
        }
            System.out.println("");
        
        for (int i = 0; i < 5; i++) {
            if (erdemJegy[i]==2) {
                masolat[kettesekDb++]=erdemJegy[i];
            }
        }
        
        System.out.print("Másolat elemei");
    }
    
}