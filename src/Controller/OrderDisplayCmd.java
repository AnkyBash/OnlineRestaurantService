/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Bill.OrderDisplay;
import Organisation.Order;
/**
 *
 * @author ankit
 */
public class OrderDisplayCmd implements Command 
{
    Order order;
    
    public OrderDisplayCmd(Order order)
    {
      this.order = order;
    }
    
    @Override 
    public void execute()
    {
      System.out.println("\nOrder Display Command");
      OrderDisplay orderDisplay = new OrderDisplay();
      orderDisplay.setSubject(order);
    }
    
    @Override
    public void undo()
    {
     System.out.println("Undo in AddDish Command");
    } 
}
