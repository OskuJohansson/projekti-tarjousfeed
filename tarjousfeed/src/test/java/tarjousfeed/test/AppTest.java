package tarjousfeed.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import tarjousfeed.logiikka.Jarjestelma;
import tarjousfeed.logiikka.Kayttaja;
import tarjousfeed.logiikka.Yritys;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

 
    public void rekisteroityminenHuonollaSalasanalla() {
        Jarjestelma j = new Jarjestelma();
        Kayttaja k = new Yritys("Testi", "a");
        j.rekisteroidy(k);
        assertFalse(j.getKayttajat().contains(k));
    }
    

}
