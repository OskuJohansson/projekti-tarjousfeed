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
public class Kuluttaja extends Kayttaja {
    
    private List<Yritys> suosikkiyritykset;
    private List<String> suosikkisyotteet;

    public Kuluttaja(String kayttajanimi, String salasana) {
        super(kayttajanimi, salasana);
        this.suosikkisyotteet = new ArrayList<>();
        this.suosikkiyritykset = new ArrayList<>();
    }
    
    public void asetaSuosikiksi(Yritys yritys) {
        suosikkiyritykset.add(yritys);
    }
    
    public void asetaSuosikiksi(String syote) {
        suosikkisyotteet.add(syote);
    }
    
}
