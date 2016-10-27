/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import java.util.ArrayList;
/**
 *
 * @author Ih
 */
public class OrderList extends BillDecorator {

    
    public OrderList(BillInterface newBill) {
        super(newBill);
    }
    
      
    @Override
    public String getBill(){
        return " Dish 1";
    }   
}
