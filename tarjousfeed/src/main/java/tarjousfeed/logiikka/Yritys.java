/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarjousfeed.logiikka;

import java.util.*;

/**
 *
 * @author oskajoha
 */
public class Yritys extends Kayttaja {
    
    private final List<Paivitys> paivitykset;

    public Yritys(String kayttajanimi, String salasana) {
        super(kayttajanimi, salasana);
        this.paivitykset = new ArrayList<>();
    }
    
    public void asetaPaivitys(Paivitys syote) {
        paivitykset.add(syote);
    }

    public List<Paivitys> getPaivitykset() {
        return paivitykset;
    }
    
    
}
