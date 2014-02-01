package tarjousfeed.logiikka;

import java.util.*;
import javax.swing.SwingUtilities;
import tarjousfeed.gui.Kayttoliittyma;

public class Main {

    public static void main(String[] args) {
        
        Jarjestelma j = new Jarjestelma();
        Kayttaja osku = new Kuluttaja("Osku", "Banaani13");

//        System.out.println("Onko Osku kirjautunut: " + osku.onkoKirjautunut());
//        j.rekisteroidy(osku);
//        j.kirjauduSisaan("osku", "banaani13");
//        System.out.println("Onko Osku kirjautunut: " + osku.onkoKirjautunut());
//        j.kirjauduSisaan("Osku", "Banaani13");
//        System.out.println("Onko Osku kirjautunut: " + osku.onkoKirjautunut());
//        System.out.println("");
//        j.rekisteroidy(new Kuluttaja("Mikko", ""));
//        j.rekisteroidy(new Kuluttaja("Matti", "A"));
//        j.rekisteroidy(new Kuluttaja("Pekka", "Carambola"));
//        j.rekisteroidy(new Kuluttaja("Johanna", "Ananas12"));
//        System.out.println("Listataan rekisteröityneet käyttäjät:");
//        j.listaaKayttajat();
//        System.out.println("");

        Yritys hese = new Yritys("Hesburger", "Japadapaduu");
        j.rekisteroidy(hese);
        j.kirjauduSisaan("Hesburger", "Japadapaduu");
        Syote hamppari = new Syote("Nyt kerroshampurilainen vain 4,95€");
        hamppari.setTunniste("Ruoka", "Rasva");
        j.lisaaSyote(hese, hamppari);
        
        j.naytaSyote(hese, hamppari);
        j.naytaTunnisteet(hese, hamppari);
        
        j.lisaaSyote(new Yritys("MacDonald's", "Töttöröö"), hamppari);
        j.naytaTunnisteet(hese, new Syote());
        
        
//        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
//        SwingUtilities.invokeLater(kayttoliittyma);
        


    }
}
