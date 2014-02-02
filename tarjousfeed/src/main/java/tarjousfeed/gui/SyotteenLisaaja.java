/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarjousfeed.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Oskari
 */
public class SyotteenLisaaja implements ActionListener {
    
    private JTextArea input;
    private JPanel feed;
    
    public SyotteenLisaaja(JTextArea input, JPanel feed) {
        this.input = input;
        this.feed = feed;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JLabel teksti = new JLabel();
        teksti.setText(input.getText());
        feed.add(teksti);
    
    }
    
}
