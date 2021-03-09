package macskasitas;

public class Cat extends Animal implements Pet {
    
    public Cat() {
        this.setName("Noname macska");
    }
    
    public Cat(String nev) {
        this.setName(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("MEOW");
    }

    @Override
    public void cuddle() {
        System.out.println(this.getName() + " cuddles! ");
    }

    @Override
    public void lay() {
        System.out.println(this.getName() + " lays down.");
    }
}