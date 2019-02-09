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
public class Custmore {
    
    String customerName;
    String customerLocation;
   
    
    public Custmore (String name ,String location)
    {
      
        customerName = name;
 
        customerLocation = location;
        
    }
    public  void setcName(String name)
    {
        customerName = name;
    }
    public String getcnaame()
    {
        return customerName;
    }
     public  void setclocation(String location)
     {
         customerLocation = location;
     }
      public String getclocation()
      {
          return customerLocation;
      }
      
     public void sendOrder()
    { 
            System.out.println("order sent");

    }
     
      public void orderRecieved()
    {
            System.out.println("order Recieved");

    }
}
