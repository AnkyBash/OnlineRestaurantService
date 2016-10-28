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
public class TotalPrice extends BillDecorator{
    
    public TotalPrice(Bill newBill) {
        super(newBill);
    }
   
    @Override
    public String getBill(){
        return tempBill.getBill() + "______________________________\nTotal = " + data.getPrice() + "€\n";
      
    }   
}
