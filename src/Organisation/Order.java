/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import Bill.Observer;
import Restaurant.Dish;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jo
 */
public class Order implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private List<Dish> dishList = new ArrayList<Dish>();
    
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
