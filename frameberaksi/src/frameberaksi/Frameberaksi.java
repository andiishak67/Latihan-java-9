/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameberaksi;

/**
 *
 * @author ASUS
 */
import javax.swing.*;

public class Frameberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame("Frame beraksi");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JLabel emptyLabel = new JLabel("Frame Beraksi");
       frame.getContentPane().add(emptyLabel);
       
       frame.setSize(400,200);
       frame.setVisible(true);
    }
    
}
