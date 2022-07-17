/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author mians
 */
public class StartUi {
  

    StartUi(String A){
    
    JFrame f = new JFrame("Car rental system");
    JPanel p=  new JPanel(new GridLayout());
    JButton b1 = new JButton("Admin");
    JButton b2= new JButton("Book a ride");
    //b1.setBounds(100,50,100,70);
    
    //b1.setBounds(200,50,200,150);
    p.add(b1);
    p.add(b2);
    
    f.add(p);
    f.pack();
    f.setSize(500,300);
    //f.setLayout(null);
    f.setVisible(true);
    JOptionPane.showMessageDialog(f, A);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
             //To change body of generated methods, choose Tools | Templates.
             f.dispose();
             new Admin();
        }
    });
    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
             //To change body of generated methods, choose Tools | Templates.
             System.out.println("Hellow again");
             f.dispose();
             new user ();
        }
    });
    

}
}
