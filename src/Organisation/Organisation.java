/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;
import Restaurant.Restaurant; 
import java.util.ArrayList;
import java.util.List;
import DataBase.DataBaseAccess;
/**
 *
 * @author ankit
 */
public class Organisation 
{
  DataBaseAccess da;
  
  public List<Restaurant> getRestaurantList()
  {
   da = new DataBaseAccess();
   
   return da.getRestaurantList();
  }
}
