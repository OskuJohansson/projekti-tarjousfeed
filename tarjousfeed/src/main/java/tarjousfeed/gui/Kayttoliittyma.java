package tarjousfeed.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Oskari
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;

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
        luoFeed(c);

    }

    private void luoFeed(Container c) {
        c.setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.setPreferredSize(new Dimension(frame.getWidth(), 70));
        JTextArea teksti = new JTextArea();
        JButton button = new JButton("Lisää");

        Lisaaja s = new Lisaaja(teksti, p);
        button.addActionListener(s);

        panel.add(teksti);
        panel.add(button);
        c.add(p);
        c.add(panel, BorderLayout.SOUTH);
    }

    private void luoKirjautumisIkkuna(Container c) {
        c.setLayout(null);

        JLabel kayttajanimi = new JLabel("Käyttäjänimi");
        JLabel salasana = new JLabel("Salasana");
        JTextField kayt = new JTextField();
        JTextField sala = new JTextField();
        JButton kirjaudu = new JButton("Kirjaudu");
        JButton rekisteroidy = new JButton("Rekisteröidy");

        kayttajanimi.setBounds(75, 300, 100, 20);
        kayt.setBounds(75, 320, 250, 20);
        salasana.setBounds(75, 340, 100, 20);
        sala.setBounds(75, 360, 250, 20);
        kirjaudu.setBounds(75, 390, 125, 20);
        rekisteroidy.setBounds(200, 390, 125, 20);

        c.add(kayttajanimi);
        c.add(kayt);
        c.add(salasana);
        c.add(sala);
        c.add(kirjaudu);
        c.add(rekisteroidy);
    }

    private void luoRekisteroitymisikkuna(Container c) {
        c.setLayout(null);

        JLabel kayttajanimi = new JLabel("Käyttäjänimi");
        JLabel salasana = new JLabel("Salasana");
        JLabel nimi = new JLabel("Nimi");
        JLabel email = new JLabel("Sähköpostiosoite");
        
        JTextField kayttajanimiField = new JTextField();
        JTextField salasanaField = new JTextField();
        JTextField nimiField = new JTextField();
        JTextField emailField = new JTextField();
        
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

    public JFrame getFrame() {
        return frame;
    }

}
