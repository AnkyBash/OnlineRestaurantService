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
//import java.util.ArrayList;

abstract public class BillDecorator implements BillInterface, Observer {
    double price = 0.0;
    List <String> orderedDishes;
    String restaurantName = "No Restaurant Chosen";
    String restaurantAdress = "No Adress Chosen";
    
    
    
    protected BillInterface tempBill;

    public BillDecorator(BillInterface newBill){
        tempBill = newBill;
    }
  
    @Override
    public String getBill(){
        return tempBill.getBill();
    }
    
    //for observer: 
    Subject observerSubject;
    
    @Override
    public void update() {
        System.out.println("The Order has been updated: Show list of dishes");
    }
    

    @Override
    public void setSubject(Subject sub) {
        observerSubject = sub;
        observerSubject.register(this);
    }
}