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

    private void luoKomponentit(Container container) {
        container.setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        JLabel label = new JLabel();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        JTextArea teksti = new JTextArea();
        JButton button = new JButton("Lisää");

        SyotteenLisaaja s = new SyotteenLisaaja(teksti, p);
        button.addActionListener(s);

        panel.add(teksti);
        panel.add(button);
        p.add(label);
        container.add(p);
        container.add(panel, BorderLayout.SOUTH);

    }

    public JFrame getFrame() {
        return frame;
    }

}
