package csere1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Csere1 {

    public static String szoveg;
    public static String csereSzoveg;
    public static String ujSzoveg;
 
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        Scanner bemenet = new Scanner(System.in);
        
        System.out.print("\nAdd meg a módosítandó szöveged! ");
        szoveg = bemenet.nextLine();
        System.out.print("Add meg a módosítandó szót! ");
        csereSzoveg = bemenet.nextLine();
        System.out.print("Add meg a csereszót! ");
        ujSzoveg = bemenet.nextLine();
        
        String modositottSzoveg = Csere(szoveg, csereSzoveg, ujSzoveg);
        System.out.print("\n\n" +modositottSzoveg + "\n");
    }
    
    public static String Csere(String szoveg, String mit, String mire) {
        if (szoveg.contains(mit)) 
            szoveg = szoveg.replaceAll(mit, mire); 
        else 
            System.out.println("\nNem található a módosítandó szó! \n");
        return szoveg;
    }
}