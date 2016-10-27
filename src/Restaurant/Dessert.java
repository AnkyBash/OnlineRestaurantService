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
public class Dessert extends Dish{
    
    Dessert(String name, double price) {
        super(name, price);
        System.out.println("Created new Dessert: "+name+" "+price);
    }
}
