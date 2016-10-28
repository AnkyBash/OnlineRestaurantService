/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import Bill.Observer;



/**
 *
 * @author Ih
 */
public interface Subject {

    public void register(Observer obs);
    public void unregister(Observer obs);
    public void notifyObservers();
    
    //Classes to Update the Observer
    double getTotalPrice();
    String getRestaurantName();
    String getRestaurantAdress();
    String getDishes();
}
