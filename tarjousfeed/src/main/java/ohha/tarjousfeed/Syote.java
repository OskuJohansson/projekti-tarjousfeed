/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ohha.tarjousfeed;
import java.util.*;

public class Syote {
    
    private String sisalto;
    private List<String> tunniste;
    

    public Syote() {
        this.tunniste = new ArrayList<>();
        
    }

    public String getSisalto() {
        return sisalto;
    }

    public void setSisalto(String sisalto) {
        this.sisalto = sisalto;
    }

    public List<String> getTunniste() {
        return tunniste;
    }

    public void setTunniste(List<String> tunniste) {
        this.tunniste = tunniste;
    }
    
    
}
