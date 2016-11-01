/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Organisation.Organisation;
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
      System.out.println("\nExecuting Choose Restaurant Command");
      Organisation org = new Organisation();  
      List<Restaurant> restaurantList = org.getRestaurantList();
      
      Scanner scanner = new Scanner(System.in);
     
      System.out.print("\nPlease Select Restaurant(0-n) : ");
      int selectedRestaurant = scanner.nextInt();
      System.out.println();
      
      for(int i = 0; i < restaurantList.size(); i++)
      {
       if(selectedRestaurant == i)
       {System.out.println("Welcome ! You selected "+restaurantList.get(i).getRestaurantName());}
      }
    }
    
    @Override
    public void undo()
    {
     System.out.println("undo for Choose Restaurant Command");
    }
}
