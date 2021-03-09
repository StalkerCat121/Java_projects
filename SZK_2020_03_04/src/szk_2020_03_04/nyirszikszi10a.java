package szk_2020_03_04;

public class nyirszikszi10a {
    int birthYear;
    String name;
    
    public nyirszikszi10a() {
        birthYear = 2003;
        name = "Máté";
    }
    public nyirszikszi10a(String name) {
        this.birthYear = 1969;
        this.name = name;
    }
    public nyirszikszi10a(int birthYear) {
        this.birthYear = birthYear;
        this.name = "Feri";
    }
    public nyirszikszi10a(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
    }
    public boolean nagykoruE(){
        return this.birthYear <= 2003 ? true : false;
    }
}

