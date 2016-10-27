/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import java.util.*;
/**
 *
 * @author Ih
 */
public class Taxes extends BillDecorator{

    
    public Taxes(BillInterface newBill) {
        super(newBill);
    }
    
    @Override
    public String getBill(){
        return tempBill.getBill() + " \n Taxes are: ";
                
    }   
 
}
