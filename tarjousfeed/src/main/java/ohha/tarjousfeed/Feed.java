/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tarjousfeed;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    private List<Syote> syotteet;

    public Feed() {
        this.syotteet = new ArrayList<>();
    }

    public List<Syote> getSyotteet() {
        return syotteet;
    }

    public void lisaaSyote(Syote syote) {
        syotteet.add(syote);
    }
    
}
