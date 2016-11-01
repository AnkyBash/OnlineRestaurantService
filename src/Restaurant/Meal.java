/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.util.ArrayList;


/**
 *
 * @author JeSe
 */
public class Meal {
    
     private ArrayList<Dish> choosenMeals = new ArrayList<>();	
     private double cost = 0.0;
        
     public Meal(){}
    
     //method to add a Meal created by the Dish customer selected
   public void addItem(Dish item){
      choosenMeals.add(item);
   }

   //method get cost for the complete Meal pack choosen
   public double getDishPrice(){    
      for (Dish item : choosenMeals) {
         cost += item.getDishPrice();
      }		
      return cost;
   }
   
   //methods to print the type of  customise Meal
   public void showItems(){
   
      for (Dish item : choosenMeals) {
         System.out.print("You got " + item.getDishName());
         System.out.println(", Price is " + item.getDishPrice());
      }		
   }	
}
