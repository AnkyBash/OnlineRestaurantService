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
public class MealBuilder {
    
    private Meal meal; // declare Meal variable
    NutritionForm form; // declare nutritionform variable.
    
    //Method to create American dish type
    public Meal americanTaste(){
        System.out.println("Creating American Meal.... ");
      meal = new Meal();
      meal.addItem(new Food("HotDog", 8, form)); //add a type of American food
      meal.addItem( new Drink("Pepsi", 3, form)); // add a type of American taste
      meal.addItem(new Dessert("Candy", 5, form)); // add a type of American Dessert
      return meal;
   }   

    //Method to create European dish type
   public Meal europeanTaste(){
       System.out.println("Creating European Meal....");
      meal = new Meal();
      meal.addItem( new Food("NiceSalad", 6, form));
      meal.addItem( new Drink("Coke", 2, form));
      meal.addItem( new Dessert("Iced Pavilova", 7, form));
      
      return meal;
   }
   
   //Method to create Meditterean dish type
   public Meal medittereanTaste(){
       System.out.println("Creating Meditterean Meal....");
      meal = new Meal();
      meal.addItem(new Food("Potatoes", 5, form)); // create a mediterrean meal type as specify
      meal.addItem(new Drink("Fanta", 3, form));
      meal.addItem(new Dessert("SweetEgg", 1.20, form));
      return meal;
   }
   
   //Method to create African dish type
   public Meal africanTaste(){
       System.out.println("Creating African Meal... ");
      meal = new Meal();
      meal.addItem(new Food("Rice", 8, form));
      meal.addItem(new Drink("Palm Wine", 10, form));
      meal.addItem(new Dessert("SweetCakeAfrican", 5, form)); // create a dessert specify
      return meal;
   }

}
