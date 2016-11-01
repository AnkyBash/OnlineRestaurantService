/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author Ih
 */
public class Restaurant 
{
    private String restaurantName;
    private String location;
    
    //constructor method for restaurant
    public Restaurant(String restaurantName, String location)
    {
     this.restaurantName = restaurantName;
     this.location = location;
    }
    
    //default constructor
    public Restaurant()
    {
    }
    
    //getter for restaurant name
    public String getRestaurantName() {
        return restaurantName;
    }
    
    //setter for restaurant name
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    //getter for location
    public String getLocation() {
        return location;
    }
    
    //setter for location
    public void setLocation(String location) {
        this.location = location;
    }
        
}
