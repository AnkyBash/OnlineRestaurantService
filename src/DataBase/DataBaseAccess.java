/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author ankit
 */
public class DataBaseAccess 
{
    //checking database to verify username and password
    public boolean login(String uName, String password)
    {
        //hardcode username and password
        //return true;
        return uName.equals("ankit") && password.equals("ankit");
    }
    
    //checking database user is valid or not by supplying customerID
    public boolean isUser(String customerId)
    {
        return customerId.equals("u1");
    }
    
    //getting customerID by name in database
    public String getCustomerID(String name)
    {
     if(name.equals("ankit"))
     {  return "u1";}
     else return "Error";
    }
    
    //getting restaurant list
    public ArrayList<Restaurant> getRestaurantList()
    {
        ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();   
      
        Restaurant R1 = new Restaurant("Lana Asian Cuisine","Castletroy");
        Restaurant R2 = new Restaurant("Jumbo Chinese","Groody Centre");
        Restaurant R3 = new Restaurant("Bambu","Limerick");
        Restaurant R4 = new Restaurant("Four Star Pizza","Limerick");
        Restaurant R5 = new Restaurant("Spice of India","Limerick");
   
        restaurantList.add(R1);
        restaurantList.add(R2);
        restaurantList.add(R3);
        restaurantList.add(R4);
        restaurantList.add(R5);
   
        return restaurantList;
    }
}
