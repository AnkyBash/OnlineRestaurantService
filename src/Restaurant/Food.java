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
public class Food extends Dish{
    
    
    public Food(String name, double price, NutritionForm nutritionForm){
        super(name, price, nutritionForm);
        System.out.println("Created new Main Course: "+name+" "+price);
    }
    
}
