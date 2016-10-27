/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author Ih
 */
public class Taxes extends BillDecorator{
    private double tax = 0.2;
    
    public Taxes(Bill newBill) {
        super(newBill);
    }
    
    @Override
    public String getBill(){
        return tempBill.getBill() + "Taxes = " + round((data.getPrice()*tax),2)+ "€\n";       
    }   
 
}
