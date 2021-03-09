package szk_2020_03_04;

public class SZK_2020_03_04 {

    public static void main(String[] args) {
        nyirszikszi10a first = new nyirszikszi10a();
        nyirszikszi10a second = new nyirszikszi10a(18);
        nyirszikszi10a third = new nyirszikszi10a("Feri");   
        nyirszikszi10a fourth = new nyirszikszi10a("Ádi", 19);
        
        System.out.println("1Név: " + first.name + " Szül év: " + first.birthYear + " Nagykorú: " + first.nagykoruE());
        System.out.println("2Név: " + second.name + " Szül év: " + second.birthYear + " Nagykorú: " + second.nagykoruE());
        System.out.println("3Név: " + third.name + " Szül év: " + third.birthYear + " Nagykorú: " + third.nagykoruE());
        System.out.println("4Név: " + fourth.name + " Szül év: " + fourth.birthYear + " Nagykorú: " + fourth.nagykoruE());
    }
    
}
