/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarjousfeed.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Oskari
 */
public class Lisaaja implements ActionListener, KeyListener {
    
    private JTextArea input;
    private JPanel feed;
    
    public Lisaaja(JTextArea input, JPanel feed) {
        this.input = input;
        this.feed = feed;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JLabel teksti = new JLabel();
        teksti.setText(input.getText());
        input.setText("");
        feed.add(teksti);
    
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            JLabel teksti = new JLabel();
        teksti.setText(input.getText());
        input.setText("");
        feed.add(teksti);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
