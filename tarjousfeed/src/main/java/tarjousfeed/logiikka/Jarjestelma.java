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
        if (k.onkoKirjautunut() == true) {
            k.kirjauduUlos();
        }
    }

    public void listaaKayttajat() {
        for (Kayttaja kayttaja : kayttajat) {
            System.out.println(kayttaja.getKayttajanimi());
        }
    }

    public void listaaKirjautuneet() {
        for (Kayttaja kayttaja : kayttajat) {
            if (kayttaja.onkoKirjautunut() == true) {
                System.out.println(kayttaja.getKayttajanimi());
            }
        }
    }

    public boolean lisaaSyote(Yritys y, Syote s) {
        if (!kayttajat.contains(y)) {
            return false;
        }
        return feed.lisaaSyote(y, s);
    }

    public void naytaTunnisteet(Yritys y, Syote s) {
        if (feed.haeYrityksenSyotteet(y).contains(s)) {
            System.out.println(s.getTunnisteet());
        } else {
            System.out.println("Syötettä ei löytynyt!");
        }
    }

    public void naytaSyote(Yritys y, Syote s) {
        if (feed.haeYrityksenSyotteet(y).contains(s)) {
            System.out.println("Syote: " + s.getSisalto());

        } else {
            System.out.println("Syotetta ei löytynyt!");
        }
    }

}
