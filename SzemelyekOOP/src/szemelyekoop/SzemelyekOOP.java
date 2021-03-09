package szemelyekoop;

public class SzemelyekOOP {

    public static void main(String[] args) {
        Szemelyek Máté = new Szemelyek();
        
        Máté.iq = 144;
        Máté.hajsz = "Barna";
        Máté.hazas = true;
        Máté.kor = 17;
        Máté.magas = 182;
        Máté.nem = "Férfi";
        Máté.suly = 69;
        
        
        Tanulok Elemér = new Tanulok();
        
        Elemér.szak = "Színész";
        Elemér.belepes = 8;
        Elemér.osztondij = true;
        
        
        Tanarok István = new Tanarok();
        
        István.oraszam = 32;
        István.osztalyfonok = false;
        
        System.out.println(Máté.suly);
        System.out.println(Elemér.osztondij);
        System.out.println(István.oraszam);
    }
    
}
