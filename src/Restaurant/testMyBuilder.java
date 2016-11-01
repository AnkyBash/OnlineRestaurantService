/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author JeSe
 */
public class testMyBuilder {
    
    public static void main(String[]args){
              
        MealBuilder mealBuilder = new MealBuilder();
        
      Meal americanMeal = mealBuilder.americanTaste();
      americanMeal.showItems(); // display the meal created
      System.out.println("Total Cost: " + americanMeal.getDishPrice());
      
      System.out.println();
      
      Meal africanMeal = mealBuilder.africanTaste();
      africanMeal.showItems();
      System.out.println("Total Cost: " + africanMeal.getDishPrice());
    }
    
}
