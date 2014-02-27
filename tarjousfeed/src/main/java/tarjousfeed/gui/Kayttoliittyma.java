package tarjousfeed.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import tarjousfeed.logiikka.Jarjestelma;
import tarjousfeed.logiikka.Kuluttaja;

/**
 *
 * @author Oskari
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Jarjestelma j;

    public Kayttoliittyma(Jarjestelma j) {
        this.j = j;
    }

    @Override
    public void run() {
        frame = new JFrame("Feed");
        frame.setPreferredSize(new Dimension(400, 800));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container c) {
        new Kirjautumisikkuna(frame, c, j).luoKirjautumisIkkuna();
    }

 


    public JFrame getFrame() {
        return frame;
    }

}
