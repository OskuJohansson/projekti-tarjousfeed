package ohha.tarjousfeed;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {
        Jarjestelma j = new Jarjestelma();
        
        Kayttaja osku = new Kuluttaja("Osku", "B");
        
        System.out.println("Onko osku kirjautunut: " + j.kirjaudu("osku", "jss"));
        System.out.println("Onko osku kirjautunut: " + j.kirjaudu("osku", "b"));
        System.out.println("Onko osku kirjautunut: " + j.kirjaudu("Osku", "B"));
        j.rekisteroidy(osku);
        System.out.println("Onko osku kirjautunut: " + j.kirjaudu("osku", "B"));
        System.out.println("Onko osku kirjautunut: " + j.kirjaudu("Osku", "B"));
        
        j.rekisteroidy(new Kuluttaja("Mikko", " "));
        j.rekisteroidy(new Kuluttaja("Matti", "A"));
        j.rekisteroidy(new Kuluttaja("Pekka", "C"));
        j.rekisteroidy(new Kuluttaja("Johanna", "A"));
        j.listaaKayttajat();
        
        Yritys Hese = new Yritys("Hesburger", "j");
    }
}
