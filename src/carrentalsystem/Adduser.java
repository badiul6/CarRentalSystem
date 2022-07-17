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
public class Adduser {
    Adduser(){
    JFrame f = new JFrame("Add new car");
    JPanel p= new JPanel(new GridBagLayout());
    GridBagConstraints c =new GridBagConstraints();
    JButton b1= new JButton("Submit");
    JButton b2= new JButton("back");
    JLabel l1 =new JLabel("Enter Driver name"); JTextField t1= new JTextField(20); 
    JLabel l3 =new JLabel("Enter car name"); JTextField t3= new JTextField(20); 
    JLabel l2 =new JLabel("Enter Car number plate");JTextField t2= new JTextField(20);
    JRadioButton r1=new JRadioButton("Economy");
    JRadioButton r2=new JRadioButton("Buisness");
    JRadioButton r3=new JRadioButton("Premium");
    
    

    c.gridx=0;c.gridy=0;
    p.add(l1,c);
    c.gridx=1;c.gridy=0;
    p.add(t1,c);
    c.gridx=0;c.gridy=1;
    p.add(l2,c);
    c.gridx=1;c.gridy=1;
    p.add(t2,c);
    c.gridx=0;c.gridy=2;
    p.add(r1,c);
    c.gridx=1;c.gridy=2;
    p.add(r2,c);
    c.gridx=2;c.gridy=2;
    p.add(r3,c);
    c.gridx=0;c.gridy=3;
    p.add(l3,c);
    c.gridx=1;c.gridy=3;
    p.add(t3,c);
    
    f.add(p); f.add(b2,BorderLayout.PAGE_START); f.add(b1,BorderLayout.PAGE_END);
    f.setSize(500,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            f.dispose();
            new Admin();
            
        }
    });
     b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            f.dispose();
            String type="";
            if(r1.isSelected()){
                type ="Economy"; 
            }
            else if(r2.isSelected()){
                type ="Buisness";
            }
            else if(r3.isSelected()){
                type ="Premium";
            }
            else{
                JOptionPane.showMessageDialog(null, " kindly select one option  .");
                f.dispose();
                new Adduser();
                return;
                
            }
            
           
            int check=new addinfo().savedata(t1.getText(),t2.getText(),t3.getText(),type,"0",true);
            if(check== 0){
                JOptionPane.showMessageDialog(null, " Data saved successfully.");
                new Admin();
            }
            else{
                JOptionPane.showMessageDialog(null, "Data not saved .");
                new Adduser();
                return;
            }
            
        }
    });
    }
    

    
}
