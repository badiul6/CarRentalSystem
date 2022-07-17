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
import javax.swing.*;

/**
 *
 * @author mians
 */
public class SelectCarUi {
    String data[][]= {};
    public void car(String names[],String data[][]){ 
    this.data=data;
    String information="You are about to rent a car\n remember  \n cars are only rented for one day \n we have no policy on type ofcars you get cars on fort come first come services";
    JComboBox b =new JComboBox(names);
    JFrame f= new JFrame();
    JPanel p = new JPanel();
    JTextArea t= new JTextArea(information);
    JPanel p1 = new JPanel();
    JButton b1 =  new JButton("Back");
    JButton b2 =  new JButton("Submit");
    
    
    //GridBagConstraints c = new GridBagConstraints();
    //c.gridx=0;c.gridy=0;
    p.add(b);
    p1.add(t);
    
    f.add(p,BorderLayout.EAST);
    f.add(p1,BorderLayout.WEST);
    f.add(b1,BorderLayout.PAGE_START);
    f.add(b2,BorderLayout.PAGE_END);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
   f.setSize(500, 300);
   b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            f.dispose();
            new user();
        }
    });
    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            f.dispose();
            int x=b.getSelectedIndex();
            selecting_rent(x);// index is selected for the car to be able to rent
            
            
        }
    });   
     
    return ;
    }
    
    public void selecting_rent(int index){
        boolean t;
        String date= new dateTime().date();
        data[index][4]=date;
        String type = data[index][3];
        String cost="";
        cost=this.messasge(type);
        String Message="Car booked for Amount:Rs"+cost;
        
        
        
        int j= new readdata().length();
        
        new addinfo().savedata("NA", "NA", "NA", "NA","Na", false);

        for (int i=0;i<j;i++){
             
             new addinfo().savedata(data[i][0], data[i][1], data[i][2], data[i][3],data[i][4], true);
             
        }
        new StartUi(Message);
    }
    
    public String messasge(String type){
        String cost="";
        if (type=="Economy"){cost="3000";}
        else if( type =="Buisness"){cost="5000";}
        else {cost="7000";}
        return cost;
    } 
    

}