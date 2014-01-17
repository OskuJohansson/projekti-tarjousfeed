/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tarjousfeed;

import java.util.*;

public class Jarjestelma {

    private ArrayList<Kayttaja> kayttajat;

    public Jarjestelma() {
        this.kayttajat = new ArrayList<>();

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
}
