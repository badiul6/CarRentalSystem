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
public class fileadress {
    String Adress(){
        String cwd = System.getProperty("user.dir");
        cwd=cwd+"\\src\\carrentalsystem\\data.csv";
        System.out.println(cwd);
        return cwd;
    }
}
