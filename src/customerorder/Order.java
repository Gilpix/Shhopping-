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
}
