/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mians
 */
public abstract class template {
    //String title, button1_name, button2_name;
      
        
    template(String title,String buton1_name,String button_2){
  
    JFrame f= new JFrame(title);
    JPanel p= new JPanel(new GridLayout());
    JButton b1=new JButton(buton1_name);
    JButton b3=new JButton("BACK");
    JButton b2=new JButton(button_2);
    GridBagConstraints c= new GridBagConstraints();
    
    
    c.gridx=0; c.gridy=0;
    p.add(b1,c);
    c.gridx=0; c.gridy=1;
    p.add(b2,c);
    f.add(p);
    f.add(b3,BorderLayout.PAGE_END);
    f.setVisible(true);
    f.setSize(500,300);
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            f.dispose();
            new StartUi("Welcome back");
        }
    });
    
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            f.dispose();
             functionb1();
        }
    } );
        b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            functionb2();
        }
    } );

    }
        
    
    
    public abstract void functionb1();
    public abstract void functionb2();
    
}
