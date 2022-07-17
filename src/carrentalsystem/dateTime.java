/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mians
 */
public class dateTime {
    public String date(){
    	 LocalDate localDate = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
String formattedString = localDate.format(formatter);
return formattedString;// todays date
    }
    }
