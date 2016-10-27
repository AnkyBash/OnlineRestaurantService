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
public class DishFactory {
    
    //Singleton Pattern
    private static DishFactory INSTANCE = null;
    private DishFactory(){}
    
    public static DishFactory getInstance() {
	if (INSTANCE == null) {
            System.out.println("Created Dish Factory");
            INSTANCE = new DishFactory();
        } else 
            System.out.println("Dish Factory already exists!");
        
	return INSTANCE;
    }
        
    public Dish makeDish(DishType dishType, String name, double price){
        //TODO: constructors which make sense
        switch (dishType) {
            case FOOD:
                return new Food(name, price, new Regular());
                     
            case DESSERT:
                return new Dessert(name, price, new Regular());
                               
            case DRINK:
                return new Drink(name, price, new Regular());
            
            case FOOD_VEGAN:
                return new Food(name, price, new Vegan());
                     
            case DESSERT_VEGAN:
                return new Dessert(name, price, new Vegan());
            
            case FOOD_VEGETERIAN:
                return new Food(name, price, new Vegeterian());

            default:
                System.err.println("Wrong use of Dish Factory!"); return null;
        }
    }
}
