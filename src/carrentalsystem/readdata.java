/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;

/**
 *
 * @author mians
 */
public class readdata {
    readdata(){
        
    }
    public String path=new fileadress().Adress();
    public int count =5;
   void  readinfo(int check){
   int count1=this.length();
    String line="";   
    String []data={};
    String [][]myArray= new String[this.count][];
    String [] names= new String [ this.count];
    
    
       try{
           BufferedReader bf= new BufferedReader(new FileReader(this.path));
           int i=0;
           while((line = bf.readLine())!=null){
               
               data=(line.split(","));
               
               myArray[i] = data;
               if (!data[4].equals( new dateTime().date())){
               names[i]=data[0];
               }
               else{
                   names[i]="NA";
               }
               i++;
               
           }
           if (check==1){

           this.display(myArray);
           
           return ;
           }
           else if (check==2){
               String readdata[][]= new String [this.count][];
               String[] fill= {"E","M","P","T","Y"};

               
               int k=myArray.length-1;
               String T =new dateTime().date();
               while(k>=0){
                   
                  if( !myArray[k][4].equals(T)){
                      System.out.println(myArray[k][3]);
                      readdata[k]= myArray[k];
                  }
                  else{
                     readdata[k]= fill; 
                  }
                  k--;
               }
               this.display(readdata);
           }
           else if( check==3){
               //System.out.println(Arrays.toString(names));
               new SelectCarUi().car(names,myArray);
               // remeber that this fuction from here will go to another class that will dispplay; 
               // data in list to be a ble for user t select a new ride;
           }
           else{
               
           }
           
           
       }catch(Exception e){
           System.out.println(e);
           
       }
       return ;
   }
   
  public void display(String[][]data){
      
      String column []={"Name","vehicle nu","vehicleName","Type","Date"};
      JFrame f= new JFrame("Reading data ");
      JPanel p = new JPanel( );
      
      JTable t =new JTable(data,column);
      t.setEnabled(true);
      t.setBounds(30,40,400,200);
      p.add(t);
      JScrollPane sp= new JScrollPane(t);
      f.add(p);
      f.add(sp);
      
      f.setVisible(true);
      f.setSize(500, 300);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public int length(){
      try{
      BufferedReader bf= new BufferedReader(new FileReader(this.path));
           this.count=0;
           String line="";
           while((line = bf.readLine())!=null){
              count++;
           }
           
           return count;
           
           
       }catch(Exception e){
           System.out.println(e);
           this.count=5;
           
       }
      this.count =5;
       return count;
      
  }
}
