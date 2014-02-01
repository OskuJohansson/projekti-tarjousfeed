package tarjousfeed.logiikka;

import java.util.*;

public class Jarjestelma {

    private final ArrayList<Kayttaja> kayttajat;
    private final Feed feed;

    public Jarjestelma() {
        this.kayttajat = new ArrayList<>();
        this.feed = new Feed();
    }

    public boolean rekisteroidy(Kayttaja kayttaja) {
        if (!kayttaja.kelpaakoSalasana(kayttaja.getSalasana())) {
            return false;
        }
        for (Kayttaja kayttaja1 : kayttajat) {
            if (kayttaja1.getKayttajanimi().equals(kayttaja.getKayttajanimi())) {
                return false;
            }
        }
        kayttajat.add(kayttaja);
        return true;
    }

    public boolean kirjauduSisaan(String kayttajanimi, String salasana) {
        for (Kayttaja kayttaja : kayttajat) {
            if (kayttaja.getKayttajanimi().equals(kayttajanimi) && kayttaja.getSalasana().equals(salasana)) {
                kayttaja.kirjauduSisaan();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    public void kirjauduUlos(Kayttaja k) {
        if (k.onkoKirjautunut() == true)
            k.kirjausuUlos();
    }

    public void listaaKayttajat() {
        for (Kayttaja kayttaja : kayttajat) {
            System.out.println(kayttaja.getKayttajanimi());
        }
    }

    public void lisaaSyote(Yritys y, Syote s) {
        feed.lisaaSyote(y, s);
    }

    public void naytaTunnisteet(Yritys y, Syote s) {
        if (!feed.getSyotteet(y).contains(s)) {
            System.out.println("Syötettä ei löytynyt!");
        } else {
            System.out.println(s.getTunnisteet());
        }
    }

    public void naytaSyote(Yritys y, Syote s) {
        if (!feed.getSyotteet(y).contains(s)) {
            System.out.println("Syotetta ei löytynyt!");
        } else {
            System.out.println("Syote: " + s.getSisalto());

        }
    }

}
