/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;
import java.util.List;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ih
 */
public class Restaurant 
{
    private String restaurantName;
    private String location;
    private ArrayList<Meal> myPreferences = new ArrayList<>(); // arrayList to collate different type of Meals
    private MealBuilder aMeal;
      private MealBuilder n;
    
   //constructor method for restaurant
    public Restaurant(String restaurantName, String location)
    {
     this.restaurantName = restaurantName;
     this.location = location;
    }
    
    public Restaurant (MealBuilder m){
        this.aMeal = m;
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
    
    public MealBuilder getType(){
    return aMeal;    
   }
    
    public String getAfricanMeal(){
        return "African Meal";
    }
    
     public String getAmericanMeal(){
        return "American Meal";
    }
     
   public String getEuropeanMeal(){
        return "European Meal";
    }
    
    public String getMedittereanMeal(){
        return "Meditterean Meal";
    }
    
    //Method to display the various Meal to choose from which can be created
    public String view(){
        int i=0;
        ArrayList<String> checkMe = new ArrayList<>();
        String arrayView =""; // a variable to store the array dashboard;
        checkMe.add(0,getAfricanMeal()); //add African meal builder
        checkMe.add(1,getAmericanMeal()); 
        checkMe.add(2,getEuropeanMeal());
        checkMe.add(3,getMedittereanMeal());
   
        // forloop to display
        for(String s : checkMe){
            arrayView = s; 
            System.out.println(i + " " + s);
            i++;
        }
        countList(i);
       return  arrayView ;
    }
    
    //Method to get the size of the List Meal
    public int countList(int i){
       int j=0 ;
       for(int x =0; x < i; x++){
           j =i;
       }
       return j;
    }
    
}
