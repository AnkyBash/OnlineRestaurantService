/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import User.Customer;

/**
 *
 * @author Jo
 */
public class userLogoutCmd implements Command {
    
    Customer user;
    
    public userLogoutCmd(Customer customer) {
        this.user = customer;
    }

    @Override
    public void execute() {
        user.logout(user.getCustomerID(user.getName()));
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("There is no undo for the logout."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
