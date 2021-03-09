package elsoproject;

public class ElsoProject {

    public static void main(String[] args) {
        Human human= new Human();
        
        human.ageSet(17);
        human.nameSet("Máté");
        
        //ternáris op.
        System.out.println(human.nameGet()== null ? " - " : "Név: " + human.nameGet());
    }
    
}
