package pkgswitch;
import java.util.Scanner;

public class Switch {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer;
        
            System.out.print("1-7-ig számot adjon meg! ");
        answer = input.nextInt();
        
        while (answer > 7 || answer <= 0) {            
            System.out.print("1-7-ig!");
            answer = input.nextInt(); 
        }
        switch (answer) {
            case 1:
                System.out.println("Hétfő");
                break;
            case 2:
                System.out.println("Kedd");
                break;
            case 3:
                System.out.println("Szerda");
                break;
            case 4:
                System.out.println("Csütörtök");
                break;
            case 5:
                System.out.println("Péntek");
                break;
            case 6:
                System.out.println("Szombat");
                break;
            case 7:
                System.out.println("Vasárnap");
                break;
         }
        
    }
}
