/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tarjousfeed;

import java.util.ArrayList;
import java.util.List;

public class Virta {

    private List<Syote> syotteet;

    public Virta() {
        this.syotteet = new ArrayList<>();

    }

    public List<Syote> getSyotteet() {
        return syotteet;
    }

    public void setSyotteet(List<Syote> syotteet) {
        this.syotteet = syotteet;
    }
}
