/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Restaurant.Restaurant;

/**
 *
 * @author Ih
 */
public class RestaurantName extends BillDecorator {
    
    private Restaurant aName;
    
    public RestaurantName(Bill newBill) {
        super(newBill);
    }
    
    @Override
    public String getBill(){
        return tempBill.getBill() + data.getRestaurantName() + "\n";
    } 
}
