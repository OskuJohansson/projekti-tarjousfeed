/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarjousfeed.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import tarjousfeed.logiikka.Kuluttaja;

/**
 *
 * @author Oskari
 */
public class Suosikkitunnisteet {
    
    private Container c;
    private JFrame frame;
    private Kuluttaja kuluttaja;
    
    public Suosikkitunnisteet(Container c, JFrame frame, Kuluttaja kayttaja) {
        this.frame = frame;
        this.c = c;
        this.kuluttaja = kayttaja;
        
    }
    
    public void luoSuosikkitunnisteetIkkuna() {
        c.setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        for (String tunniste : kuluttaja.getSuosikkitunnisteet()) {
            p.add(new JLabel(tunniste));
        }

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.setPreferredSize(new Dimension(frame.getWidth(), 70));     

        panel.add(new JButton("Kaikki"));
        panel.add(new JButton("Suosikit"));
        c.add(p);
        c.add(panel, BorderLayout.SOUTH);
    }
    
}
