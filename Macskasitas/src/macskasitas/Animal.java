package macskasitas;

public abstract class Animal {
    String name;
    private int weight;
    
    protected void makeSound() {
        System.out.println("A!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }  
}
