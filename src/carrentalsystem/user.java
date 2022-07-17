/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

/**
 *
 * @author mians
 */
public class user extends template {
    user(){
        
        super("User","Rent a car","Check Availibility");
    }

    @Override
    public void functionb1() {
        System.out.println("Booking a car");
        String d =new dateTime().date();
        new readdata().readinfo(3);
        
        //new addinfo().savedata("checkdata", "sssss", "sss", "Sss", d,false);
        
    }

    @Override
    public void functionb2() {
        System.out.println("checking avalibility");
         new readdata().readinfo(2);
    }
    
}
