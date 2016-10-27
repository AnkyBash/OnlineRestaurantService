/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

/**
 *
 * @author Ih
 */
public class DishList extends BillDecorator {
    // prints a string of the dishes in the order
    
    public DishList(BillInterface newBill) {
        super(newBill);
    }
      
    @Override
    public String getBill(){
        return " Dish 1";
    }   
    
}
