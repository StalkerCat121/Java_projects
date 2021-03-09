package korkerul;
import java.util.Scanner;

public class KorKerul {

    public static kor first = new kor();
    public static int answer;
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        do {            
            System.out.print("Alap értékekkel dolgozik? 0-n 1-y ");
            answer = input.nextInt();
            auto();
            
            System.out.print("Újra? 0-n 1-y ");
            answer = input.nextInt();
        } while (answer == 1);
        

    }
    public static void auto(){
        if (answer == 1) 
            first.r = 5;
        else{
            System.out.print("Sugár értéke: ");
            first.r = input.nextInt();
        }
        first.ker();
        first.ter();
        first.kiir();
    }
}