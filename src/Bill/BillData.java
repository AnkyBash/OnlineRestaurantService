/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Organisation.Subject;
import java.util.List;

/**
 *
 * @author Ih
 */
public class BillData implements Observer {
    double price = 0.0;
    List <String> orderedDishes;
    String restaurantName = "No Restaurant Chosen";
    String restaurantAdress = "No Adress Chosen";
    
    Subject observerSubject;
    
    public double getPrice(){
        return price;
    }
    public String getOrderedDishes(){
        return "";
    }
    public String getRestaurantName(){
        return restaurantName;
    }
    public String getRestaurantAdress(){
        return restaurantAdress;
    }


    @Override
    public void update() {
        System.out.println("The Bill has been updated");
    }
    
    @Override
    public void setSubject(Subject sub) {
        observerSubject = sub;
        observerSubject.register(this);
    }
}
