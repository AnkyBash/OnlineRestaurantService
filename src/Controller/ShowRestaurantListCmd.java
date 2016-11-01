/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Organisation.Organisation;
import Restaurant.Meal;
import Restaurant.MealBuilder;
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
      System.out.println("\nAvailable Restaurants are: ");
      
      //getting a list of restaurant from database
      List<Restaurant> restaurantList = organisation.getRestaurantList();
      
      //loop through to print the restaurant list
      for(int i = 0; i < restaurantList.size(); i++)
      {
       System.out.println(i+" "+restaurantList.get(i).getRestaurantName() + "   " + restaurantList.get(i).getLocation());
      }
      
    }
   
    @Override
    public void undo()
    {
     System.out.println("No undo for userLogoutCmd");
    }        
}
