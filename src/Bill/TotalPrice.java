/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

//import Restaurant.Dish;
import java.util.*;

/**
 *
 * @author Ih
 */
public class TotalPrice extends BillDecorator{
    
    private Bill aBill;
    private double dishPrice;
    public TotalPrice(BillInterface newBill) {
        super(newBill);
    }
   
    @Override
    public String getBill(){
        return tempBill.getBill() + "\n Total Price";
      
    }   
}