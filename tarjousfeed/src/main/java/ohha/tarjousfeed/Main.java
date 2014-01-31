package ohha.tarjousfeed;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {
        Jarjestelma j = new Jarjestelma();

        Kayttaja osku = new Kuluttaja("Osku", "B");

        System.out.println("Onko Osku kirjautunut: " + j.kirjaudu("Osku", "B"));
        j.rekisteroidy(osku);
        System.out.println("Onko Osku kirjautunut: " + j.kirjaudu("osku", "B"));
        System.out.println("Onko Osku kirjautunut: " + j.kirjaudu("Osku", "B"));
        System.out.println("");
        j.rekisteroidy(new Kuluttaja("Mikko", ""));
        j.rekisteroidy(new Kuluttaja("Matti", "A"));
        j.rekisteroidy(new Kuluttaja("Pekka", "C"));
        j.rekisteroidy(new Kuluttaja("Johanna", "A"));
        System.out.println("Listataan rekisteröityneet käyttäjät:");
        j.listaaKayttajat();

        Yritys Hese = new Yritys("Hesburger", "j");
        j.rekisteroidy(Hese);
        Syote hamppari = new Syote("Nyt kerroshampurilainen vain 4,95€");
        hamppari.setTunniste("Ruoka", "Rasva");
        j.lisaaSyote(Hese, hamppari);
        j.naytaSyote(Hese, hamppari);
        j.naytaTunnisteet(hamppari);
        j.naytaTunnisteet(new Syote());

    }
}
