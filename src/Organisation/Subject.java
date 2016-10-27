/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import Bill.Observer;
import Restaurant.Dish;

import java.util.List;


/**
 *
 * @author Ih
 */
public interface Subject {
    public void addDishToOrder(Dish dishToAdd);
    public List<Dish> getDishList();
    public void register(Observer obs);
    public void unregister(Observer obs);
    public void notifyObservers();
}
