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
public class NormalOrder {
     String date;
    String number;
 
      public void SetODate(String od)
    {
        date=od;
    }
      public void SetOnumber(String num)
    {
        number=num;
    }
      
       public String getODate()
     {
         return date;
     }
       public String getOnumber()
     {
         return number;
     }
        public void Display()
      {
          System.out.println("Normal order Date ="+date+" "+ "Normal Order Number =" +number);
      }
}

