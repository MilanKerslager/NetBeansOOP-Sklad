// Uložte do skladu seznam výrobků
package oop.sklad;

import java.util.ArrayList;

public class OOPSklad {

    public static void main(String[] args) {
        Vyrobek v = new Vyrobek("Kolečko", 10, 1);
        v.vytiskniSe();

        // výrobky jsou v poli (neefektivní, zabere místo, i když tam nic není)
        Vyrobek[] pole = new Vyrobek[100];
        pole[0] = new Vyrobek("Šroubek", 3, 67);
        pole[1] = new Vyrobek("Matička", 2, 56);
        pole[3] = new Vyrobek("Podložka", 1, 133);

        // projdeme všechny prvky pole (některé nemusí být obsazeny)
        for (Vyrobek i : pole) {
            if (i != null) {
                i.vytiskniSe();
            }
        }

        // výrobky jsou v listu (seznamu) -> zabere jen tolik, kolik obsahuje
        ArrayList<Vyrobek> seznam = new ArrayList<>();
        seznam.add(new Vyrobek("Rohlík", 2, 32));
        seznam.add(new Vyrobek("Houska", 3, 44));
        seznam.add(new Vyrobek("Kobliha", 7, 12));
        seznam.remove(0);

        // vytiskneme celý seznam
        for (Vyrobek i : seznam) {
            i.vytiskniSe();
        }
    }
}
