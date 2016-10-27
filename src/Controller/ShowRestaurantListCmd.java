/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Organisation.Organisation;
import Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ankit
 */
public class ShowRestaurantListCmd implements Command
{
    private Organisation organisation;

    public ShowRestaurantListCmd(Organisation org)
    {
      this.organisation = org;
    }

    @Override
    public void execute() 
    {
      List<Restaurant> restaurantList = organisation.getRestaurantList();
      
      for(int i = 0; i < restaurantList.size(); i++)
      {
       System.out.println(i+" "+restaurantList.get(i).getRestaurantName() + "   " + restaurantList.get(i).getLocation());
      }
      
      Scanner scanner = new Scanner(System.in);
     
      System.out.print("Please Choose Restaurant(0-n) : ");
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
     System.out.println("No undo for userLogoutCmd");
    }        
}