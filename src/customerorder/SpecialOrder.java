/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerorder;

/**
 *
 * @author temp
 */
public class SpecialOrder {
    String Date;
    String number;
    
    public void SetofDate (String D)
    {
        Date = D;
    }
    public void setofnumber (String n)
    {
      number=n;
     
    }
    public String GetofDate()
    {        
            return Date;
    }
    public String getofnumber()
    {        
         return number;
    }
    public void Display()
    {        
     System.out.println("Special order Date ="+Date+" "+"Special order number =" +number);
     }
    }
