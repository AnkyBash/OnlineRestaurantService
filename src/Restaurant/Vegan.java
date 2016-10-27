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
public class Vegan implements NutritionForm{

    @Override
    public void suitableFor() {
        System.out.println("This meal is suitable for Vegans and Vegeterians. Did I tell you that I am vegan!");
    }
    
}
