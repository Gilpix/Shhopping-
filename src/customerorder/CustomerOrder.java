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
public class CustomerOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
          Order o = new Order("1993-06-18", "1895a");
        o.setOrderDate("2019-2-9");
        o.setOrderNumber("a12bz");
        
        System.out.println("Order Date"+ o.getOrderDate());
        System.out.println("Order Number"+ o.getOrderNumber());
        
        
        
    }
    
    
}
