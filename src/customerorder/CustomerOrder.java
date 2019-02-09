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
        
        System.out.println("Order Date : "+ o.getOrderDate());
        System.out.println("Order Number : "+ o.getOrderNumber());
        
        
        System.out.println("----------------");
        
        
        
        Custmore c = new Custmore("Kamaldeep", "Lassal");
        
        System.out.println("Customer Name : "+ c.getcnaame());
        System.out.println("Customer Locationr : "+ c.getclocation());
        c.sendOrder();
        c.orderRecieved();
       
        
        System.out.println("----------------");
        
        
        
        SpecialOrder so = new SpecialOrder("2019-2-5","189","2019-2-9","1895a");

        System.out.println("Special Order Date : "+ so.GetofDate());
        System.out.println("Special Order Number : "+ so.getofnumber());
        so.SP_dispatch();
        so.SP_recieve();
        
        System.out.println("----------------");
        
        
        
        
        NormalOrder no = new NormalOrder("2019-2-7","1895250","2019-2-9","1895a");
        
          System.out.println("Normal Order Date : "+ no.getODate());
        System.out.println("Normal Order number : "+ no.getOnumber());
        no.nO_dispatch();
        no.no_recieve();
        
        
        
    }
    
    
}
