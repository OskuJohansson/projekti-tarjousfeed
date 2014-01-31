/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjousfeed.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
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

        container.add(new JScrollBar(), BorderLayout.EAST);
        JButton nappi = new JButton("Feed #1");
        nappi.addActionListener(new Kuuntelija());
        container.add(nappi);
    }

    public JFrame getFrame() {
        return frame;
    }

}
