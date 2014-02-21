
package tarjousfeed.logiikka;

import java.util.*;

public class Feed {

    private final Map<Yritys, ArrayList<Paivitys>> paivitykset;

    public Feed() {
        this.paivitykset = new HashMap<>();
    }

    public ArrayList<Paivitys> haeYrityksenPaivitykset(Yritys y) {
        return paivitykset.get(y);
    }

    public boolean lisaaPaivitys(Yritys y, Paivitys s) {

        if (paivitykset.get(y) == null) {
            paivitykset.put(y, new ArrayList<Paivitys>());
        }
        paivitykset.get(y).add(s);
        return true;
    }
      
}
