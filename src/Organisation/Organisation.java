/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;
import Restaurant.Restaurant; 
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ankit
 */
public class Organisation 
{
  private ArrayList<Restaurant> restaurantList;
  
  public List<Restaurant> getRestaurantList()
  {
   restaurantList = new ArrayList<Restaurant>();   
      
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
