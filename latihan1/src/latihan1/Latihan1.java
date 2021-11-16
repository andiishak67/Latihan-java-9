/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan1;

/**
 *
 * @author ASUS
 */
import javax.swing.*;

public class Latihan1 {
    JFrame f = new JFrame("latihan frame");
    JPanel p = new JPanel();
    JButton b = new JButton("press me");
    
    
    public static void main(String[] args) {
        
    JFrame f = new JFrame("latihan frame");
    f.setBounds(20, 30, 300, 100);
    
    
    JPanel p = new JPanel();
    JButton b = new JButton("Tombol Hitung");
    b.setBounds(20, 20, 200, 20);
    
    p.add(b);
    f.setContentPane(p);
    
    f.show();
    }
    
}
