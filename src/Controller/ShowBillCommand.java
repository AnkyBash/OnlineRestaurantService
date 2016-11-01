/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Bill.Bill;
/**
 *
 * @author ankit
 */
public class ShowBillCommand implements Command 
{
    Bill bill;
    
     public ShowBillCommand(Bill bill)
    {
     this.bill = bill;
    }
    
    @Override 
    public void execute()
    {
      System.out.println(bill.getBill());
    }
    
    @Override
    public void undo()
    {
     System.out.println("Undo in AddDish Command");
    }    
}
