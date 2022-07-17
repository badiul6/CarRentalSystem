/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;


/**
 *
 * @author mians
 */
public class addinfo {
    
    addinfo( ){
        System.out.println("created");
    }
    String path=new fileadress().Adress();
    public int savedata(String name, String number_plate, String car_name, String type,String date, boolean writer){
        try{
        
        FileWriter fw = new FileWriter (this.path, writer);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw =new PrintWriter(bw);
        
        pw.println(name+","+number_plate+","+car_name+","+type+","+ date);
        System.out.println(name+","+number_plate+","+car_name+","+type);
        pw.flush();
        pw.close();
        return 0;
        
        }
        catch (Exception E){
            return 1;
        }
    }
    
    }
    



