/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

/**
 *
 * @author Jo
 */
public class OrderTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BillInterface bill = new Taxes(new TotalPrice( new RestaurantName ( new Bill())));
        System.out.println(bill.getBill());
    }
    
}
