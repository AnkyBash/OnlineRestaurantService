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
public class userLoginCmd implements Command {
    Customer user;
    
    public userLoginCmd(Customer customer) {
        this.user = customer;
    }

    @Override
    public void execute() {
        user.login(user.getName(),user.getPassword());
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("There is no undo for the login."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
