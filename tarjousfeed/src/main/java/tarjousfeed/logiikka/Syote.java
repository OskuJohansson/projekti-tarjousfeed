package tarjousfeed.logiikka;

import java.util.*;

public class Syote {

    private String sisalto;
    private final List<String> tunnisteet;

    public Syote() {
        this.tunnisteet = new ArrayList<>();
    }

    public Syote(String sisalto) {
        this.sisalto = sisalto;
        this.tunnisteet = new ArrayList<>();
    }

    public String getSisalto() {
        return sisalto;
    }

    public void setSisalto(String sisalto) {
        this.sisalto = sisalto;
    }

    public List<String> getTunnisteet() {
        return tunnisteet;
    }

    public void setTunniste(String... tunniste) {
        this.tunnisteet.addAll(Arrays.asList(tunniste));

    }

}
