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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import tarjousfeed.logiikka.Jarjestelma;
import tarjousfeed.logiikka.Kayttaja;
import tarjousfeed.logiikka.Kuluttaja;

/**
 *
 * @author Oskari
 */
public class Feed {

    private Container c;
    private JFrame frame;
    private Jarjestelma j;
    private Kayttaja kayttaja;

    public Feed(Container c, JFrame frame, Jarjestelma j, Kayttaja k) {
        this.c = c;
        this.frame = frame;
        this.j = j;
        this.kayttaja = k;
    }

    public void luoFeedIkkuna() {
        c.setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.setPreferredSize(new Dimension(frame.getWidth(), 70));

        panel.add(new JButton("Kaikki"));
        JButton suosikit = new JButton("Suosikit");
        suosikit.addActionListener(new SuosikkeihinSiirtaja());
        panel.add(suosikit);
        c.add(p);
        c.add(panel, BorderLayout.SOUTH);

    }

    private class SuosikkeihinSiirtaja implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.getContentPane().removeAll();
            new Suosikkitunnisteet(c, frame, j, (Kuluttaja) kayttaja).luoSuosikkitunnisteetIkkuna();
            frame.getContentPane().revalidate();
        }

    }
}
