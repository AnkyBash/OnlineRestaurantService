/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import User.Customer;
import java.util.Scanner;

/**
 *
 * @author Jo
 */
public class UserLoginCmd implements Command {
    Customer customer;
    
    public UserLoginCmd(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void execute() {
        //just for now trying scanner for console
        Scanner scanner = new Scanner(System.in);
        
        //Asking to enter user name and initialize name string
        System.out.println("Enter Username Please : ");
        String name = scanner.nextLine();
        customer.setName(name);
        
        //Asking to enter password and initialize password string
        System.out.println("Enter Password Please : ");
        String password = scanner.nextLine();
        customer.setPassword(password);
        
        //calling method login from user class
        if(customer.login())
        {
         System.out.println("Login Successful !");
        }
        else
         System.out.println("Unsuccessfull Login !");   
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("There is no undo for the login."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
