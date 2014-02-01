
package tarjousfeed.logiikka;

import java.util.*;

public class Feed {

    private final Map<Yritys, ArrayList<Syote>> syotteet;

    public Feed() {
        this.syotteet = new HashMap<>();
    }

    public ArrayList<Syote> haeYrityksenSyotteet(Yritys y) {
        return syotteet.get(y);
    }

    public boolean lisaaSyote(Yritys y, Syote s) {

        if (syotteet.get(y) == null) {
            syotteet.put(y, new ArrayList<Syote>());
        }
        syotteet.get(y).add(s);
        return true;
    }
      
}
