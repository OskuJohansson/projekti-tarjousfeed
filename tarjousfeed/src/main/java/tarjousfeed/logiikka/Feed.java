/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjousfeed.logiikka;

import java.util.ArrayList;

public class Feed {

    private final ArrayList<Syote> syotteet;

    public Feed() {
        this.syotteet = new ArrayList<>();
    }

    public ArrayList<Syote> getSyotteet() {
        return syotteet;
    }

    public void lisaaSyote(Syote syote) {
        syotteet.add(syote);
    }
    
}
