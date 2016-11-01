/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Organisation.Order;
/**
 *
 * @author ankit
 */
public class ConfirmOrderCmd implements Command
{
    Order order;
    
    public ConfirmOrderCmd(Order order)
    {
     this.order = order;
    }
    
    @Override 
    public void execute()
    {
      System.out.println("Your Order Confirmed. Thanks for the Order");
    }
    
    @Override
    public void undo()
    {
     System.out.println("Undo in Confirm Order Command");
    }
}
