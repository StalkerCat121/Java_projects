package elsoproject;

public class Human {
   private String name;
    private int age;
    
    public void hello() {
        System.out.println("Az én nevem " + this.name);
    }
    
    //getter method(adat elérése)
    public String nameGet() {
        return this.name;
    }
    //setter method(adat átalakítása)
    public void nameSet(String name) {
        this.name = name;
    }
    //kor getter method
    public int ageGet() {
        return age;
    }
    //kor setter method
    public void ageSet(int kor) {
        this.age = kor;
    }
    
    
}