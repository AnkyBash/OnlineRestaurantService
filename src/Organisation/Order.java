/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import Bill.Observer;
import Restaurant.Dish;
import Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jo
 */
public class Order implements Subject, OrderInterface {

    private List<Observer> observers = new ArrayList<Observer>();
    private List<Dish> dishList = new ArrayList<Dish>();
    Restaurant restaurant;
    
    void setRestaurant(Restaurant r){
        restaurant = r;
    }
    
    
    //Classes to keep the Bill updated
    @Override
    public double getTotalPrice(){
        double price = 0;
        for (int i = 0; i < dishList.size();i++){
            price = price + dishList.get(i).getDishPrice();
        }
        return price;
    }
    @Override
    public String getRestaurantName(){
        if (restaurant != null)
            return restaurant.getRestaurantName();
        else
            return "No Restaurant Chosen";
    }
    @Override
    public String getRestaurantAdress(){
        if (restaurant != null)
            return restaurant.getLocation();
        else
            return "No Adress Chosen";
    }
    @Override
    public String getDishes(){
        String dishes = "\n";
        for (int i = 0; i < dishList.size();i++){
            dishes = dishes + dishList.get(i).getDishName() + "......" + dishList.get(i).getDishPrice() + "€\n";
        } 
        return dishes;
    }
    
    
    
    @Override
    public void addDishToOrder(Dish dishToAdd) {
        dishList.add(dishToAdd);
        notifyObservers();
    }
    
    @Override
    public List<Dish> getDishList() {
        return dishList;
    }
    
    @Override
    public void register(Observer obs) {
        observers.add(obs);
    }
    
    @Override
    public void unregister(Observer obs) {
        observers.remove(obs);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
    
}
