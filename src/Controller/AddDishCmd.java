/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Organisation.Order;
import Restaurant.Dish;
/**
 *
 * @author ankit
 */
public class AddDishCmd implements Command
{
    Order order;
    Dish dish;
    
    public AddDishCmd(Order order, Dish dish)
    {
     this.order = order;
     this.dish = dish;
    }
    
    @Override 
    public void execute()
    {
      System.out.println("\nAdd Dish Command : "+ dish.getDishName());
      order.addDishToOrder(dish);
    }
    
    @Override
    public void undo()
    {
     System.out.println("Undo in AddDish Command");
    }    
}
