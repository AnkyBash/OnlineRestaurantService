/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import User.Customer;
/**
 *
 * @author ankit
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer abcCustomer = new Customer();
        
        UserLoginCmd loginCommand = new UserLoginCmd(abcCustomer);
        UserLogoutCmd logoutCommand = new UserLogoutCmd(abcCustomer); 
        
        Broker agent = new Broker();
        agent.takeCommand(loginCommand);
        agent.takeCommand(logoutCommand);
        agent.placeCommand();
        
        System.exit(0);
       // org.takeOrder(addItem);
       // org.takeOrder(addItem);
       // org.takeOrder(removeItem);
       // org.placeOrder();
    }
    
}
