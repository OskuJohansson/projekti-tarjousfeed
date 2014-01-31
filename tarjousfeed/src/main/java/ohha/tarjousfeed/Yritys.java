/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ohha.tarjousfeed;

import java.util.*;

/**
 *
 * @author oskajoha
 */
public class Yritys extends Kayttaja {
    
    private List<Syote> syotteet;

    public Yritys(String kayttajanimi, String salasana) {
        super(kayttajanimi, salasana);
        this.syotteet = new ArrayList<>();
    }
    
    public void asetaSyote(Syote syote) {
        syotteet.add(syote);
    }

    public List<Syote> getSyotteet() {
        return syotteet;
    }
    
    
}
