/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Restaurant.Restaurant;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ankit
 */
public class ChooseRestaurantCmd implements Command
{
    Restaurant restaurant;
    
    public ChooseRestaurantCmd(Restaurant restaurant)
    {
      this.restaurant = restaurant; 
    }
    
    @Override 
    public void execute()
    {
      System.out.println("Executing Choose Restaurant Command");
    }
    
    @Override
    public void undo()
    {
     System.out.println("undo for Choose Restaurant Command");
    }
}
