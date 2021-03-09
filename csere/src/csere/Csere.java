package csere;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Csere {
    
    public static String text;
    public static String needsChange;
    public static String substitute;
    
    
       public static void main(String[] args) {
           Scanner input = new Scanner (System.in);
           File myObj = new File("filename.txt");
           System.out.print("\nMódosítandó szöveg: ");
           text = input.nextLine();
           System.out.println("\nmódosítandó: ");
           needsChange = input.nextLine();
           System.out.println("\ncsereszó: ");
           substitute = input.nextLine();
           
           
       String changed = censor("text", "needsChange", "substitute");
        System.out.println(changed);
    }
    
    public static String censor(String text, String needsChange, String substitute) {
        if (text.contains(needsChange)) {
            text = text.replaceAll(needsChange, substitute);
        }
        else {
            System.out.println("nincs ilyen szöveg");
        }
        return  text;
    }
}