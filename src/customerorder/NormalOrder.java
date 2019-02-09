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
public class NormalOrder extends Order {
     String date;
    String number;
    
    public NormalOrder(String date1,String number1,String odate,String onum)
    {
        super(odate,onum);
        date=date1;
        number=number1;
    }
 
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
        public void nO_dispatch()
    {
        System.out.println("Normal Order Dispatched..!");
    }
     public void no_recieve()
    {
        System.out.println("Normal Order Recieved..!");
    }
}

