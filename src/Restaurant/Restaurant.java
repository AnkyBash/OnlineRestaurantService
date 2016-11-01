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
    private MealBuilder aMeal = new MealBuilder();
    
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
    
    //Method to display the various Meals list, choose a meal;
    public String view(){
        Scanner in = new Scanner(System.in);
        int i=0;
        ArrayList<String> checkMe = new ArrayList<>();
        String arrayView =""; // a variable to store the array dashboard;
        checkMe.add(getAfricanMeal()); //add African meal builder
        checkMe.add(getAmericanMeal()); 
        checkMe.add(getEuropeanMeal());
        checkMe.add(getMedittereanMeal());
        int selectedMealMix;
        
        // forloop to display type of available meal.
        for(String s : checkMe){
            arrayView = s; 
            System.out.println(i + " " + s);
            i++;
        }
        System.out.println();
        System.out.print("Please Choose Meal Type(0-3) : ");
        selectedMealMix = in.nextInt();
         for(int j = 0; j < countList(i); j++){
             if(selectedMealMix == j){
                 System.out.println(" Thank you. You Selected -> " + checkMe.get(j));
                 arrayView = checkMe.get(j);
                 
                 //check each selection with matching method of mealbuilder to call
                 switch(j){
                     case 0: Meal A = aMeal.africanTaste(); 
                                    A.showItems(); break;
                     case 1: Meal B = aMeal.americanTaste(); 
                                    B.showItems(); break;
                     case 2: Meal C = aMeal.europeanTaste();
                                     C.showItems();break;
                     case 3: Meal D = aMeal.medittereanTaste();
                                     D.showItems();break;
                     default:
                          System.out.print("New request, not yet added ");
                 }
             }             
         }
            countList(i); // get the arrayList checkMe

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
