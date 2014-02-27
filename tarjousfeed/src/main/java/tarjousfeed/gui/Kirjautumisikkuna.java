/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjousfeed.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import tarjousfeed.logiikka.Jarjestelma;
import tarjousfeed.logiikka.Kayttaja;
import tarjousfeed.logiikka.Kuluttaja;

/**
 *
 * @author Oskari
 */
public class Kirjautumisikkuna {

    private JFrame frame;
    private Container c;
    private Jarjestelma j;
    private JTextField kayt;
    private JPasswordField sala;
    private Kayttaja kayttaja;

    public Kirjautumisikkuna(JFrame frame, Container c, Jarjestelma j) {
        this.frame = frame;
        this.c = c;
        this.j = j;
        kayt = new JTextField();
        sala = new JPasswordField();

    }

    public void luoKirjautumisIkkuna() {
        c.setLayout(null);

        JLabel kayttajanimi = new JLabel("Käyttäjänimi");
        JLabel salasana = new JLabel("Salasana");
        JButton kirjaudu = new JButton("Kirjaudu");
        JButton rekisteroidy = new JButton("Rekisteröidy");

        kayttajanimi.setBounds(75, 300, 100, 20);
        kayt.setBounds(75, 320, 250, 20);
        salasana.setBounds(75, 340, 100, 20);
        sala.setBounds(75, 360, 250, 20);
        kirjaudu.setBounds(75, 390, 125, 20);
        rekisteroidy.setBounds(200, 390, 125, 20);
        kirjaudu.addActionListener(new Kirjautuja());
        rekisteroidy.addActionListener(new RekisteroitymiseenSiirtaja());

        c.add(kayttajanimi);
        c.add(kayt);
        c.add(salasana);
        c.add(sala);
        c.add(kirjaudu);
        c.add(rekisteroidy);
    }

    private class Kirjautuja implements ActionListener {

     
        public void actionPerformed(ActionEvent e) {
            String apu = new String(sala.getPassword());

                for (Kayttaja k : j.getKayttajat()) {
                    if (k.getKayttajanimi().equals(kayt.getText()) && k.getSalasana().equals(apu)) {
                        kayttaja = k;
                        frame.getContentPane().removeAll();
                        new Feed(c, frame, j, kayttaja).luoFeedIkkuna();
                        frame.getContentPane().revalidate();
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tarkista käyttäjänimi ja salasana");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Tarkista käyttäjänimi ja salasana");

            }
        }
    

    private class RekisteroitymiseenSiirtaja implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.getContentPane().removeAll();
            new Rekisteroitymisikkuna(frame, c, j).luoRekisteroitymisikkuna();
            frame.getContentPane().repaint();
        }

    }
}
