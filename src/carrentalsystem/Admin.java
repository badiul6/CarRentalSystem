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
public class Admin extends template  {
    Admin(){
        super("ADMIN","NEWCAR","Read Data");
    }

    @Override
    public void functionb1() {
        System.out.println("Adding new user");
        new Adduser();
        
        
    }

    @Override
    public void functionb2() {
        System.out.println("reading data");
        new readdata().readinfo(1);
        //new Admin();
        
        
    }
    
    
    }
