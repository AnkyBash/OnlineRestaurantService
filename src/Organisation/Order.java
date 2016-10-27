/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import Bill.Observer;

/**
 *
 * @author ankit
 */
public class Order implements Observer {

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
