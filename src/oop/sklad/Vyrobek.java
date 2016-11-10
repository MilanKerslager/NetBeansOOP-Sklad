// třída jednoho výrobku (vlastnosti: nazev, cena, kusy)

package oop.sklad;

public class Vyrobek {
    String nazev;
    int cena;
    int kusy;

    public Vyrobek(String nazev, int cena, int kusy) {
        this.nazev = nazev;
        this.cena = cena;
        this.kusy = kusy;
    }
    
    public void vytiskniSe() {
        System.out.println("Položka: "+this.nazev);
        System.out.println("Cena: "+this.cena);
        System.out.println("Kusu: "+this.kusy);
    }
    
}
