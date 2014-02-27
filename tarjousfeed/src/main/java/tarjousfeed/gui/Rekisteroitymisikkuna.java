/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjousfeed.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import tarjousfeed.logiikka.Jarjestelma;
import tarjousfeed.logiikka.Kayttaja;

/**
 *
 * @author Oskari
 */
public class Rekisteroitymisikkuna {

    private JFrame frame;
    private Container c;
    private Jarjestelma j;
    private JTextField kayttajanimiField = new JTextField();
    private JTextField salasanaField = new JTextField();
    private JTextField nimiField = new JTextField();
    private JTextField emailField = new JTextField();

    public Rekisteroitymisikkuna(JFrame frame, Container c, Jarjestelma j) {
        this.frame = frame;
        this.c = c;
        this.j = j;
    }

    public void luoRekisteroitymisikkuna() {
        c.setLayout(null);

        JLabel kayttajanimi = new JLabel("Käyttäjänimi");
        JLabel salasana = new JLabel("Salasana");
        JLabel nimi = new JLabel("Nimi");
        JLabel email = new JLabel("Sähköpostiosoite");

        JButton rekisteroidy = new JButton("Rekisteröidy");

        kayttajanimi.setBounds(75, 260, 100, 20);
        kayttajanimiField.setBounds(75, 280, 250, 20);
        salasana.setBounds(75, 300, 100, 20);
        salasanaField.setBounds(75, 320, 250, 20);
        nimi.setBounds(75, 340, 100, 20);
        nimiField.setBounds(75, 360, 250, 20);
        email.setBounds(75, 380, 100, 20);
        emailField.setBounds(75, 400, 250, 20);
        rekisteroidy.setBounds(75, 422, 249, 30);
        rekisteroidy.addActionListener(new Rekisteroija());
        
        c.add(kayttajanimi);
        c.add(kayttajanimiField);
        c.add(salasana);
        c.add(salasanaField);
        c.add(nimi);
        c.add(nimiField);
        c.add(email);
        c.add(emailField);
        c.add(rekisteroidy);

    }

    private class Rekisteroija implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //toteuta vielä poikkeus, jos salasana ei kelpaa
            Kayttaja k = new Kayttaja(kayttajanimiField.getText(), salasanaField.getText());
            k.setNimi(nimiField.getText());
            k.setEmail(emailField.getText());
            j.rekisteroidy(k);
            frame.getContentPane().removeAll();
            new Kirjautumisikkuna(frame, c, j).luoKirjautumisIkkuna();
            frame.getContentPane().repaint();

        }

    }
}
