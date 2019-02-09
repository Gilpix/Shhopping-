/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerorder;

/**
 *
 * @author 1895250
 */
public class Order {
    
    String orderDate;
    String orderNumber;
    
    public Order(String date, String num)
    {
        orderDate = date;
        orderNumber = num;
    }
    
    public void setOrderDate(String date)
    {
        orderDate = date;
    }
    public void setOrderNumber(String num)
    {
        orderNumber = num;
    }
    
    public String getOrderDate()
    {
        return orderDate;
    }
    
    public String getOrderNumber()
    {
        return orderNumber;
    }
    
    public static void orderConfirmation(boolean amountPaid)
    {
       
        if(amountPaid==true)
            System.out.println("Order confirmed");
        else
            System.out.println("Order not confirmed");
            
       
    }
    
    public static void orderClose(boolean closeOrder)
    {
      
        if(closeOrder==true)
            System.out.println("Order confirmed");
        else
            System.out.println("Order not confirmed");
            
    }
    
    
}
