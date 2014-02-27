
package tarjousfeed.logiikka;

import java.util.*;

public class Kuluttaja extends Kayttaja {

    private final List<Yritys> suosikkiyritykset;
    private final List<String> suosikkitunnisteet;

    public Kuluttaja(String kayttajanimi, String salasana) {
        super(kayttajanimi, salasana);
        this.suosikkitunnisteet = new ArrayList<>();
        this.suosikkiyritykset = new ArrayList<>();
    }

    public void asetaYritysSuosikiksi(Yritys yritys) {
        suosikkiyritykset.add(yritys);
    }

    public void asetaTunnisteSuosikiksi(String tunniste) {
        if (!suosikkitunnisteet.contains(tunniste)) {
            suosikkitunnisteet.add(tunniste);
        }
    }

    public List<String> getSuosikkitunnisteet() {
        return suosikkitunnisteet;
    }
}
