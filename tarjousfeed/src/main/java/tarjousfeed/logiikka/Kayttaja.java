package tarjousfeed.logiikka;

public class Kayttaja {

    private String kayttajanimi;
    private String salasana;
    private String nimi;
    private String email;
    private boolean kirjautunut;

    public Kayttaja(String kayttajanimi, String salasana) {
        this.kayttajanimi = kayttajanimi;
        this.salasana = salasana;
    }

    public String getKayttajanimi() {
        return kayttajanimi;
    }

    public void setKayttajanimi(String kayttajanimi) {
        this.kayttajanimi = kayttajanimi;
    }

    public String getSalasana() {
        return salasana;
    }

    public void setSalasana(String salasana) {
        if (!this.kelpaakoSalasana(salasana)) {
            return;
        }
        this.salasana = salasana;
    }
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public boolean kelpaakoSalasana(String salasana) {
        if (this.salasana.length() < 8 || this.salasana.length() > 32) {
            return false;
        }
        int apu = 0;
        for (int i = 0; i < salasana.length(); i++) {
            if (Character.isUpperCase(salasana.charAt(i))) {
               apu++;
            }
            
        }
        return 0 < apu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void kirjauduSisaan() {
        kirjautunut = true;
    }
    
    public void kirjausuUlos() {
        kirjautunut = false;
    }
    
    public boolean onkoKirjautunut() {
        return kirjautunut;
    }
}
