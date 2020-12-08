package megszamlalas;
import java.util.Scanner;

public class Megszamlalas {
  
    public static void main(String[] args) {
        
       int valasz;
        int sz;
        int sz2;
        sz = 0;
        
        Scanner bemenet = new Scanner(System.in);
        System.out.println("Hány szám jelenjen meg?");
        valasz = bemenet.nextInt();
        
        int tomb[]=new int[valasz];
        int tomb2[]=new int[valasz];
        int answer[]=new int[valasz]; 
        for (int i = 0; i < valasz; i++){
            
        tomb[i]=(int) (Math.random()*999)+1;
        tomb2[i]=(int) (Math.random()*999)+1;
        answer[i]=(int) tomb[i] + tomb2[i];
        sz2 = sz + i+1;
        
        
        if (tomb[i] > -1 && tomb[i] < 10) {
              System.out.print("\n" + sz2 + ".:  " + tomb[i]); 
            }
            else if (tomb[i] > 9 && tomb[i] < 100) {
               System.out.print("\n" + sz2 + ".:  " + tomb[i]);  
            }
            else if(tomb[i] > 99 && tomb2[i] < 1000)
            {
                System.out.print("\n" + sz2 + ".:  " + tomb[i]);  
            }
            else {
               System.out.print("\n" + sz2 + ".: " + tomb[i]);  
            }
        

        if ( tomb2[i] > -1 && tomb2[i] < 10 ) {
              System.out.print(" +  " + tomb2[i]); 
            }
            else if(tomb2[i] > 9 && tomb2[i] < 100) {
               System.out.print(" +  " + tomb2[i]);  
            }
            else if (tomb2[i] > 99 && tomb2[i] < 1000) {
                System.out.print(" +  " + tomb2[i]);
            }
            else {
                System.out.print(" + " + tomb2[i]);
            }
        
        
        if ( answer[i] > -1 && answer[i] < 10  ) {
              System.out.print(" =  " + answer[i]); 
            }
            else if(answer[i] > 9 && answer[i] < 100) {
               System.out.print(" =  " + answer[i]);  
            }
            else if(answer[i] > 99 && answer[i] < 1000){
                System.out.print(" =  " + answer[i]);
            }
            else{
                System.out.print(" = " + answer[i]);
            }
        }
        
        
       
    }
    
}