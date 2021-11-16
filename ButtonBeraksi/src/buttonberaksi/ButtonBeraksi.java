/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonberaksi;



import javax.swing.*;
public class ButtonBeraksi extends JFrame {
    JButton load = new JButton("load");
    JButton save = new JButton("save");
    public ButtonBeraksi() {
        super ("button beraksi");
        setSize(140, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(load);
        pane.add(save);
        add(pane);
        setVisible(true);
        
    }

    public static void main(String[] arguments) {
       ButtonBeraksi button = new ButtonBeraksi   

}
}