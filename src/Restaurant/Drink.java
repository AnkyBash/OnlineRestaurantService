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
public class Drink extends Dish {
    private boolean alcoholic;
    
     public Drink(String name, double price, boolean alc){
        super(name, price);
        
        alcoholic = alc;
        
        if (alcoholic) System.out.println("Created new alcoholic Drink: "+name+" "+price);
        else System.out.println("Created new nonaloholic Drink: "+name+" "+price);
    }
}
