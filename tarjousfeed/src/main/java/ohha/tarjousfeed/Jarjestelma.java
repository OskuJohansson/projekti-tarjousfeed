/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tarjousfeed;

import java.util.*;

public class Jarjestelma {

    private ArrayList<Kayttaja> kayttajat;
    private Feed feed;

    public Jarjestelma() {
        this.kayttajat = new ArrayList<>();
        this.feed = new Feed();
    }

    public void rekisteroidy(Kayttaja kayttaja) {
        kayttajat.add(kayttaja);
    }

    public boolean kirjaudu(String kayttajanimi, String salasana) {
        for (Kayttaja kayttaja : kayttajat) {
            if (kayttaja.getKayttajanimi().equals(kayttajanimi)) {
                return kayttaja.getSalasana().equals(salasana);
            }
        }

        return false;
    }

    public void listaaKayttajat() {
        for (Kayttaja kayttaja : kayttajat) {
            System.out.println(kayttaja.getKayttajanimi());
        }
    }
    
     public void lisaaSyote(Yritys y, Syote s) {
        feed.lisaaSyote(s);
        y.asetaSyote(s);
    }

    public void naytaTunnisteet(Syote s) {
        if (!feed.getSyotteet().contains(s)) {
            System.out.println("Syötettä ei löytynyt!");
        } else {
            for (Syote syote : feed.getSyotteet()) {
                if (syote.equals(s)) {
                    System.out.println("Tunnisteet: " + s.getTunnisteet());
                }
            }
        }
    }

   

    public void naytaSyote(Yritys y, Syote s) {
        if (!y.getSyotteet().contains(s)) {
            System.out.println("Syotetta ei löytynyt!");
        } else {
            for (Syote syote : y.getSyotteet()) {
                if (syote.equals(s)) {
                    System.out.println("Syote: " + s.getSisalto());
                }
            }
        }
    }
    
     public void naytaSyote(Syote s) {
        if (!feed.getSyotteet().contains(s)) {
            System.out.println("Syötettä ei löytynyt!");
        } else {
            for (Syote syote : feed.getSyotteet()) {
                if (syote.equals(s)) {
                    System.out.println("Syöte: " + s.getTunnisteet());
                }
            }
        }
    }
}
