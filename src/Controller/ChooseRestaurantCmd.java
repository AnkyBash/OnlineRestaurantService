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
    Organisation org;
    
    public ChooseRestaurantCmd(Restaurant restaurant)
    {
      this.restaurant = restaurant; 
    }
    
    @Override 
    public void execute()
    {
    /* Scanner scanner = new Scanner(System.in);
     
     System.out.print("Please Choose Restaurant(0-n) : ");
     String selectedRestaurant = scanner.nextLine();
     
    */
    }
    
    @Override
    public void undo(){};
}
