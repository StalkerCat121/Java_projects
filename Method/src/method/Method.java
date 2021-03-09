package method;
import java.util.Scanner;

public class Method {
       static void tagolas(){
        System.out.println("\n---------------------------------------------\n");
    }
       
       public static void korMinosites(int eletKor){
           if (eletKor < 18) {
               System.out.println("Kiskorú");
           }
           else if (eletKor < 65) {
               System.out.println("Felnőtt");
           }
           else {
               System.out.println("Nyugdíjas");
           }
       }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ansswer;
        tagolas();
        System.out.println("Név");
        tagolas();
        do {            
            System.out.println("életkor");
            korMinosites(input.nextInt());
            System.out.println("újra futtatja? 1=y 0=n ");
            ansswer = input.nextInt();
        } while (ansswer == 1);
    }
    
}